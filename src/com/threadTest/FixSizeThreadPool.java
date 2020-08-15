package com.threadTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;


/**
 * 自定义线程池类
 * @author Administrator
 *
 */
public class FixSizeThreadPool {

	//仓库存放任务
	private BlockingQueue<Runnable> blockingQueue;
	//线程的集合
	private List<Thread> workers;
	//具体的线程
	public static class worker extends Thread{
		private FixSizeThreadPool pool;
		public worker(FixSizeThreadPool pool) {
			this.pool = pool;
		}
		@Override
		public void run() {
			// 不断从队列拿出任务去执行
			while(this.pool.isWorking || this.pool.blockingQueue.size() > 0) {//如果还在执行或者关闭后还有任务
				Runnable task = null;//Runnable任务
				try {
					if (this.pool.isWorking) {						
						task = this.pool.blockingQueue.take();//从当前线程池所在的仓库中里取任务，没有任务会发生阻塞等待
					}else {
						task = this.pool.blockingQueue.poll();//从当前线程池所在的仓库中里取任务，没有任务不会阻塞
					
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (task != null) {
					task.run();//执行任务
					System.out.println("线程" + Thread.currentThread().getName() + "运行了");
				}
			}
		}
	}
	
	//初试化线程池规定线程数量及仓库大小
	public FixSizeThreadPool(int poolSize, int taskSize) {
		// TODO Auto-generated constructor stub
		if (poolSize <= 0 || taskSize <= 0) {
			throw new IllegalArgumentException("非法参数");
		}
		 this.blockingQueue = new LinkedBlockingDeque<>(taskSize);
		 this.workers = Collections.synchronizedList(new ArrayList<>());
		 
		 for (int i = 0; i < poolSize; i++) {
			worker worker = new worker(this);
			worker.start();
			workers.add(worker);
		}
	}
	
	//引导客人去排队
	public boolean submit(Runnable task) {
		if (isWorking) {//正在执行
			return this.blockingQueue.offer(task);//入队
		}else {//线程池关闭后，停止入队
			return false;
		}
	}
	
	//关闭的方法
	//停止入队
	//仓库中如果还有任务，需要执行完
	//关闭后去仓库中拿任务，不应该阻塞
	//一旦任务被阻塞了，需要中断阻塞
	private volatile boolean isWorking = true;
	public void shutDown() {
		this.isWorking = false;
		for (Thread thread : workers) {
			if (Thread.State.BLOCKED.equals(thread.getState())) {//一旦任务被阻塞了，需要中断阻塞
				thread.interrupt();//中断被阻塞的线程
			}
		}
	}
	
	public static void main(String[] args) {
		FixSizeThreadPool pool = new FixSizeThreadPool(3, 6);
		for (int i = 0; i < 6; i++) {
			pool.submit(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("放入一个线程");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("一个线程被唤醒");
					}
				}
			});
		}
		pool.shutDown();
	}
}

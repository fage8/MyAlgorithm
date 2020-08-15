package com.threadTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;


/**
 * �Զ����̳߳���
 * @author Administrator
 *
 */
public class FixSizeThreadPool {

	//�ֿ�������
	private BlockingQueue<Runnable> blockingQueue;
	//�̵߳ļ���
	private List<Thread> workers;
	//������߳�
	public static class worker extends Thread{
		private FixSizeThreadPool pool;
		public worker(FixSizeThreadPool pool) {
			this.pool = pool;
		}
		@Override
		public void run() {
			// ���ϴӶ����ó�����ȥִ��
			while(this.pool.isWorking || this.pool.blockingQueue.size() > 0) {//�������ִ�л��߹رպ�������
				Runnable task = null;//Runnable����
				try {
					if (this.pool.isWorking) {						
						task = this.pool.blockingQueue.take();//�ӵ�ǰ�̳߳����ڵĲֿ�����ȡ����û������ᷢ�������ȴ�
					}else {
						task = this.pool.blockingQueue.poll();//�ӵ�ǰ�̳߳����ڵĲֿ�����ȡ����û�����񲻻�����
					
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (task != null) {
					task.run();//ִ������
					System.out.println("�߳�" + Thread.currentThread().getName() + "������");
				}
			}
		}
	}
	
	//���Ի��̳߳ع涨�߳��������ֿ��С
	public FixSizeThreadPool(int poolSize, int taskSize) {
		// TODO Auto-generated constructor stub
		if (poolSize <= 0 || taskSize <= 0) {
			throw new IllegalArgumentException("�Ƿ�����");
		}
		 this.blockingQueue = new LinkedBlockingDeque<>(taskSize);
		 this.workers = Collections.synchronizedList(new ArrayList<>());
		 
		 for (int i = 0; i < poolSize; i++) {
			worker worker = new worker(this);
			worker.start();
			workers.add(worker);
		}
	}
	
	//��������ȥ�Ŷ�
	public boolean submit(Runnable task) {
		if (isWorking) {//����ִ��
			return this.blockingQueue.offer(task);//���
		}else {//�̳߳عرպ�ֹͣ���
			return false;
		}
	}
	
	//�رյķ���
	//ֹͣ���
	//�ֿ����������������Ҫִ����
	//�رպ�ȥ�ֿ��������񣬲�Ӧ������
	//һ�����������ˣ���Ҫ�ж�����
	private volatile boolean isWorking = true;
	public void shutDown() {
		this.isWorking = false;
		for (Thread thread : workers) {
			if (Thread.State.BLOCKED.equals(thread.getState())) {//һ�����������ˣ���Ҫ�ж�����
				thread.interrupt();//�жϱ��������߳�
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
					System.out.println("����һ���߳�");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("һ���̱߳�����");
					}
				}
			});
		}
		pool.shutDown();
	}
}

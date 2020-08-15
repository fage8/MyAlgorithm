package com.myHandwrittenCode;


import java.util.concurrent.Semaphore;

/**
 * 阿里新零售金融面试题(正确做法)
 * 如下程序通过N个线程顺序循环打印从0至100，
	如给定N=3则输出： 
	thread0: 0
	thread1: 1
	thread2: 2
	thread0: 3
	thread1: 4
	..
	注意线程号与输出顺序间的关系

 * @author Administrator
 *
 */
public class ThreadOrderOutput{

	// 同步关键类，构造方法传入的数字是多少，则同一个时刻，只运行多少个进程同时运行制定代码
    static final Semaphore sem = new Semaphore(1);
	/**
     * 在 semaphore.acquire() 和 semaphore.release()之间的代码，同一时刻只允许制定个数的线程进入，
     * 因为semaphore的构造方法是1，则同一时刻只允许一个线程进入，其他线程只能等待。
     * */

    static int count = 0;

    static class Thread0 implements Runnable {

        @Override
        public void run() {
            try {
                while (count <= 100) {
                    sem.acquire();
                    if (count % 3 == 0 && count <= 100) {//必须加count <= 100
                        System.out.println(Thread.currentThread().getName() + ":" + count);
                        count++;//必须在if语句里面
                    }
                    sem.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            try {
                while (count <= 100 ) {
                    sem.acquire();
                    if (count % 3 == 1 && count <= 100) {
                        System.out.println(Thread.currentThread().getName() + ":" + count);
                        count++;
                    }
                    sem.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            try {
                while (count <= 100) {
                    sem.acquire();
                    if (count % 3 == 2 && count <= 100) {
                        System.out.println(Thread.currentThread().getName() + ":" + count);
                        count++;
                    }
                    sem.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Thread0(), "thread0").start();//进程Thread0中的线程thread0
        new Thread(new Thread1(), "thread1").start();
        new Thread(new Thread2(), "thread2").start();
    }
}



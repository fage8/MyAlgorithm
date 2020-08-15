package com.myHandwrittenCode;


import java.util.concurrent.Semaphore;

/**
 * ���������۽���������(��ȷ����)
 * ���³���ͨ��N���߳�˳��ѭ����ӡ��0��100��
	�����N=3������� 
	thread0: 0
	thread1: 1
	thread2: 2
	thread0: 3
	thread1: 4
	..
	ע���̺߳������˳���Ĺ�ϵ

 * @author Administrator
 *
 */
public class ThreadOrderOutput{

	// ͬ���ؼ��࣬���췽������������Ƕ��٣���ͬһ��ʱ�̣�ֻ���ж��ٸ�����ͬʱ�����ƶ�����
    static final Semaphore sem = new Semaphore(1);
	/**
     * �� semaphore.acquire() �� semaphore.release()֮��Ĵ��룬ͬһʱ��ֻ�����ƶ��������߳̽��룬
     * ��Ϊsemaphore�Ĺ��췽����1����ͬһʱ��ֻ����һ���߳̽��룬�����߳�ֻ�ܵȴ���
     * */

    static int count = 0;

    static class Thread0 implements Runnable {

        @Override
        public void run() {
            try {
                while (count <= 100) {
                    sem.acquire();
                    if (count % 3 == 0 && count <= 100) {//�����count <= 100
                        System.out.println(Thread.currentThread().getName() + ":" + count);
                        count++;//������if�������
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
        new Thread(new Thread0(), "thread0").start();//����Thread0�е��߳�thread0
        new Thread(new Thread1(), "thread1").start();
        new Thread(new Thread2(), "thread2").start();
    }
}



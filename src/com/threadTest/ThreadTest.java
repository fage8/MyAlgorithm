package com.threadTest;

public class ThreadTest implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest mThreadTest = new ThreadTest();
//		mThreadTest.start();
		new Thread(mThreadTest).start();
	}
	
	@Override
	public void run() {//�߳��壬Ҳ���߳�ִ�е�����
		// TODO Auto-generated method stub
		System.out.println("ִ��");
	}

}

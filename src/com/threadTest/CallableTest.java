package com.threadTest;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Callable<String> callable = new Callable<String>() {//泛型获取返回值
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				Random random = new Random();
				return "返回：" + random.nextInt(100);
			}
		};

		FutureTask<String> futureTask = new FutureTask<String>(callable);
		new Thread(futureTask).start();
		
		String reString = futureTask.get();//调用call()
		System.out.println(reString);
	}

}

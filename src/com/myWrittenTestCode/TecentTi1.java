package com.myWrittenTestCode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * (正确做法)
 * 手写实现queue的PUSH，POP(没有输出-1)，TOP（输出队头元素，没有输出-1），SZIE（输出元素个数），CLEAR
 * @author Administrator
 *
 */
public class TecentTi1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();//测试数据组数
	    for (int i = 0; i < T; i++) {
	        Queue<Integer> queue = new LinkedList<Integer>();//每组操作初始队列是空的
	        int Q = sc.nextInt();//操作数的个数
	        for (int j = 0; j < Q; j++) {
	            String str = sc.next();
	            if (str.equals("PUSH")) {
	                int num = sc.nextInt();
	                queue.offer(num);
	            }else if (str.equals("TOP")) {
	                if (queue.size() > 0) {
	                    System.out.println(queue.peek());
	                }else {
	                    System.out.println(-1);
	                }
	            }else if (str.equals("POP")) {
	                if (queue.size() > 0) {
	                    queue.poll();
	                }else {
	                    System.out.println(-1);
	                }
	            }else if (str.equals("SIZE")) {
	                System.out.println(queue.size());
	            }else if(str.equals("CLEAR")) {
	                queue.clear();
	            }
	        }
	    }
	    sc.close();
	}

}

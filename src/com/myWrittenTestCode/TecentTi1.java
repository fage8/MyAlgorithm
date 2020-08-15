package com.myWrittenTestCode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * (��ȷ����)
 * ��дʵ��queue��PUSH��POP(û�����-1)��TOP�������ͷԪ�أ�û�����-1����SZIE�����Ԫ�ظ�������CLEAR
 * @author Administrator
 *
 */
public class TecentTi1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();//������������
	    for (int i = 0; i < T; i++) {
	        Queue<Integer> queue = new LinkedList<Integer>();//ÿ�������ʼ�����ǿյ�
	        int Q = sc.nextInt();//�������ĸ���
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

package com.myWrittenTestCode;

import java.util.Scanner;
import java.util.Stack;
/**
 * (��ȷ����)
 * ����ջʵ�ֶ��У�add���ӣ�poll���ӣ�peek�����ͷ
 * @author Administrator
 *
 */
public class TecentTi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    	Stack<Integer> stack1 = new Stack<Integer>();
    	Stack<Integer> stack2 = new Stack<Integer>();
    	//add()��remove()������ʧ�ܵ�ʱ����׳��쳣(���Ƽ�)
        for (int i = 0; i < n; i++) {
			String s = scanner.next();
			if (s.equals("add")) {
				int a = scanner.nextInt();
				stack1.push(a);
			}
			if (s.equals("poll")) {
				if (stack2.size() == 0) {
					while (stack1.size() != 0) {
						stack2.push(stack1.pop());
					}
				}
				if (stack1.size() + stack2.size() == 0) {
					System.out.println(-1);//��Ϊ�գ����-1
				}else {
					stack2.pop();//���stack2Ϊ������ջ���ٳ���ͷ����Ϊ��ֱ�ӳ���ͷ
				}
			}
			if (s.equals("peek")) {	
				if (stack2.size() == 0) {
					while (stack1.size() != 0) {
						stack2.push(stack1.pop());
					}
				}
				if (stack1.size() + stack2.size() == 0) {
					System.out.println(-1);///��Ϊ�գ����-1
				}else {
					System.out.println(stack2.peek());
				}
			}
		}


	}

}

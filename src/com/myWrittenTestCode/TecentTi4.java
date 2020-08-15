package com.myWrittenTestCode;

import java.util.Scanner;
import java.util.Stack;
/**
 * (正确做法)
 * 两个栈实现队列，add进队，poll出队，peek输出队头
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
    	//add()和remove()方法在失败的时候会抛出异常(不推荐)
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
					System.out.println(-1);//队为空，输出-1
				}else {
					stack2.pop();//如果stack2为空先入栈，再出队头，不为空直接出队头
				}
			}
			if (s.equals("peek")) {	
				if (stack2.size() == 0) {
					while (stack1.size() != 0) {
						stack2.push(stack1.pop());
					}
				}
				if (stack1.size() + stack2.size() == 0) {
					System.out.println(-1);///队为空，输出-1
				}else {
					System.out.println(stack2.peek());
				}
			}
		}


	}

}

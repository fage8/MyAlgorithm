package com.myWrittenTestCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;
import java.util.Stack;
/**
 * 
 * �沨�����ʽ���������ʵ��+��-��*��/,undo��clear����
 * undo�����е����⣬�޷���ȡ�ϴα����list���������
 * @author Administrator
 *
 */
public class BaixinwangTi1 {
	
    static List<String> list = new ArrayList<String>();//��Ϊ���뵽stack�ַ����Ļ���
    static Stack<String> stack = new Stack<String>();
	static Stack<String> stack2 = new Stack<String>();//���ջ
	public static void main(String[] args) {
		// �ȶ���һ���沨�����ʽ
		// (3+4)*5-6 => 3 4 + 5 *6 - = 29
		// Ϊ�˷��㣬���ֺͷ���ʹ�ÿո���
		Scanner sc = new Scanner(System.in);
		

		while (sc.hasNext()) {
			String suffixExpression = sc.nextLine();
			// ˼·
			// 1.�Ƚ����ʽ���� ArrayList ��
			// 2.�� ArrayList ���ݸ�һ������������ Arraylist,���ջ����ɼ���
			List<String> list = getListString(suffixExpression);
			System.out.println("List=" + list);
			
			ArrayList<Integer> res = calculate(list);
			Collections.reverse(res);
			System.out.println("stack��" + res);
		}
	}
	
	// ��һ���沨�����ʽ�����ν����ݺ���������뵽 ArrayList��
	 public static List<String> getListString(String suffixExpression) {
		 // �� ���ʽ�ָ�
		 String[] split = suffixExpression.split(" ");

	     for (String ele : split) {
	    	 list.add(ele);
		 }
	     return list;
	 }
	
	// ��ɶ��沨�����ʽ�ļ���
	/*
	* 1)��������ɨ�裬��3��4ѹ���ջ 
	* 2)����+���������˵���4��3��4Ϊջ��Ԫ�أ�3Ϊ�ζ�Ԫ�أ��������3+4��ֵ����7���ٽ�7��ջ�� 
	* 3)��5��ջ��
	* 4)�������ǡ����������˵���5��7�������7��5=35����35��ջ�� 
	* 5)��6��ջ�� 
	* 6)�����-������������35-6��ֵ����29���ɴ˵ó����ս��
	*/

	public static ArrayList<Integer> calculate(List<String> ls) {
		  // ����һ��ջ��ֻ��Ҫһ��ջ
		  // ���� ls
		  for (String item : ls) {
		      // ʹ��������ʽ��ȡ����
			  try {
				
				  if (item.matches("\\d+")) { // ƥ����Ƕ�λ����\d��ʾ���֣�+��ʾ 1������
					  // ��ջ
					  stack.push(item);
				  } else {
					  // pop��0,1,2����������,����ջ
					  int num2 = Integer.parseInt(stack.pop());
					  int res = 0;
					  if (item.equals("+")) {
						  int num1 = Integer.parseInt(stack.pop());
						  res = num1 + num2;
						  stack.push(res + "");
					  } else if (item.equals("-")) {
						  int num1 = Integer.parseInt(stack.pop());
						  res = num1 - num2;
						  stack.push(res + "");
					  } else if (item.equals("*")) {
						  int num1 = Integer.parseInt(stack.pop());
						  res = num1 * num2;
						  stack.push(res + "");
					  } else if (item.equals("/")) {
						  int num1 = Integer.parseInt(stack.pop());
						  res = num1 / num2;
						  stack.push(res + "");
					  } else if (item.equals("sqrt")) {
						  res = (int) Math.sqrt(num2);
						  stack.push(res + "");
					  }else if (item.equals("clear")) {
						  stack.clear();
					  }else if (item.equals("undo")) {
//			    	   stack.pop();
//						  stack.push(String.valueOf(num2));
//						  return calculate(list.subList(0, list.size()-1));
					  }else {
						  throw new RuntimeException("���������");
					  }
				  }
			} catch (Exception e) {
				System.out.println("insucient parameters");
			}
		}
		 List<Integer> outlist = new ArrayList<Integer>();//��Ϊ���ֵ�Ļ���
		// �������stack�е����ݾ���������
		  while(!stack.isEmpty()) {	

			  stack2.push(stack.pop());
			  outlist.add(Integer.parseInt(stack2.pop()));
		}
		return (ArrayList<Integer>) outlist;
	}
}

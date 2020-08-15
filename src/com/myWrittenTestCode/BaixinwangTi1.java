package com.myWrittenTestCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;
import java.util.Stack;
/**
 * 
 * 逆波兰表达式计算机器，实现+，-，*，/,undo，clear功能
 * undo功能有点问题，无法读取上次保存的list，进行输出
 * @author Administrator
 *
 */
public class BaixinwangTi1 {
	
    static List<String> list = new ArrayList<String>();//作为输入到stack字符串的缓冲
    static Stack<String> stack = new Stack<String>();
	static Stack<String> stack2 = new Stack<String>();//间接栈
	public static void main(String[] args) {
		// 先定义一个逆波兰表达式
		// (3+4)*5-6 => 3 4 + 5 *6 - = 29
		// 为了方便，数字和符号使用空格间隔
		Scanner sc = new Scanner(System.in);
		

		while (sc.hasNext()) {
			String suffixExpression = sc.nextLine();
			// 思路
			// 1.先将表达式放入 ArrayList 中
			// 2.将 ArrayList 传递给一个方法，遍历 Arraylist,配合栈，完成计算
			List<String> list = getListString(suffixExpression);
			System.out.println("List=" + list);
			
			ArrayList<Integer> res = calculate(list);
			Collections.reverse(res);
			System.out.println("stack：" + res);
		}
	}
	
	// 将一个逆波兰表达式，依次将数据和运算符放入到 ArrayList中
	 public static List<String> getListString(String suffixExpression) {
		 // 将 表达式分割
		 String[] split = suffixExpression.split(" ");

	     for (String ele : split) {
	    	 list.add(ele);
		 }
	     return list;
	 }
	
	// 完成对逆波兰表达式的计算
	/*
	* 1)从左至右扫描，将3和4压入堆栈 
	* 2)遇到+运算符，因此弹出4和3（4为栈顶元素，3为次顶元素），计算出3+4的值，得7，再将7入栈； 
	* 3)将5入栈；
	* 4)接下来是×运算符，因此弹出5和7，计算出7×5=35，将35入栈； 
	* 5)将6入栈； 
	* 6)最后是-运算符，计算出35-6的值，即29，由此得出最终结果
	*/

	public static ArrayList<Integer> calculate(List<String> ls) {
		  // 创建一个栈，只需要一个栈
		  // 遍历 ls
		  for (String item : ls) {
		      // 使用正则表达式来取出数
			  try {
				
				  if (item.matches("\\d+")) { // 匹配的是多位数，\d表示数字，+表示 1个或多个
					  // 入栈
					  stack.push(item);
				  } else {
					  // pop出0,1,2个数并运算,再入栈
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
						  throw new RuntimeException("运算符有误");
					  }
				  }
			} catch (Exception e) {
				System.out.println("insucient parameters");
			}
		}
		 List<Integer> outlist = new ArrayList<Integer>();//作为输出值的缓冲
		// 最后留在stack中的数据就是运算结果
		  while(!stack.isEmpty()) {	

			  stack2.push(stack.pop());
			  outlist.add(Integer.parseInt(stack2.pop()));
		}
		return (ArrayList<Integer>) outlist;
	}
}

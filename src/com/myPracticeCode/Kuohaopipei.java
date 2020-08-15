package com.myPracticeCode;

import java.util.Scanner;

/**
 * (正确做法)
 * 输入一组运算，输出小括号匹配对数，单独左括号个数，单独右括号个数
 * @author Administrator
 *
 */
public class Kuohaopipei {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	String s = sc.nextLine();
        	
        	int left = 0, right = 0,dui =0;
        	for (int i = 0; i < s.length(); i++) {
        		int curr = s.charAt(i);
//        		if (curr == '(' || curr == ')') {
//					count++;
//				}
        		if (curr == '(') {
        			left++;
        		} else if (curr == ')') {
        			if (left != 0) {
        				dui++;//关键地方
        				left--;
        			} else {
        				right++;
        			}
        		}
        	}
//        	int dui = (count - left - right)/2;
        	System.out.println(dui + " " + left + " " + right);
		}
	}

}

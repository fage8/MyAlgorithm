package com.myPracticeCode;

import java.util.Scanner;

/**
 * (��ȷ����)
 * ����һ�����㣬���С����ƥ����������������Ÿ��������������Ÿ���
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
        				dui++;//�ؼ��ط�
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

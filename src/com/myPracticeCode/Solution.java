package com.myPracticeCode;

/**
 * a-z,0-9组成的三位密码，请问输出所有的密码组合
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		 char a, b, c;
		 for (a = '0'; a <= 'z'; a++) {
			 for (b = '0'; b <= 'z'; b++) {
				 for (c = '0'; c <= 'z'; c++) {
					 System.out.print(a);
					 System.out.print(b);
					 System.out.print(c);
					 System.out.print(" ");
					 if (c == '9') {
						 c = 'a' - 1;
					 }
				 }
				 System.out.println();
				 if (b == '9') {
					 b = 'a' - 1;
				 }
			 }
			 if (a == '9') {
				 a = 'a' - 1;
			 }
		 }
	}
}

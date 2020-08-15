package com.myPracticeCode;

import java.util.Scanner;
/**
 * 求十进制数的二进制表达形式中的1的个数
 * @author Administrator
 *
 */
public class NumberOf1 {
	public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            count++;
            num = num & (num - 1);
        }
        System.out.println(count);
    }
}

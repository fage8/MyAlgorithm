package com.myPracticeCode;

import java.util.Scanner;
/**
 * ��ʮ�������Ķ����Ʊ����ʽ�е�1�ĸ���
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

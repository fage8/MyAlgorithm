package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ��ת�ַ�������ȷ������
 * @author Administrator
 *
 */
public class DOUYU1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder stringBuilder = new StringBuilder(str);
		System.out.println(stringBuilder.reverse().toString());
	}
}

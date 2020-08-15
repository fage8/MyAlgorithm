package com.myPracticeCode;

import java.util.Scanner;
/**
 * 求字符串的全排列
 * 输入
 * abc
 * 输出
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 * @author Administrator
 *
 */
public class StringPaiLie {
	private static void permutation(char[] ch, int begin) {
		if (begin == ch.length) {
			System.out.println(ch);
		}else {
			for (int i = begin; i < ch.length; i++) {
				char tmp = ch[begin];
				ch[begin] = ch[i];
				ch[i] = tmp;
				permutation(ch, begin + 1);
				
				tmp = ch[begin];
				ch[begin] = ch[i];
				ch[i] = tmp;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			char[] ch = string.toCharArray();
			permutation(ch, 0);
		}
 	}

}

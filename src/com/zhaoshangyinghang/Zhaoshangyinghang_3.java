package com.zhaoshangyinghang;

import java.util.Scanner;

public class Zhaoshangyinghang_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 0) {
			StringBuffer b = new StringBuffer();
			for (int i = 0; i < n; i++) {
				b.append(sc.nextInt());
			}
			findNoNumber(b.toString());
		}
	}
	/**
	 *找到未出现在该子序列中的数
	 *@param s 
	 */
	private static void findNoNumber(String s) {
		if (s == null || s.length() == 0) {
			return;
		}
		for (int i = 0; i <= s.length(); i++) {
			if (!s.contains("" + i +"")) {
				System.out.println(i);
				return;
			}
		}
	}
}

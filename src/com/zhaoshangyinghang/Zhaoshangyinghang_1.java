package com.zhaoshangyinghang;

import java.util.Scanner;

public class Zhaoshangyinghang_1 {
	public Scanner cin = new Scanner(System.in);
	Zhaoshangyinghang_1(){
		while (cin.hasNext()) {
			String str = cin.next();
			int ans = str.length() - 1;
			for (int i = 0; ans > 0; ans--) {
				for(i = 0; str.length() % ans == 0 && i < str.length()
						&& str.charAt(i) == str.charAt(i % ans); i++) {
					
				}
				if (i == str.length()) {
					break;
				}
			}
			System.out.println(ans != 0 ? str.substring(0, ans) : "false");
		}
	}
	public static void main(String[] args) {
		new Zhaoshangyinghang_1();
	}
}

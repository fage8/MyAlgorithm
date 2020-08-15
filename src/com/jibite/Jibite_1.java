package com.jibite;

import java.util.Scanner;

public class Jibite_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int num = n ^ m;
		int count = 0;
		while (num != 0) {
			count++;
			num = (num - 1) & num;
		}
		System.out.println(count);
	}
}

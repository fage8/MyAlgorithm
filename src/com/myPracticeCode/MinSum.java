package com.myPracticeCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 有两个相同大小的数组 各取一个元素 使得两个元素的和最小且两个元素的索引不同
 * @author Administrator
 *
 */
public class MinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[] s1 = scanner.nextLine().split(" ");
			String[] s2 = scanner.nextLine().split(" ");
			int[] a1 = new int[s1.length];
			int[] a2 = new int[s2.length];
			for (int i = 0; i < s2.length; i++) {
				a1[i] = Integer.valueOf(s1[i]);
				a2[i] = Integer.valueOf(s2[i]);
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a2.length; j++) {				
					if (a1[i] + a2[j] < min && i != j) {
						min = a1[i] + a2[j];
					}
				}
			}
			System.out.println(min);
		}
	}

}

package com.souhuchangyou;

import java.util.ArrayList;
import java.util.Scanner;

public class Souhuchangyou_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {//循环输入
			int n = sc.nextInt();
			int[] arr = new int[n];//不需要用完手动delete释放内存，有自动回收机制
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int page = sc.nextInt();
			int num = sc.nextInt();
			if (page > n / num - 1) {//页号从0开始
				System.out.println("输入页数超出范围");
			}
			for (int i = page * num; i < page * num + num; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

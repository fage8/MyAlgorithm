package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 还未做出来
 * 小G探索仙境，每一条路都需要消耗一定的机缘，为了尽量少的消耗机缘，每一个地点至多经过两次，那么要浏览所有的地点，至少需要多少机缘?
 * 第一行n，m。n(1<=n<=10)，代表了仙境的编号和路径的数量
 * 接下来m行，每行都有a，b，c(1<=a,b<=n，1<=c<=100)，代表了仙境a达到仙境b需要消耗c的机缘
 * 输出小G需要消耗的最小的机缘，如果无法浏览所有的地点，输出-1
 * (无向图的最小生成树)
 * 输入
 * 3 2
 * 1 2 5
 * 1 3 1
 * 输出
 * 6
 * @author Administrator
 *
 */
public class GiBiTETi1 {
	public static int minShengchengshu(int[][] arr) {
		int res = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][3] < min) {
				min = arr[i][3];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String[][] s = new String[m][3];
		int[][] arr = new int[m][3];
		for (int i = 0; i < m; i++) {
			s[i] = scanner.nextLine().split(" ");
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.valueOf(s[i][j]);
				if (arr[i][j] > n) {
					System.out.println("输入有误");
				}
			}
		}
		int res = minShengchengshu(arr);
		System.out.println(res);
	}

}

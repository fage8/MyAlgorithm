package com.myPracticeCode;

import java.util.Scanner;

/**
 * (正确做法)
 * 分糖果，每个孩子最少一个糖果，在相邻的孩子中，评分高的孩子获得更多的糖果，求至少准备多少糖果
 * 输入
 * 1,3,4(或4,3,1)
 * 输出
 * 6
 * 1,2,2
 * 输出
 * 4
 * @author Administrator
 *
 */
public class FenTangguo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(",");
		int[] arr = new int[strings.length];
		int[] res = new int[strings.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = 1;
		}
		for (int i = 0; i < res.length; i++) {
			arr[i] = Integer.valueOf(strings[i]);
		}
		for (int i = 0; i < res.length; i++) {
			if (i >= 1 && i <= res.length -2) {//除了两边的元素
				if ((arr[i] > arr[i+1]) || (arr[i] > arr[i-1])) {
					res[i] = Math.max(res[i+1], res[i-1]) + 1;
				}
			}else if (i == 0) {//最左边元素
				if (arr[0] > arr[1]) {
					res[0] = res[1] + 1;
				}
			}else {//最右边元素
				if (arr[res.length -1] > arr[res.length-2]) {
					res[res.length-1] = res[res.length-2] +1;
				}
			}
		}
		int sum= 0;
		for (int i = 0; i < res.length; i++) {
			sum += res[i];
		}
		System.out.println(sum);
	}
}

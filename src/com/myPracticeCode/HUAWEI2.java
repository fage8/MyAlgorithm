package com.myPracticeCode;

import java.util.Scanner;

public class HUAWEI2 {
	public static int solution3(int[] arr, int num) {
		if (arr == null || arr.length == 0 || num < 1) {
			throw new RuntimeException("err");
		}
		if (arr.length < num) {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i != arr.length; i++) {
				max = Math.max(max, arr[i]);
			}
			return max;
		} else {
			int minSum = 0;
			int maxSum = 0;
			for (int i = 0; i < arr.length; i++) {
				maxSum += arr[i];
			}
			while (minSum != maxSum - 1) {
				int mid = (minSum + maxSum) / 2;
				if (getNeedNum(arr, mid) > num) {
					minSum = mid;
				} else {
					maxSum = mid;
				}
			}
			return maxSum;
		}
	}


	public static int getNeedNum(int[] arr, int lim) {
		int res = 1;
		int stepSum = 0;
		for (int i = 0; i != arr.length; i++) {
			if (arr[i] > lim) {
				return Integer.MAX_VALUE;
			}
			stepSum += arr[i];
			if (stepSum > lim) {
				res++;
				stepSum = arr[i];
			}
		}
		return res;
	}




	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println(solution3(arr, k));

	}
}

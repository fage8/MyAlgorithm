package com.myPracticeCode;

import java.util.Scanner;
/**
 * 快速排序
 * @author Administrator
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] string = scanner.nextLine().split(",");
		int[] a = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			a[i] = Integer.valueOf(string[i]);
		}
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length - 1; i++) {				
			System.out.print(a[i] + ",");
		}
		System.out.println(a[a.length - 1]);
	}
	public static void quickSort(int[] n, int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quickSort(n, left, dp - 1);
            quickSort(n, dp + 1, right);
        }
    }
 
    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)//找到右边第一个小于比较值的值的序号
                right--;
            if (left < right) {
            	n[left] = n[right];
            	left++;
            }
            
            while (left < right && n[left] <= pivot)//找到左边第一个大于比较值的值的序号
                left++;
            if (left < right) {
            	n[right] = n[left];
            	right--;
            }
        }
        n[left] = pivot;
        return left;
    }

}

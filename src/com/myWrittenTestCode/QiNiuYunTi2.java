package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (做法正确，但是复杂度太大)
 * n个孩子左到右站成一排，每个孩子经过一轮比赛都会获得一个分数，
 * 所选出的孩子是连续的一段，且选取的孩子的分数的平均值大于或等于指定的常数b，问这样的选法有多少种
 * 输入(n b)
 * 5 9
 * 32 4 9 21 10
 * 输出
 * 13
 * @author Administrator
 *
 */
public class QiNiuYunTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
        int count = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
	        for (int i = 0; i < arr.length - j; i++) {
	        	int sum = 0;
	        	if (arr[i]==0) {
					continue;
				}
	        	for(int k = i; k <= i+j;k++) {//从n-1到1选元素个数
	        		sum += arr[k];
	        	}
	        	if (sum >= b*(j+1)) {
	        		count++;
	        	}
	        }
        }

        System.out.println(count);
	}

}

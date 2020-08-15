package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 套娃前缀和
 * sum[0][n]=a[n],sum[k][n]=求和（n，i=1）sum[k-1][i](k>=1)
 * 如何快速求解sum[K][N](mod 998244353)
 * 输入描述：
 * 第一行两个数N，K(1<=N<=5000,1<=K<=998244353)
 * 第二行N个数，第i个数为a[i](0<=a[i]<998244353)
 * 输出描述：
 * 一个数表示sum[K][N]
 * 输入：
 * 
 * 输出：
 * 
 * @author Administrator
 *
 */
public class MeiTuan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(n);
	}

}

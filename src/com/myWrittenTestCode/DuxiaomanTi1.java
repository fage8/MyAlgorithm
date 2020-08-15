package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 西西所在的国家有N座城市，每座城市都有一道传送门，城市i的传送门通往城市a[i].当西西位于城市i时，每次他可以以下三种操作中的一种：
 * 花费A的费用，从城市i前往城市a[i];
 * 如果a[i]>1，可以花费B的费用，将a[i]的值减少1；
 * 如果a[i]<N，可以花费C的费用，将a[i]的值增加1.
 * 西西想从城市1前往城市N，那么他至少要花费多少费用？
 * 
 * 第一行输入四个整数N,A,B,C(1<N<=10000，1<=A,B,C<=100000)
 * 第二行输入N个整数a[1]到a[N](1<=a[i]<=N)
 * 输出一个整数，表示从城市1前往城市N所花费的最少费用
 * 
 * 输入
 * 7 1 1 1
 * 3 6 4 3 4 5 6
 * 输出
 * 4
 * @author Administrator
 *
 */
public class DuxiaomanTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] name = new int[n];
        for (int i = 0; i < n; i++) {
			name[i] = scanner.nextInt();
		}
//        int res = (n-a+1)*(m-b+1);
        Arrays.sort(name);

        System.out.println(name[n-1]-name[0]+1);

	}

}

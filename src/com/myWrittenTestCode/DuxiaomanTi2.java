package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 设原矩阵是n*m的，则3*3极大值池化就是枚举矩阵中的所有3*3的子矩阵，分别求最大值并顺次拼接而成，处理过后的矩阵是(n-2)*(m-2).
 * 比如，原矩阵是[[1,2,3,4],[5,6,7,8],[9,10,11,12]]，经过池化之后就变成[[11,12]].
 * 为了提高难度，选择的滑动窗口并不是3*3的，而是a*b的，由于输入可能是非常大的，原n*m的矩阵权值由以下公式计算得到，h(i,j)=j*j mod 10.
 * (1<=i<=n,1<=j<=m)
 * 输出经过a*b池化后的矩阵的元素之和
 * 
 * 输入第一行n,m,a,b，分别表示原矩阵的行列数量和滑动窗口的行列数量(1<=n,m,a,b<=1000)
 * 输出新矩阵的元素之和
 * 
 * 输入
 * 4 5 3 3
 * 输出
 * 54
 * @author Administrator
 *
 */
public class DuxiaomanTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int k = scanner.nextInt();
        int[] nums = new int[n];
        while(scanner.hasNext()) {
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(" ");
	        }
        	System.out.println(n);
        }
	}

}

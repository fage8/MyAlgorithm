package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 最外层的圆环黑色，第二大的圆环白色，第三大的圆环涂黑色，以此内推，求黑色的面积
 * 第一行输入圆的个数，第二行输入每个圆的半径
 * 输入：
 * 5
 * 1 2 3 4 5
 * 输出：
 * 47.12389
 * 算法思想：第一大圆减第二大圆面积，就是第一大黑色圆环面积，如果圆的个数为奇数还得加上最后一个小圆的面积
 * @author Administrator
 *
 */
public class MeiTuan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
		int[] num = new int[n];
		if (n <= 0 || n >1000) {//这个没有输出
			System.out.println(new int[0]);
		}
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		double mainji =0;
			
		for (int i = n-1; i >=1; i=i-2) {
			mainji += (double)(3.1415926953 *(num[i]*num[i] - num[i-1]*num[i-1]));
		}
		if (n%2!=0) {
			mainji += (double)(3.1415926953 * num[0]*num[0]);
		}
//		String aString = String.valueOf(mainji);
//		int a = Integer.parseInt(aString.substring(aString.indexOf('.')+5,aString.indexOf('.')+6));
//		if (a >=5) {
//			a = Integer.parseInt(aString.substring(0,aString.indexOf(".")))+1;
//		}else {
//			a = Integer.parseInt(aString.substring(0,aString.indexOf(".")));
//		}
//        System.out.println(a);
		System.out.println(mainji);
	}

}

package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 长度为n的数组a，找到最大的正整数d，使得对于所有的i(1<=i<n)，ai+1-ai是d的倍数
 * (就是找出最大公约数d)
 * 输入
 * 第一行，数组长度n(2<=n<=2*10^5)
 * 第二行，n个正整数a1,...,an(1<=ai<=10^18)
 * 
 * 输出
 * 如果d不存在，输出-1，否则输出最大的d
 * 
 * @author Administrator
 *
 */
public class WangyiTi1 {

	public static long zuidagongyueshu(long m, long n) {//辗转相除法，还有辗转相减法和穷举法
		if (m < n) {
			long temp = m;
			m = n;
			n = temp;
		}
		while(m % n !=0) {//余数不为0
			long temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			long[] a = new long[n];//必须long类型
			long[] cha = new long[n-1];//记录差值，必须大于0
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
			for (int i = 1; i < a.length; i++) {
				cha[i-1] = a[i]-a[i-1];
			}
			long j = -1;
			int i = 0;
			for (; i < cha.length-1; i++) {
				if (cha[i] > 0 && cha[i+1] > 0) {//加上这个判断，当时没有考虑到只能正数
					cha[i+1] = zuidagongyueshu(cha[i], cha[i+1]);
					j = cha[i+1];					
				} else {//存在小于或等于0的差值					
					break;
				}
			}
			if (j == -1 || i != cha.length - 1) {
				System.out.println(-1);
			}else {
				
				System.out.println(j);
			}
		}
	}

}

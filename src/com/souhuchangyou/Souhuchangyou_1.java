package com.souhuchangyou;

import java.util.Scanner;
//找出一组整数数据中第二大的数 
//该程序为啥没有输出结果
public class Souhuchangyou_1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//并通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串，
//		//在读取前我们一般需要使用hasNext 与 hasNextLine 判断是否还有输入的数据
//		int n = sc.nextInt();//读取第一个整数为n，空格键结束
//		int max = Integer.MIN_VALUE;
//		int sec = Integer.MIN_VALUE;
//		while (sc.hasNext()) {//enter键不输入数据结束
//			int temp = sc.nextInt();//输入之后的n个整数，空格键结束
//			if (temp >= max) {
//				sec = max;
//				max = temp;
//			} else if (temp >= sec) {
//				sec = temp;
//			}
//		}
//		System.out.println(sec);
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//其实这个n与下面输入数据的个数可以不一致，只是给读者看的
		System.out.println(n);
		int max = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		while (sc.hasNext()) {
			int temp = sc.nextInt();
			if (temp >= max) {
				sec = max;
				max = temp;
			} else if(temp >= sec){
				sec = temp;
			}
			System.out.println(sec);
		}
	}
}

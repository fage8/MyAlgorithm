package com.myWrittenTestCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 输入一个大小为N的数组A，其中元素为可重复整数。数组里面可能存在这样一些元素A[i]，
 * 对于A[i],在A[0]~A[i-1]中有且只有一个元素的值大于A[i](重复元素算多个)。
 * 要求写代码找出这样元素下标并输出，如果不存在输出-1.(时间复杂度为O(N))
 * (注意可能数字为负值，记得去最大值的重复)
 * 输入
 * 1 22 22 33 22 12 45 44 5
 * 输出
 * 4 7
 * @author Administrator
 *
 */
public class KuaishouTi2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] str = sc.nextLine().split(" ");//空格划分截取字符串
			int[] num = new int[str.length];
			if (str.length == 0 || str == null) {//这个没有输出
				System.out.println(-1);
			}
			for (int i = 0; i < num.length; i++) {//字符串数组转化为整型数组
				num[i] = Integer.valueOf(str[i]);
			}
			int max = num[0];//第一大数
			int sec = Integer.MIN_VALUE;//第二大数
			List<Integer> res = new ArrayList<>();//必须用动态数组存输出结果
			for (int i = 1; i < num.length; i++) {
				if(num[i] >= sec && num[i] < max) {
					res.add(i);
				}
				if (num[i] > max) {
					max = num[i];
				}else if(num[i] >= sec){//这样可能sec与max一样大，就当于去除了最大数重复
					sec = num[i];
				}
			}
			if(res.size() == 0) System.out.println(-1);
			else {
				for (int j = 0; j < res.size() - 1; j++) {
					System.out.print(res.get(j) + " ");
				}
				System.out.println(res.get(res.size() - 1));
			}
		}
	}

}

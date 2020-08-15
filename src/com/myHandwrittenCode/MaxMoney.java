package com.myHandwrittenCode;

import java.util.Scanner;
/**
 * 飞猪重启面试题(正确答案)
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 输入
 * 9,11,8,5,7,12,16,14
 * 输出
 * 11
 * @author Administrator
 *
 */
public class MaxMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(",");
		int[] a = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			a[i] = Integer.valueOf(str[i]);
		}
		if (a.length < 1) {
			System.out.println("error");
		}else {
			int min = a[0];
			int maxMoney = a[0] - min;
			//计算第i天卖出时的最大利润，最后比较所有的最大利润，取最大值
			for (int i = 1; i < a.length; i++) {
				if (a[i-1] < min) {//更新最小值
					min = a[i-1];
				}
				int curMoney = a[i] - min;
				if (curMoney > maxMoney) {
					maxMoney = curMoney;
				}
				
			}
			System.out.println(maxMoney);
		}
	}

}

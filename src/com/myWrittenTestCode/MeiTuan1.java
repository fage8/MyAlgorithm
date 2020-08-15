package com.myWrittenTestCode;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 首先给出一个整数，可能为正也可能为负，这个数字中仅包含数字1-9，现在定义一个1-9的置换，
 * 即指定将整数中的某个数字按顺序变换为另一个数字，请你输出变换以后的数字是多少。
 * 输入第一行包含一个整数a
 * 输入第二行包含9个以空格隔开的整数a_i,第i个整数表示将数字i替换为数字a_i
 * 输出数字变换之后的结果
 * 输入
 * 1234567
 * 9 8 7 6 5 4 3 2 1
 * 输出
 * 9876543
 * 输入
 * -12
 * 2 3 7 6 5 4 3 2 1
 * 输出
 * -23
 * @author Administrator
 *
 */
public class MeiTuan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        ArrayList<Integer> res = new ArrayList<Integer>();
        String[] str = sc.nextLine().split(" ");//空格划分截取字符串
		int[] num = new int[str.length];
		if (str.length == 0 || str == null) {//这个没有输出
			System.out.println(-1);
		}
		for (int i = 0; i < num.length; i++) {//字符串数组转化为整型数组
			num[i] = Integer.valueOf(str[i]);
		}
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(0) == '-') {
			}else {
//				i--;
				System.out.print(num[i]);				
			}
		}
	}

}

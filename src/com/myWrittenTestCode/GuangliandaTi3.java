package com.myWrittenTestCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * (正确做法)
 * 给定一个股票值stock列表，生成一个列表，每个位置的输出值是还要多少天股票才会升值，如果之后不会升值，在该位置用0代替。
 * stock的长度范围是[1,10000]，每个股票值的范围为[10,40]的整数
 * 输入：
 * [23,24,25,21,12,22,31,23]
 * 输出：
 * [1,1,4,2,1,1,0,0]
 * @author Administrator
 *
 */
public class GuangliandaTi3 {
	public static List<Integer> f(List<Integer> list) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			boolean flag = false;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) > list.get(i)) {
					res.add(j - i);
					flag = true;
					break;
				}
			}
			if (flag == false) {
				res.add(0);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
			String[] str= scanner.nextLine().split(",");
			int[] nums = new int[str.length];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				list.add(Integer.valueOf(str[i]));
			}
			List<Integer> reslist = f(list);
        	System.out.println(reslist);
        }
	}

}

package com.myWrittenTestCode;

import java.util.HashSet;
import java.util.Scanner;

/**
 * (正确做法)
 * 一个城市中有n个人，里面举行了m场家庭聚会，
 * 假设刚开始只有一个携带病毒的人，且参加聚会的人全部都会被感染，感染者又会去感染其他人。
 * 求最后的感染者有多少人(包含携带病毒的人)，编号从0开始
 * 
 * 第一行：n（城市中的人数） m（家庭聚会的次数） f（初始携带病毒的人的编号）
 * 接下来的m行，第一个数字是参加家庭聚会的人数num，后面数字是接下来的num个参加聚会的人的编号
 * 
 * 输入
 * 10 2 0
 * 2 0 3
 * 3 0 1 2
 * 输出
 * 4
 * 输入
 * 10 3 0
 * 2 0 1
 * 3 1 2 3
 * 5 4 5 6 7 3
 * 输出
 * 8
 * @author Administrator
 *
 */
public class WangyiTi3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int f = sc.nextInt();//初始携带病毒的人的编号
			HashSet<Integer> res = new HashSet<Integer>();//利用set的无序不可重复性
			for (int i = 0; i < m; i++) {//遍历会议次数
				int num = sc.nextInt();//存储每次会议的人数
				int[] arr = new int[num];//定义一维或二维数组时必须制定行列维数为常数
				for (int j = 0; j < num; j++) {
					arr[j] = sc.nextInt();//记录每次会议中人员的编号
				}
				for (int j = 0; j < num; j++) {
					if (arr[j] == f || res.contains(arr[j])) {//如果编号为初试感染者，或编号为被感染者都得进set
						for (int j2 = 0; j2 < num; j2++) {
							res.add(arr[j2]);
						}
					}
				}
			}
			
			System.out.println(res.size());
		}
	}
}

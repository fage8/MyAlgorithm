package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * N位同学（0<N<10000）面朝国旗间隔1米排成一列，数组height[i]表示这队人从前到后的身高，
 * 返回队中每个人与前方身高高于自己的人的最短距离，如果前方没有比他高的人，则距离为0
 * 输入
 * [175,173,174,163,182,177]
 * 输出
 * [0,1,2,1,0,1]
 * @author Administrator
 *
 */
public class KuaishouTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] num = sc.nextLine().trim().split(",");//trim()的作用是去掉字符串两端的多余的空格,可加可不加
			if (num == null || num.length == 0) {
				System.out.println(new int[0]);//输出0数组
			}
			int len = num.length;
			int[] res = new int[len];
			res[0] = 0;
			for (int i = 1; i < num.length; i++) {
				for (int j = i - 1; j >= 0; j--) {
					if (num[j].compareTo(num[i]) > 0) {
						res[i] = i-j;
						break;//保证上述res[i]是最短距离
					}
				}
			}
			for (int i = 0; i < res.length - 1; i++) {//输出结果数组			
				System.out.print(res[i]+",");
			}
			System.out.print(res[res.length -1]);
		}
	}

}

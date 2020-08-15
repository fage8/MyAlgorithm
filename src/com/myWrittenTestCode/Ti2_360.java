package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * A和B两个人在抽奖，现在有一个抽奖箱，里面有n张中奖票，m张不中奖票。
 * A和B轮流从中抽一张奖票出来，如果有人抽到中奖票就结束，抽到中奖票的人胜利，抽过的奖票会被丢弃
 * 额外的，B每次抽后，会再次抽取一张票并丢弃掉（这张票中奖不算B胜利）
 * 现在，A先抽，请问A的胜率，保留4位小数后输出
 * 如果两人到最后也没有抽到中奖票算作B胜利
 * 输入描述：
 * 输入两个数字n，m，代表中奖票和不中奖票的数量（0<n,m<1000）
 * 输出描述：
 * 输出A的胜率，保留4位小数
 * 输入：
 * 1 3
 * 输出
 * 0.5000
 * 解释：
 * 如果A第一轮抽到中奖票，A胜利，概率0.25
 * 如果A第二轮抽到中奖票，情况为A第一轮没有抽到中奖票，B也没有抽到中奖票，并且B丢弃掉的奖票也不是中奖票，概率为3/4*2/3*1/2=0.25
 * 综上，中奖率为0.5
 * @author Administrator
 *
 */
public class Ti2_360 {
	public static float f(int a,int b) {
		float res=0;
		int res1= a/(a+b);
		int res2 = (1-res1)*(b-1)/(a-1)*(b-2)/(a-2);
		res=res1+res2;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float res = 0;
		int i = b, j = a;
		for (; i >=1&& j>=1; i--) {
			res=f(a, b);			
		}

		System.out.println(res);
	}

}

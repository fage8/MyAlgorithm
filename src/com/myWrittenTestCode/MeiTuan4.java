package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 今天的小仓会进行N论射击，已知每次击中靶心的概率为p/q,每当小仓击中靶心，如果是连续k次击中，那么小仓会获得a[k]的得分
 * 小仓希望知道最后她的期望得分是多少
 * 输入描述：
 * 第一行三个数N，p，q代表射击轮数以及击中靶心概率
 * 第二行N个数a[i],第i个数为a[i]
 * (1<=N<=100000,0<=a[i]<998244353,1<=p,q<998244353)
 * 输出描述：
 * 一个数表示期望得分
 * 输入：
 * 
 * 输出：
 * 
 * @author Administrator
 *
 */
public class MeiTuan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(n);
	}

}

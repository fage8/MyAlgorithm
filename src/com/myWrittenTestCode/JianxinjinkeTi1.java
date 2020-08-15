package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 有n*m的矩阵组成的方格，每个格子代表一个基地，也就是有n*m个基地
 * 现在需要给基地投补给品，如果投到方格内部，该方格获得补给品；如果投到方格的边界处，视为相邻边界的方格都获得了补给品
 * 请问提供所有方格基地所需的最小补给品数目是多少（0<n,m<=200）
 * 输入
 * 2 2
 * 输出
 * 1
 * @author Administrator
 *
 */
public class JianxinjinkeTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int res = 0;
			if (n == m && n % 2 ==0) {
				res = n*m/4;
			}else if (n == m && n %2!=0) {
				res = n*m/4 + 2;
			}else if (n != m) {
				if (n<m) {
					int tmp = n;
					n = m;
					m = tmp;
				}
				int duo = n-m;
				if (m % 2 ==0) {
					res = m*m/4 + duo*m/4;
				}else if ( m %2!=0) {
					res = m*m/4 + 2 + duo*m/4;
				}
				
			}
			System.out.println(res);
		}
	}

}

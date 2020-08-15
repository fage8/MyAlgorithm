package com.myWrittenTestCode;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
/**
 * ���˴���ޣ�һ��n*m�ľ���������0��������ޣ� ��1�������ˣ������һ������
 * ����ÿ��������������������ľ��룬���緽�������ǹ��޵Ļ������0����ֻ֤����һֻ����
 * 
 * ����
 * 3 3
 * 101
 * 010
 * 101
 * ���
 * 1 0 1
 * 0 1 0
 * 1 0 1
 * @author Administrator
 *
 */
public class WangyiTi4 {
	public static int distance(int[][] dis, int i, int j, int m, int n) {//��֪�ø���λ�ã�����̹��޾���
		int distance = Integer.MAX_VALUE;
		for (int k = 0; k < m; k++) {
			for (int k2 = 0; k2 < n; k2++) {				
				if (k == i && dis[k][k2] == 0) {//ͬһ�����й���
					distance = Math.min(distance, Math.abs(k2 - j));
					
				}
				if (k2 == j && dis[k][k2] == 0) {//ͬһ�����й���
					distance = Math.min(distance, Math.abs(k - i));
					
				}
				

			}
		}
		return distance;
	}
	public static int[][] minDistance(int[][] dis, int m, int n) {//�õ�m*n�ľ�����̹��޾���
		int[][] minDistance = new int[m][n];
		for (int j = 0; j < m; j++) {
			for (int j2 = 0; j2 < n; j2++) {				
				if (dis[j][j2] == 1) {//����
					minDistance[j][j2] = distance(dis, j, j2, m, n);
				} else {
					minDistance[j][j2] = 0;
				}
			}
		}
		return minDistance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] name = new int[m][n];
			int[][] dis = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int k = 0; k < n; k++) {
					
					name[i][k] = sc.nextInt();
				}
			}

			dis = minDistance(name, m, n);

			for (int i = 0; i < m; i++) {
				for (int k = 0; k < n-1; k++) {
					System.out.print(dis[i][k] + " ");
					System.out.print(dis[i][n-1]);
				}
				System.out.println();
			}
		}
	}

}

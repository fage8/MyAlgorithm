package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ��δ������
 * СG̽���ɾ���ÿһ��·����Ҫ����һ���Ļ�Ե��Ϊ�˾����ٵ����Ļ�Ե��ÿһ���ص����ྭ�����Σ���ôҪ������еĵص㣬������Ҫ���ٻ�Ե?
 * ��һ��n��m��n(1<=n<=10)���������ɾ��ı�ź�·��������
 * ������m�У�ÿ�ж���a��b��c(1<=a,b<=n��1<=c<=100)���������ɾ�a�ﵽ�ɾ�b��Ҫ����c�Ļ�Ե
 * ���СG��Ҫ���ĵ���С�Ļ�Ե������޷�������еĵص㣬���-1
 * (����ͼ����С������)
 * ����
 * 3 2
 * 1 2 5
 * 1 3 1
 * ���
 * 6
 * @author Administrator
 *
 */
public class GiBiTETi1 {
	public static int minShengchengshu(int[][] arr) {
		int res = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][3] < min) {
				min = arr[i][3];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String[][] s = new String[m][3];
		int[][] arr = new int[m][3];
		for (int i = 0; i < m; i++) {
			s[i] = scanner.nextLine().split(" ");
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.valueOf(s[i][j]);
				if (arr[i][j] > n) {
					System.out.println("��������");
				}
			}
		}
		int res = minShengchengshu(arr);
		System.out.println(res);
	}

}

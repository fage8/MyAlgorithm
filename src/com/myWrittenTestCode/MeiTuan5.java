package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ����ǰ׺��
 * sum[0][n]=a[n],sum[k][n]=��ͣ�n��i=1��sum[k-1][i](k>=1)
 * ��ο������sum[K][N](mod 998244353)
 * ����������
 * ��һ��������N��K(1<=N<=5000,1<=K<=998244353)
 * �ڶ���N��������i����Ϊa[i](0<=a[i]<998244353)
 * ���������
 * һ������ʾsum[K][N]
 * ���룺
 * 
 * �����
 * 
 * @author Administrator
 *
 */
public class MeiTuan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(n);
	}

}

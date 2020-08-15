package com.myWrittenTestCode;

import java.util.HashSet;
import java.util.Scanner;

/**
 * (��ȷ����)
 * ��n*n�ľ���M��M[i][j]=1ʱ����˵i��j��һ������Ȧ��������Ȧ����
 * ����
 * 3
 * 1,1,0
 * 1,1,0
 * 0,0,1
 * ���
 * 2
 * ����
 * 3
 * 1,1,0
 * 1,1,1
 * 0,1,1
 * ���
 * 1
 * @author Administrator
 *
 */
public class YuewenTi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   sc.nextLine();
	   int[][] a = new int[n][n];
	   for (int i = 0; i < n; i++) {
		   String[] s = sc.nextLine().split(",");
		   for (int j = 0; j < s.length; j++) {
			   a[i][j] = Integer.valueOf(s[j]);
		   }
	   }
	   int res = 0;
	   HashSet<Integer> name = new HashSet<Integer>();
	   for (int i = 0; i < n; i++) {
		   for (int j = 0; j < n; j++) {
			   if (j > i && a[i][j] == 1) {
				   name.add(i);
				   name.add(j);
			   }
		   }
	   }
	   for (int i = 0; i < n; i++) {
		   if (!name.contains(i)) {
			   res++;
		   }
	   }
	   if (res == n) {//���ǵ�����Ԫ�أ�û������
		   System.out.println(res);
	   }else {
		   System.out.println(res+1);
	   }
	}

}

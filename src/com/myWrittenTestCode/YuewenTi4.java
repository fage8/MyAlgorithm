package com.myWrittenTestCode;

import java.util.HashSet;
import java.util.Scanner;

/**
 * (正确做法)
 * 有n*n的矩阵M，M[i][j]=1时，就说i和j在一个朋友圈，求朋友圈个数
 * 输入
 * 3
 * 1,1,0
 * 1,1,0
 * 0,0,1
 * 输出
 * 2
 * 输入
 * 3
 * 1,1,0
 * 1,1,1
 * 0,1,1
 * 输出
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
	   if (res == n) {//都是单独的元素，没有朋友
		   System.out.println(res);
	   }else {
		   System.out.println(res+1);
	   }
	}

}

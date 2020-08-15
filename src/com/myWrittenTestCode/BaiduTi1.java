package com.myWrittenTestCode;

import java.util.Scanner;


public class BaiduTi1 {

		public static int f(int[] s,int i, int j) {
			int count=0;
			for (int c=i+1 ; c<= j+1;c++) {
				if (c==0) {
					count++;
				}
			}
			return count;
		}
		public static int f2(int[] s,int i, int j) {
			int count=0;
			for (int c=i+1 ; c<= j+1;c++) {
				if (c==1) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();	
				int[] ss = new int[n];
				int sum = 0;
				for (int i = 0; i < n; i++) {
					ss[i] = sc.nextInt();
				};
				int i = 0, j = n-1 ;
				while ( i < n && j >= 0) {
					if (ss[i] != 0 && ss[j] != 0) {
						if (f(ss, i, j) > f2(ss, i, j)) {
							int count1 = f(ss, i, j) - f2(ss, i, j);
							sum += x*(count1+1);
						} else {
							int count2 = f2(ss, i, j) - f(ss, i, j);
							sum += x*count2;
						}
					} 
					if (i >= j) {
						break;
					}
					i++;
					j--;
				}
				System.out.println(sum);
			}
		}

	}


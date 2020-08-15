package com.myWrittenTestCode;

import java.util.Scanner;

public class LangChaoTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] num = new int[1000];
			int[] snum = new int[1000000];
			int res = 0;
			for (int i = 0; i < n; i++) {
				num[i] = sc.nextInt();
				snum[num[i]] = snum[num[i] - 1] +1;
			}
			for (int i = 0; i < n; i++) {
				res = Math.max(res, snum[i]);
			}
			System.out.println(n-res);
		}
	}

}

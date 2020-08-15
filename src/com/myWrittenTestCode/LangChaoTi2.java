package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 两排奇偶树，去除一些树，求起始树号和最长连续树的个数
 * @author Administrator
 *
 */
public class LangChaoTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] name = new int[n];
			for (int i = 0; i < n; i++) {
				name[i] = sc.nextInt();
			}
			Arrays.sort(name);
			int count1 = 0, count2 = 0;
			for (int i = 0; i < n; i++) {
				if (name[i] % 2 != 0) {
					count1 = name[i];
				}else {
					count2 = name[i];
				}
			}
			int a = (99 - count1) / 2;
			int b = (100 - count2) / 2;
			if (a > b || (a == b && count1 < count2) ) {
				System.out.println((count1 + 2) +" "+ a);
			}
			if (b > a || (a == b && count2 < count1)) {
				System.out.println((count2 + 2) +" " +b);
			}
		}
	}

}

package com.myWrittenTestCode;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
/**
 * 翻牌，使得正面顺序为非递减
 * @author Administrator
 *
 */
public class TecentTi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] name = new String[n];
        int[] res = new int[n];
        int[] res1 = new int[n];
        String[] name1 = new String[n];
        int count = 0;
		name = scanner.nextLine().split(" ");
		name1 = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			res[i] = Integer.valueOf(name[i]);
			res1[i] = Integer.valueOf(name1[i]);
		}
		for (int i = 0; i < name.length; i++) {
			for (int j = i+1; j < name.length; j++) {
				if (res[i] > res[j] && res1[i] <= res[j]) {
					count++;
				}
			}
		}
		if (count != 0) {
			System.err.println(count);
		}
//        System.out.println(-1);
	}

}

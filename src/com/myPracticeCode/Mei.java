package com.myPracticeCode;

import java.util.Scanner;

public class Mei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
        for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] & arr[j]) == 0) {
					res[i] = 1;
					res[j] = 1;
					break;
				}else {
					res[i] = -1;
				}
			}
		}
        for (int i = 0; i < res.length -1; i++) {
        	System.out.print(res[i] + " ");			
		}
        System.out.println(res[res.length-1]);
	}

}

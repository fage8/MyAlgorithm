package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Scanner;

public class BaiduTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
        for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
        Arrays.sort(a);
        Arrays.sort(b);  
        int res = a[n-1], count = 1;
      	while (count < m) {
	        for (int j = n -count-1; j >= 0; j--) {
	        	res += a[j] - b[j];
	        }
	        count++;	
    	}

        System.out.println(res);
	}
}


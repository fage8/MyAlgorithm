package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ����ȷ������
 * ��̨�ף�������һ��������������������n���ж���������
 * @author Administrator
 *
 */
public class DianxinTi1 {

	public static long f(long n) {
		if (n == 1) {
			return 1;
		}
		if (n  == 2) {
			return 2;
		}
		long fn_1 = 2;
		long fn_2 = 1;
		long fn = 0;
		for (int i = 3; i <= n; i++) {
			fn = fn_1 + fn_2;
			fn_2 = fn_1;
			fn_1 = fn;
		}
		return fn;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        	long n = scanner.nextLong();
        	System.out.println(f(n));

		}
	}

}

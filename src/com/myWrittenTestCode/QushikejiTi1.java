package com.myWrittenTestCode;

import java.util.Scanner;

/**
 * (正确做法)
 * 如果n % 50 == 0， fn = 0（其实%就是取模运算，并不是取余运算）
 * 如果n % 50 == 1， fn = 1
 * 其他情况，fn = f(n-1) + 2 * f(n-2)
 * f(0)=0
 * f(1)=1
 * f(2)=1
 * f(3)=3
 * f(4)=5
 * f(5)=11
 * f(46)=23456248059221
 * f(47)=46912496118443
 * f(48)=93824992236885
 * f(49)=187649984473771
 * f(-49)=1
 * f(-50)=0
 * 注意负数的情况
 * Java 中的取余运算是 %，而取模运算是 Math.floorMod()
 * @author Administrator
 *
 */
public class QushikejiTi1 {
	public static long f(long n) {
		if (n % 50 == 0) {
			return 0;
		}
		if (n % 50 == 1) {
			return 1;
		}
		long fn_1 = 1;
		long fn_2 = 0;
		long fn = 0;
		for (int i = 2; i <= n; i++) {
			fn = fn_1 + 2 * fn_2;
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
        	if (n >= 0) {
        		System.out.println(f(n % 50));
			}else {
				System.out.println(f(n % 50 + 50));//%当做取余，负数需要进行+50操作变成取模运算
			}
		}
	}

}

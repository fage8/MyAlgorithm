package com.myWrittenTestCode;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * (正确做法)
 * n个人选队长，选的人数集合不同或队长不同方案就不一样
 * 输入2，输出(1)+(2)+2*(1,2)=4种方案,结果对10^9+7取模
 * 其实就是计算组合数，但是是1 <= n <= 10^9
 * 
 * (找规律的做法)
 * f(n)=n*2^(n-1)，第i个人当队长时，剩下（n-1）个人可选择入队或不入队，每人两种选择，共计2^（n-1）种，所以n*2^（n-1），可以使用快速幂计算
 * i*C(n,i)遍历求和就是(x+1)^2泰勒公式展开求导
 * 大数运算a.pow(b)=a^b
 * @author Administrator
 *
 */
public class ALiTi1 {
    static int m = 1000000007;//属于类变量  
	
	public static BigInteger zuheshu(BigInteger n, BigInteger j) {
	    BigInteger count = new BigInteger("0");
	    BigInteger fenzi = new BigInteger("1");
	    BigInteger i = new BigInteger("0");
		for (; i.compareTo(j) < 0; i = i.add(BigInteger.valueOf(1))) {
			fenzi = fenzi.multiply(n.subtract(i));
		}
		BigInteger fenmu = new BigInteger("1");
		for (BigInteger k = j; k.compareTo(BigInteger.valueOf(1)) >= 0; k = k.subtract(BigInteger.valueOf(1))) {
			fenmu = fenmu.multiply(k);
		}
		count = fenzi.divide(fenmu);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		    BigInteger n = sc.nextBigInteger();
//		    if (n < 1 || n > Math.pow(10, 9)) {
//				System.out.println("输入错误！");
//			}
		    BigInteger sum = new BigInteger("0");
		    BigInteger j = new BigInteger("1");		    
		    for (; j.compareTo(n) <= 0; j = j.add(BigInteger.valueOf(1))) {
				sum = sum.add(j.multiply(zuheshu(n, j)));
			}
		    //BigInteger.valueOf(m)相当于new BigInteger("m")
			System.out.println(sum.mod(BigInteger.valueOf(m)));//对m取模，就是对m求余数
		}
	}
}
//	public static double lnchoose(int n, int m){//计算ln(C(c,m))
//    if (m > n){
//       return 0;
//    }
//    if (m < n/2.0){//使得n-m小点，好计算
//       m = n-m;
//    }
//
//    double s1 = 0;
//    for (int i=m+1; i<=n; i++) {
//       s1 += Math.log((double)i);
//    }
//
//    double s2 = 0;
//    int ub = n-m;
//    for (int i=2; i<=ub; i++){
//       s2 += Math.log((double)i);
//    }
//    
//    return s1-s2;
//}
//
//public static double choose(int n, int m){
//    if (m > n) {
//       return 0;
//    }
//    return Math.exp(lnchoose(n, m));
//}


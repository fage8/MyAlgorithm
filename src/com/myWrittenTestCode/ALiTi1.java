package com.myWrittenTestCode;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * (��ȷ����)
 * n����ѡ�ӳ���ѡ���������ϲ�ͬ��ӳ���ͬ�����Ͳ�һ��
 * ����2�����(1)+(2)+2*(1,2)=4�ַ���,�����10^9+7ȡģ
 * ��ʵ���Ǽ����������������1 <= n <= 10^9
 * 
 * (�ҹ��ɵ�����)
 * f(n)=n*2^(n-1)����i���˵��ӳ�ʱ��ʣ�£�n-1�����˿�ѡ����ӻ���ӣ�ÿ������ѡ�񣬹���2^��n-1���֣�����n*2^��n-1��������ʹ�ÿ����ݼ���
 * i*C(n,i)������;���(x+1)^2̩�չ�ʽչ����
 * ��������a.pow(b)=a^b
 * @author Administrator
 *
 */
public class ALiTi1 {
    static int m = 1000000007;//���������  
	
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
//				System.out.println("�������");
//			}
		    BigInteger sum = new BigInteger("0");
		    BigInteger j = new BigInteger("1");		    
		    for (; j.compareTo(n) <= 0; j = j.add(BigInteger.valueOf(1))) {
				sum = sum.add(j.multiply(zuheshu(n, j)));
			}
		    //BigInteger.valueOf(m)�൱��new BigInteger("m")
			System.out.println(sum.mod(BigInteger.valueOf(m)));//��mȡģ�����Ƕ�m������
		}
	}
}
//	public static double lnchoose(int n, int m){//����ln(C(c,m))
//    if (m > n){
//       return 0;
//    }
//    if (m < n/2.0){//ʹ��n-mС�㣬�ü���
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


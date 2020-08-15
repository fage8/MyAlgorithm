package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 爬楼梯，可以一步一层，可以一步两层或一步三层，但是一步三层只能使用一次，求上k层楼梯有多少种方式
 * 输入楼梯层数，输出方式个数，若有异常则返回-1
 * 输入
 * 3
 * 输出
 * 4
 * @author Administrator
 *
 */
public class XiechengTi1 {
//
//	public static int name(int n) {
//		if (n < 1) {
//			return -1;
//		}
//        if (n==1 || n==2) {
//			return n;
//		}
//        if(n==3) {
//        	return 4;
//        }
//		int one = 2;
//		int two = 1;
//		int one_1 = 2;
//		int two_1 = 1;
////		int three = 4;
//		int fn = 0,fn_k=0;
//		if (n-3 == 0 || n-3 ==1) {
//			fn_k = 1;
//		}
//		if (n-3 == 2) {
//			fn_k = 2;
//		}
//		for (int i = 3; i <= n-3; i++) {
//			fn_k = one_1 + two_1;
//			two_1 = one_1;
//			one_1 = fn_k;
//		}
//		for (int i = 3; i <= n; i++) {
//			fn = one + two;
//			two = one;
//			one = fn;
//		}
//		return fn+fn_k;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int res = name(n);
//        System.out.println(res);
//	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int n = 0;
            try{
                n= Integer.parseInt(s);
            }catch (Exception e){
                System.out.println(-1);
                continue;
            }
            if (n==1){
                System.out.println(1);
                continue;
            }else if (n==2){
                System.out.println(2);
                continue;
            }else if(n<=0){
                System.out.println(-1);
            }
            int[] num2 = new int[n+1];
            int[] num3 = new int[n+1];
            num2[0]=1;
            num2[1]=1;
            num2[2]=2;
            for (int i = 3; i < n + 1; i++) {
                num2[i]=num2[i-1]+num2[i-2];
            }
            num3[1]=1;
            num3[2]=2;
            num3[3]=4;
            for (int i = 4; i < n + 1; i++) {
                int cur = 0;
                for (int j=0;j<=i-3;j++){
                    cur+=num2[j]*num2[i-3-j];
                }
                num3[i]=num2[i]+cur;
            }
            System.out.println(num3[n]);
        }
    }


}

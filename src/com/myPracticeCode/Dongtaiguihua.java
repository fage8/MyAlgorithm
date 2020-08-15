package com.myPracticeCode;


import java.util.Scanner;

/**
 * 返回最大山峰序列长度
 * @param numberList int整型vector 给定的序列
 * @return int整型
 */
public class Dongtaiguihua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(",");//空格划分截取字符串
		int[] num = new int[str.length];
		if (str.length == 0 || str == null) {//这个没有输出
			System.out.println(-1);
		}
		for (int i = 0; i < num.length; i++) {//字符串数组转化为整型数组
			num[i] = Integer.valueOf(str[i]);
		}
	    int[] dp1 = new int[10005], dp2 = new int[10005];
        int max1 = -1, max2 = 0;
        int n = num.length;
        for(int i = 0;i < n;i++){
              dp1[i] = 1;
              for(int j = 0; j < i; j++) {
                   if(num[j] < num[i]) {
                	   dp1[i] = Math.max(dp1[i], dp1[j] + 1);
              }
         }
         for(int i1 = n-1;i1 >= 0;i1--)
         {
              dp2[i1] = 1;
              for(int j = n-1; j > i1; j--)
              {
                   if(num[i1] > num[j]) dp2[i1] = Math.max(dp2[i1], dp2[j] + 1);
              }
         }
         //for(int i=0;i<n;i++) printf("%d ",dp2[i]);printf("\n");
         for(int i1 = 0; i1 < n; i1++)
         {
              max1 = Math.max(max1, dp1[i1] + dp2[i1] - 1);
         }
	    }
        System.out.println(max1);
	}
}

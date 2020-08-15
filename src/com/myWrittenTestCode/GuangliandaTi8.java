package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * ����n�������ÿ������Դ�һ�����򿪺��i����ô�����nums[left] * nums[i] * nums[right]��Ӳ�ҡ�
 * �����left��right�����i���ڵ������������ţ������һ�����iʱ�����left�ͺ��right�ͳ������ڵĺ�� ��������Ի�õ����Ӳ������
 * ��nums[-1] = nums[n] = 1����ע�����ǲ�����ʵ���ڵ����Բ����ܱ��򿪣�
 * ���룺
 * 3,1,5,8
 * ���
 * 167
 * ���ͣ�
 * nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
 * coins =  3*1*5 + 3*5*8 + 1*3*8 + 1*8*1 = 167
 * @author Administrator
 *
 */
public class GuangliandaTi8 {
	public static int maxCoins(int[] nums) {
		 int len = nums.length;
		 int[]num = new int[len+2];
		 int[][]dp = new int[len+2][len+2];
		 for(int i = 0;i<=len+1;i++) {
			 if(i==0||i==len+1) num[i] = 1;
			 else num[i] = nums[i-1];
		 }
		 int j = 0, temp = 0;
	     for(int k = 1; k <= len; k++) {
	         for(int i = 1; i <= len - k + 1; i++) {
	             j = i + k - 1;
	             for(int x = i; x <= j; x++) {
	                 temp = dp[i][x-1] + num[i-1] * num[x] * num[j+1] + dp[x+1][j];
	                 dp[i][j] = dp[i][j] > temp ? dp[i][j] : temp;
	             }
	         }
	     }
		 return dp[1][len];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
        	String[] str= scanner.nextLine().split(",");
        	int[] nums = new int[str.length];
	        for (int i = 0; i < str.length; i++) {
	        	nums[i] = Integer.valueOf(str[i]);
	        }
        	System.out.println(maxCoins(nums));
        }
	}

}

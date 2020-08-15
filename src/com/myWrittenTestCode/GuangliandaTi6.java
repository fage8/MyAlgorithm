package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 有快土地需要灌溉，现将这块土地分为N*M个1*1的小方块，然后农夫随机向这些方块中放入树根水管。
 * 已知没过一个小时，水管中的水就会蔓延到该方块上下左右的四个方块之中，请问k小时后，有多少方块仍需要被灌溉？
 * 输入：
 * 4 5 1
 * [
 * [0,1,0,0,0],
 * [0,0,0,1,0],
 * [0,1,0,0,0],
 * [0,0,0,0,0]
 * ]
 * 输出
 * 7
 * 输入
 * 4 5 2
 * [
 * [0,1,0,0,0],
 * [0,0,0,1,0],
 * [0,1,0,0,0],
 * [0,0,0,0,0]
 * ]
 * 输出
 * 1
 * @author Administrator
 *
 */
public class GuangliandaTi6 {

	public static int blockSum(int[][] block, int n, int m, int k){
		if(k <0 || n < 1 || m < 1) return -1;//如果k小于0时，返回-1报错
		int[][] res = new int[n][m];//复制一份矩阵，这样就不会造成原始数据和生成的数据重合污染
		for(int count = 1; count <= k; count++){//k个小时后，遍历k次矩阵
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
				   if(block[i][j] == 1){
					   res[i][j] = 1;
				      if(i-1 >= 0) res[i-1][j] = 1;
				      if(i+1 < n)  res[i+1][j] = 1;
				      if(j-1 >= 0) res[i][j-1] = 1;
				      if(j+1 < m)  res[i][j+1] = 1;
				   }
				}
			}
			for (int i = 0; i < n; i++) {//将已经灌溉的方块更新到block矩阵中，方便下一个小时的灌溉
				for (int j = 0; j < m; j++) {
					block[i][j] = res[i][j];
				}
			}
		}

		int sum = 0;
		for(int i = 0; i < n; i++){
		   for(int j = 0; j < m; j++){
		      if(block[i][j] == 0) sum++;//统计k小时后，需要灌溉的方块数
		   }
		}

		return sum;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
        	int n = scanner.nextInt();
        	int m = scanner.nextInt();
        	int k = scanner.nextInt();//中间用空格相隔，不能用逗号
        	scanner.nextLine();
        	int[][] nums = new int[n][m];
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(",");
				for (int j = 0; j < m; j++) {
					nums[i][j] = Integer.valueOf(str[j]);
				}
	        }
        	System.out.println(blockSum(nums, n, m, k));
        }
	}

}

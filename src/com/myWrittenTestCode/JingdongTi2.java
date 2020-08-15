package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 有n位乘客乘坐一列列车，列车一共会依次经过10^5个站点，从1到10^5编号
 * 我们已知每一位乘客的上车站和下车站，但是不知道这些乘客的订票顺序
 * 当一位乘客订票时，他会在当前还空余的座位中选择一个他喜欢的位置，但是我们不知道乘客的爱好，所有他具体订哪个位置我们是不知道的
 * 现在你需要计算列车最少需要安排多少座位，可以使得无论乘客的订票情况和顺序是怎样的，所有乘客都有座位可以坐
 * 举个例子，有三位乘客：
 * A：1->2
 * B:2->3
 * C:1->3
 * 若订票顺序是A,C,B,那么只需要两个座位就一定能满足。当A订票时，他会选择一个座位，当C订票时，可用座位只剩下一个，他会订这个剩余的座位，
 * 当B订票时，可用座位也只有一个，他会订这个座位（即最开始A的那个座位）
 * 若订票顺序是A,B,C，那么有可能会需要三个座位，A订了一个座位，B订了与A不同的座位，此时C来订票时他只能订第三个座位
 * 所以对于这组例子，答案是3
 * 输入描述：
 * 第一行包含一个整数n，表示乘客的数量（1<=n<=1000）
 * 接下来n行每行包含两个整数si，ti，表示第i位乘客的上车站点和下车站点（1<=si<ti<=10^5）
 * 输出描述：
 * 输出对应的答案
 * 
 * 输入：
 * 10
 * 84 302
 * 275 327
 * 364 538
 * 26 364
 * 29 386
 * 545 955
 * 715 965
 * 404 415
 * 903 942
 * 150 402
 * 输出：
 * 6
 * @author Administrator
 *
 */
public class JingdongTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
//        int k = scanner.nextInt();
        int[][] nums = new int[n][2];
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(" ");
				nums[i][0] = Integer.valueOf(str[0]);
				nums[i][1] = Integer.valueOf(str[1]);
	        }
	        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
	        int[] instance = new int[n];
	        for (int i = 0; i < n; i++) {
				if (nums[i][0] < min) {
					min = nums[i][0];
				}
				if (nums[i][1] > max) {
					max = nums[i][1];
				}
				instance[i] = nums[i][1] - nums[i][0];
			}
	        int maxStance = max - min;
	        Arrays.sort(instance);
	        int i = 0;
	        for (; i < instance.length; i++) {
	        	int sum=0; 
	        	sum+= instance[i];
				if (sum > maxStance) {
					break;
				}
			}
        	System.out.println(i+1);
        }
	}



package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 舰号：手机号后8位出现3个或3个以上连续为顺子号码，后8位出现重复3个或3个以上为豹子号码
 * 顺子号或豹子号位数多的，价值高；相同位数的豹子号大于顺子号的价值
 * 一个手机号同时有顺子或豹子的，以价值大的最为手机号价值
 * 相同价值的手机号，输出与输入顺序一致（稳定）
 * 输入多个手机号，输出价值降序的舰号，不存舰号输出null
 * 
 * 输入
 * 15112347234,15176313245,15176313346,15176313325,15166667234,15188847234
 * 输出
 * 15166667234,15112347234,15188847234
 * @author Administrator
 *
 */
public class KuaishouTi3 {

	private static void swap(int[][] res, int i, int j) {
		int temp = res[i][1];
		res[i][1] = res[j][1];
		res[j][1] = temp;
		
		temp = res[i][2];
		res[i][2] = res[j][2];
		res[j][2] = temp;
		
		temp = res[i][0];
		res[i][0] = res[j][0];
		res[j][0] = temp;
	}
	
	private static void sort(int[][] res) {
		for (int i = 0; i < res.length - 1; i++) {
			for (int j = 1; j < res.length - i; j++) {
				if (res[j][1] > res[j-1][1]) {
					swap(res, j-1, j);
				}
			}
		}
		for (int i = 0; i < res.length - 1; i++) {
			for (int j = 1; j < res.length - i; j++) {
				if (res[j][2] > res[j-1][1] && res[j][2] > res[j-1][2]) {
					swap(res, j-1, j);
				}
			}
		}
	}

	public static int[] judge(String str) {//判断手机号是否是舰号，输出舰号价值等级
		//substring(3)截取索引3开始的子字符串，toCharArray() 方法将字符串转换为字符数组
		char[] chs = str.substring(3).toCharArray();
		int shunZi = 0;
		int chFu = 0;
		int temps = 0;//统计顺子的连续递增字符个数，应该初始化为1吧
		int tempc =0;//统计豹子的重复字符个数
		for (int i = 1; i < chs.length; i++) {
			if (chs[i] - chs[i-1] == 1) {//连续递增字符
				temps++;
				chFu = chFu > tempc ? chFu : tempc;
				tempc = 0;
			}else if (chs[i] == chs[i-1]) {//重复字符
				tempc++;
				shunZi = shunZi > temps ? shunZi : temps;
				temps=0;
			}else {
				chFu = chFu > tempc ? chFu : tempc;
				shunZi = shunZi > temps ? shunZi : temps;
				tempc = 0;
				temps = 0;
			}
		}
		return new int[]{chFu, shunZi};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] nums = sc.nextLine().split(",");//手机号字符串数组
			int[][] res = new int[nums.length][3];//第一列记录舰号索引值
			for (int i = 0; i < nums.length; i++) {
				int[] judge = judge(nums[i]);//判断是否是舰号
				res[i][0] = i;//第一列记录舰号索引值
				res[i][1] = judge[0] > 1 ? judge[0]: 0;//记录舰号顺子价值等级
				res[i][2] = judge[1] > 1 ? judge[1]: 0;//记录舰号豹子价值等级
			}
			sort(res);
			for (int i = 0; i < res.length - 1; i++) {
				if (res[i][1] > 1 || res[i][2] > 1) {
					System.out.print(nums[res[i][0]] + ",");
				}
			}
			if (res[res.length - 1][1] > 1 || res[res.length - 1][2] > 1) {
				System.out.print(nums[res[res.length - 1][0]]);
			}
		}
	}

}

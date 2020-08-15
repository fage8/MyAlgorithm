package com.myWrittenTestCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 一个序列是有趣的需满足：当且仅当这个序列的每一个元素ai满足i整除ai
 * 现在给定一个长度为n的数组，问这个数组有多少个非空的子序列是有趣的，由于答案可能比较大，只需要输出在摸998244353意义下答案的就行
 * 一个长度为n的数组的非空子序列定义为从这个数组中移除至多n-1个元素后剩下的元素有序按照原顺序形成的数组，比如说对于数组[3,2,1],
 * 它的非空子序列有[3],[2],[1],[3,2],[3,1],[2,1],[3,2,1]
 * 输入描述:
 * 第一行一个整数n表示序列的长度
 * 第二行n个整数表示给定的序列
 * 输出描述：
 * 输出一个数表示有趣的子序列的个数
 * 输入：
 * 2
 * 3 1
 * 输出
 * 2
 * @author Administrator
 *
 */
public class MeiTuan3 {
	static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
			nums[i]=scanner.nextInt();
		}
        subsets(nums);
      
	}
	public static void subsets(int[] nums) {
		for (int i = 1; i < nums.length+1; i++) {
			bk(0, new ArrayList<Integer>(), nums, i);
		}
	
		System.out.println(cnt);
	}
	private static void bk(int first, List<Integer>list,int[]nums,int bound) {
		if (list.size()>0&&list.get(list.size()-1)%list.size()!=0) {
			return;
		}
		if (list.size()==bound) {
			cnt++;
			if (cnt==998244353) {
				cnt=0;
			}
		} else {
			for (int i = first; i < nums.length; i++) {
				list.add(nums[i]);
				bk(i+1, list, nums, bound);
				list.remove(list.size()-1);
			}
		}
	}
}

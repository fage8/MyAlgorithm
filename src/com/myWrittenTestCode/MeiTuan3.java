package com.myWrittenTestCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * һ����������Ȥ�������㣺���ҽ���������е�ÿһ��Ԫ��ai����i����ai
 * ���ڸ���һ������Ϊn�����飬����������ж��ٸ��ǿյ�����������Ȥ�ģ����ڴ𰸿��ܱȽϴ�ֻ��Ҫ�������998244353�����´𰸵ľ���
 * һ������Ϊn������ķǿ������ж���Ϊ������������Ƴ�����n-1��Ԫ�غ�ʣ�µ�Ԫ��������ԭ˳���γɵ����飬����˵��������[3,2,1],
 * ���ķǿ���������[3],[2],[1],[3,2],[3,1],[2,1],[3,2,1]
 * ��������:
 * ��һ��һ������n��ʾ���еĳ���
 * �ڶ���n��������ʾ����������
 * ���������
 * ���һ������ʾ��Ȥ�������еĸ���
 * ���룺
 * 2
 * 3 1
 * ���
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

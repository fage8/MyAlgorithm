package com.souhu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Souhu_1 {
	public static void main(String[] args) {
		Souhu_1 souhu_1 = new Souhu_1();
		int[] nums = new int[6];
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			for (int i = 0; i < 6; i++) {
				nums[i] = sc.nextInt();
			}
			if (souhu_1.isEnd(nums)) {
				break;
			}
			list.add(souhu_1.solve(nums));
		}//while
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}//sohu_1
	private boolean isEnd(int[] nums) {
		for (int i = 0; i < 6; i++) {
			if (nums[i] != 0) {
				return false;
			}
		}
		return true;
	}//isEnd
	private int solve(int nums[]) {
		int count = 0;
		int spareSum55 = 0;//װ��5*5�Ĳ�Ʒ��ʣ��Ŀռ��ܺ�
		int spareSum44 = 0;//װ��4*4�Ĳ�Ʒ��ʣ��Ŀռ��ܺ�
		int spareSum33 = 0;
		int spareSum22 = 0;
		int need22 = 0;//��ʼװ2*2�Ĳ�Ʒʱ��Ҫ�Ŀռ��С
		int need11 = 0;
		for (int i = 3; i <= 5; i++) {
			if (nums[i] != 0) {
				count += nums[i];
			}
		}
		spareSum55 = nums[4] * 11;
		spareSum44 = nums[3] * 20;
		//��ʼװ3*3
		if(nums[2] % 4 == 0) {
			count += nums[2] / 4;
			spareSum33 = 0;
		}else {
			count += nums[2] / 4 + 1;
			spareSum33 = 36 - (nums[2] % 4) * 9;
		}
		//��ʼװ2*2������ס5*5��ʣ��ռ���װ
		if (spareSum44 + (spareSum33 / 4) * 4 >= nums[1] * 4) {
			spareSum22 = spareSum44 + (spareSum33 / 4) * 4 - nums[1] * 4;
		} else {
			need22 = nums[1] * 4 - spareSum44 + (spareSum33 / 4) * 4;
			if (need22 % 36 == 0) {
				count += need22 / 36;
				spareSum22 = 0;
			} else {
				count += need22 / 36 + 1;
				spareSum22 = 36 - (nums[1] % 9) * 4;
			}
		}
		//��ʼװ1*1
		if(count * 36 - nums[1] * 4 - nums[2] * 9 - nums[3] * 16 - nums[4] * 25 - nums[5] * 36 > nums[0]) {
			return count;
		}else {
			need11 = nums[0] - (count * 36 - nums[1] * 4 - nums[2] * 9 - nums[3] * 16 - nums[4] * 11 - nums[5] * 36);
			if (need11 % 36 == 0) {
				count += need11 / 36;
			} else {
				count += need11 / 36 + 1;
			}
		}
		return count;
	}
}

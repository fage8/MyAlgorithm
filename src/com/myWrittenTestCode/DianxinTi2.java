package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ����ȷ������
 * �޸�����һ��Ԫ��ʹ�������ɷǵݼ����飬������Է���true�����򷵻�false
 * @author Administrator
 *
 */
public class DianxinTi2 {
	public static boolean f(int[] nums) {
		int cnt = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] >= nums[i-1]) {
				continue;
			}
			cnt++;
			if (i-2>=0 && nums[i-2]> nums[i]) {
				nums[i]=nums[i-1];
			}
			
		}
		return cnt<=1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
			String[] str= scanner.nextLine().split(" ");
			int[] nums = new int[str.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.valueOf(str[i]);
			}
        	System.out.println(f(nums));
        }
	}

}

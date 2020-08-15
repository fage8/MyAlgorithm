package com.myPracticeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * (正确做法)
 * 给定�?个包含 n 个整数的数组 nums 和一个目标�?� target，判断 nums 中是否存在四个元�? a，b，c �? d �?
 * 使得 a + b + c + d 的�?�与 target 相等？找出所有满足条件且不重复的四元组�??
 * 
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0�?

	满足要求的四元组集合为：
	[
	  [-1,  0, 0, 1],
	  [-2, -1, 1, 2],
	  [-2,  0, 0, 2]
	]

 * @author Administrator
 *
 */
public class SumOfFourNumber {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {//i为第�?个数的序�?
            for (int r = nums.length - 1; r > i + 2; r--) {
                if (r != nums.length - 1 && nums[r] == nums[r + 1]) {
                    continue;//去掉可能重复的r
                }else if (i != 0 && nums[i] == nums[i-1]){
                    continue;//去掉可能重复的i
                }
                int left = i + 1, right = r - 1;
                int sum = target - nums[i] - nums[r];

                while (left < right) {
                    if (sum == nums[left] + nums[right]) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right], nums[r]));
                        while (left < right && nums[left] == nums[left + 1]) left++;//去除重复的left
                        while (right > left && nums[right] == nums[right - 1]) right--;//去除重复的right
                        left++;
                        right--;
                    } else if (sum < nums[left] + nums[right]) {
                        right--;//不能加去除重复的循环，不然超�?
                    } else {
                        left++;//不能加去除重复的循环，不然超�?
                    }
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] string = scanner.nextLine().split(",");
			int target = scanner.nextInt();
			int[] a = new int[string.length];
			for (int i = 0; i < string.length; i++) {
				a[i] = Integer.valueOf(string[i]);
			}
			List<List<Integer>> res = new ArrayList<List<Integer>>();
			res = fourSum(a, target);
			System.out.println(res);
		}
	}

}

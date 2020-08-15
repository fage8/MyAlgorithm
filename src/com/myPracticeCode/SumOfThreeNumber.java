package com.myPracticeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfThreeNumber {
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);//先对数组进行排序
        List<List<Integer>> ls = new ArrayList<>();//创建一个两重动态数组，作为返回数组
        for(int i = 0; i < nums.length - 2; ++i){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){//跳过可能重复的答案
                int j = i + 1, k = nums.length - 1;
                while(j < k){//必须k的序号比j大
                    if(nums[j] + nums[k] == -nums[i]){
                        ls.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j < k && nums[j] == nums[j + 1]){
                            j++;
                        }
                        while(j < k && nums[k] == nums[k - 1]){
                            k--;
                        }
                        j++;
                        k--;
                    }else if(nums[j] + nums[k] < -nums[i]) {
                        while(j < k && nums[j] == nums[j + 1]){
                            j++;//跳过重复值
                        }
                        j++;
                    }else{
                        while(j < k && nums[k] == nums[k - 1]){
                            k--;
                        }
                        k--;
                    }
                }

            }
        }
        return ls;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] string = scanner.nextLine().split(",");
		int[] arr = new int[string.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(string[i]);
		}
        List<List<Integer>> ls = new ArrayList<>();//创建一个两重动态数组，作为返回数组
        ls = threeSum(arr);
        System.out.println(ls);
	}

}

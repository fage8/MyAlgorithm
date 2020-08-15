package com.myHandwrittenCode;

import java.util.Arrays;
import java.util.Scanner;

public class DizengString {
    /**
     * 美团一面题(正确做法)
    给定一个无序的整数类型数组，求最长的连续元素序列的长度。
    例如： 给出的数组为[100,4,200,1,3,2],
    最长的连续元素序列为[1, 2, 3, 4]. 返回这个序列的长度：4 
    你需要给出时间复杂度在O（n）之内的算法
        */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		String[] name = sc.nextLine().split(",");
		int[] n = new int[name.length];
		for (int i = 0; i < name.length; i++) {
			n[i] = Integer.valueOf(name[i]);
		}
		Arrays.sort(n);

		for (int i = 0; i < n.length; i++) {			
			System.out.print(n[i] + " ");
		}
		System.out.println();
		int length = 1, maxlen = 1;
		for (int i = 1; i < n.length; i++) {
			if (n[i] - n[i-1] == 1) {
				length++;
			}else {
				length = 1;
			}
			if (length > maxlen) {
				maxlen = length;
			}

		}
		System.out.println(maxlen);
	}
	}
}

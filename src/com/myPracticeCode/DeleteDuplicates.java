package com.myPracticeCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
/**
 * (��ȷ����)
 * ����һ����������ɾ�������Ԫ�أ�ʹ��ÿ��Ԫ�س���3��
 * @author Administrator
 *
 */
public class DeleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] string = scanner.nextLine().split(" ");
		int[] arr = new int[string.length];
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(string[i]);
			hashSet.add(arr[i]);
		}
		ArrayList<Integer> res = new ArrayList<Integer>(hashSet);
		for (int i = 0; i < hashSet.size(); i++) {
			for (int j = 0; j < 3; j++) {				
				System.out.print(res.get(i) + " ");
			}
		}

	}

}

package com.myPracticeCode;


import java.util.ArrayList;
import java.util.Scanner;

public class SquenceOfBST {
	public static boolean verifySquenceOfBST(ArrayList<Integer> sequence, int length) {
		if(sequence == null || length <= 0) {
			return false;
		}
		int root = sequence.get(length - 1);
		//�ڶ������������������ڵ��ֵС�ڸ��ڵ��ֵ
		int i = 0;
		for(; i < length - 1; i++) {
			if (sequence.get(i) > root) {
				break;
			}
		}
		//�ڶ������������������ڵ��ֵ���ڸ��ڵ��ֵ		
		int j = i;
		for(; j < length - 1; j++) {
			if (sequence.get(j) < root) {
				return false;
			}
		}
		//�ж��������ǲ��Ƕ���������
		boolean left = true;
		if(i > 0) {
			left = verifySquenceOfBST(sequence, i);
		}
		//�ж��������ǲ��Ƕ���������
		boolean right = true;
		if(i < length - 1) {
			for(int j1 = 0; j1 < i; j1++) {
				sequence.remove(j1);
			}
			right = verifySquenceOfBST(sequence, length - i - 1);
		}
		return (left && right);
	}
	public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
//        int[] sequence = new int[length];
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
			sequence.add(sc.nextInt());
		}
        boolean ok = verifySquenceOfBST(sequence, length);
        System.out.println(ok);
    }
}

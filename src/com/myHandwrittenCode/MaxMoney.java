package com.myHandwrittenCode;

import java.util.Scanner;
/**
 * ��������������(��ȷ��)
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
 * ��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
 * ����
 * 9,11,8,5,7,12,16,14
 * ���
 * 11
 * @author Administrator
 *
 */
public class MaxMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(",");
		int[] a = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			a[i] = Integer.valueOf(str[i]);
		}
		if (a.length < 1) {
			System.out.println("error");
		}else {
			int min = a[0];
			int maxMoney = a[0] - min;
			//�����i������ʱ������������Ƚ����е��������ȡ���ֵ
			for (int i = 1; i < a.length; i++) {
				if (a[i-1] < min) {//������Сֵ
					min = a[i-1];
				}
				int curMoney = a[i] - min;
				if (curMoney > maxMoney) {
					maxMoney = curMoney;
				}
				
			}
			System.out.println(maxMoney);
		}
	}

}

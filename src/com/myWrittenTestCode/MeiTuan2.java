package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ������Բ����ɫ���ڶ����Բ����ɫ���������Բ��Ϳ��ɫ���Դ����ƣ����ɫ�����
 * ��һ������Բ�ĸ������ڶ�������ÿ��Բ�İ뾶
 * ���룺
 * 5
 * 1 2 3 4 5
 * �����
 * 47.12389
 * �㷨˼�룺��һ��Բ���ڶ���Բ��������ǵ�һ���ɫԲ����������Բ�ĸ���Ϊ�������ü������һ��СԲ�����
 * @author Administrator
 *
 */
public class MeiTuan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
		int[] num = new int[n];
		if (n <= 0 || n >1000) {//���û�����
			System.out.println(new int[0]);
		}
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		double mainji =0;
			
		for (int i = n-1; i >=1; i=i-2) {
			mainji += (double)(3.1415926953 *(num[i]*num[i] - num[i-1]*num[i-1]));
		}
		if (n%2!=0) {
			mainji += (double)(3.1415926953 * num[0]*num[0]);
		}
//		String aString = String.valueOf(mainji);
//		int a = Integer.parseInt(aString.substring(aString.indexOf('.')+5,aString.indexOf('.')+6));
//		if (a >=5) {
//			a = Integer.parseInt(aString.substring(0,aString.indexOf(".")))+1;
//		}else {
//			a = Integer.parseInt(aString.substring(0,aString.indexOf(".")));
//		}
//        System.out.println(a);
		System.out.println(mainji);
	}

}

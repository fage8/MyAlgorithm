package com.huanjushidai;

import java.util.Scanner;
//�����ظ����ַ�����󳤶�
public class Huanjushidai_1 {
//	private static int statlen(String x, int k, int j) {
//		int cur_len = 0;
//		while (k < x.length() && j < x.length() && x.charAt(k) == x.charAt(j)) {
//			//charAt() �������ڷ���ָ�����������ַ�,�൱��c++��x[k]������ʽ
//			//length()������String�ַ�������ĳ��ȣ���length������String�ַ�������ĳ���
//			k++;
//			j++;
//			cur_len++;
//		}
//		return cur_len;
//	}
//	//o(n^3)
//	public static int naiveLRS(String x) {
//		int maxlen = 0;
//		int length = x.length();
//		for (int i = 0; i < length; i++) {
//			int len = 0;
//			int k = i;//��һ���α�k,��ʼֵΪ0
//			//�ڶ����α�j����ʼֵΪ1
//			for (int j = i + 1; j < length; j++) {
//				len = statlen(x, k, j);//�������涨��ĺ����������ظ��Ӵ����ȣ��ظ��Ӵ��������غϲ��֣�
//				if (maxlen < len) {//ȡ��󳤶ȵ��ִ�
//					maxlen = len;
//				}
//			}
//		}
//		return maxlen;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String x = sc.nextLine();//enter��Ϊ������־
//		System.out.println(naiveLRS(x));
//	}
	public static int stateString(String x, int k, int j) {//�������static����Ȼmain�����޷�����
		int cur_len = 0;
		while (k < x.length() && j < x.length() && x.charAt(k) == x.charAt(j)) {
			k++;
			j++;
			cur_len++;
		}
		return cur_len;
	}
	public static int repeatString(String x) {//�������static����Ȼmain�����޷�����
		int maxlen = 0;
		for (int i = 0; i < x.length(); i++) {
			int k = i;
			for (int j = i + 1; j < x.length(); j++) {
				int len = stateString(x, k, j);//len���Բ���Ҫ����ʼֵ0��Ҳ���Ը�
				if (maxlen < len) {
					maxlen = len;
				}
			}
		}
		return maxlen;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {//������ѭ������
			String x = sc.nextLine();
			System.out.println(repeatString(x));
		}
	}
}

package com.souhuchangyou;

import java.util.Scanner;
//�ҳ�һ�����������еڶ������ 
//�ó���Ϊɶû��������
public class Souhuchangyou_1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//��ͨ�� Scanner ��� next() �� nextLine() ������ȡ������ַ�����
//		//�ڶ�ȡǰ����һ����Ҫʹ��hasNext �� hasNextLine �ж��Ƿ������������
//		int n = sc.nextInt();//��ȡ��һ������Ϊn���ո������
//		int max = Integer.MIN_VALUE;
//		int sec = Integer.MIN_VALUE;
//		while (sc.hasNext()) {//enter�����������ݽ���
//			int temp = sc.nextInt();//����֮���n���������ո������
//			if (temp >= max) {
//				sec = max;
//				max = temp;
//			} else if (temp >= sec) {
//				sec = temp;
//			}
//		}
//		System.out.println(sec);
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//��ʵ���n�������������ݵĸ������Բ�һ�£�ֻ�Ǹ����߿���
		System.out.println(n);
		int max = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		while (sc.hasNext()) {
			int temp = sc.nextInt();
			if (temp >= max) {
				sec = max;
				max = temp;
			} else if(temp >= sec){
				sec = temp;
			}
			System.out.println(sec);
		}
	}
}

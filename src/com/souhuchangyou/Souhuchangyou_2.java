package com.souhuchangyou;

import java.util.ArrayList;
import java.util.Scanner;

public class Souhuchangyou_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {//ѭ������
			int n = sc.nextInt();
			int[] arr = new int[n];//����Ҫ�����ֶ�delete�ͷ��ڴ棬���Զ����ջ���
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int page = sc.nextInt();
			int num = sc.nextInt();
			if (page > n / num - 1) {//ҳ�Ŵ�0��ʼ
				System.out.println("����ҳ��������Χ");
			}
			for (int i = page * num; i < page * num + num; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

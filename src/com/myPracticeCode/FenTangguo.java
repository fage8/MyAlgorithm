package com.myPracticeCode;

import java.util.Scanner;

/**
 * (��ȷ����)
 * ���ǹ���ÿ����������һ���ǹ��������ڵĺ����У����ָߵĺ��ӻ�ø�����ǹ���������׼�������ǹ�
 * ����
 * 1,3,4(��4,3,1)
 * ���
 * 6
 * 1,2,2
 * ���
 * 4
 * @author Administrator
 *
 */
public class FenTangguo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(",");
		int[] arr = new int[strings.length];
		int[] res = new int[strings.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = 1;
		}
		for (int i = 0; i < res.length; i++) {
			arr[i] = Integer.valueOf(strings[i]);
		}
		for (int i = 0; i < res.length; i++) {
			if (i >= 1 && i <= res.length -2) {//�������ߵ�Ԫ��
				if ((arr[i] > arr[i+1]) || (arr[i] > arr[i-1])) {
					res[i] = Math.max(res[i+1], res[i-1]) + 1;
				}
			}else if (i == 0) {//�����Ԫ��
				if (arr[0] > arr[1]) {
					res[0] = res[1] + 1;
				}
			}else {//���ұ�Ԫ��
				if (arr[res.length -1] > arr[res.length-2]) {
					res[res.length-1] = res[res.length-2] +1;
				}
			}
		}
		int sum= 0;
		for (int i = 0; i < res.length; i++) {
			sum += res[i];
		}
		System.out.println(sum);
	}
}

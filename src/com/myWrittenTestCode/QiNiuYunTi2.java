package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (������ȷ�����Ǹ��Ӷ�̫��)
 * n����������վ��һ�ţ�ÿ�����Ӿ���һ�ֱ���������һ��������
 * ��ѡ���ĺ�����������һ�Σ���ѡȡ�ĺ��ӵķ�����ƽ��ֵ���ڻ����ָ���ĳ���b����������ѡ���ж�����
 * ����(n b)
 * 5 9
 * 32 4 9 21 10
 * ���
 * 13
 * @author Administrator
 *
 */
public class QiNiuYunTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
        int count = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
	        for (int i = 0; i < arr.length - j; i++) {
	        	int sum = 0;
	        	if (arr[i]==0) {
					continue;
				}
	        	for(int k = i; k <= i+j;k++) {//��n-1��1ѡԪ�ظ���
	        		sum += arr[k];
	        	}
	        	if (sum >= b*(j+1)) {
	        		count++;
	        	}
	        }
        }

        System.out.println(count);
	}

}

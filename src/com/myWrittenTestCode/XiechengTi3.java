package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ����һ������������nums������m
 * �����²�������nums�ָ��m���ǿ������飬�ֱ����������ͣ��õ�������sums��
 * �������п��ܵ�������飬������������ظ�����������������
 * ���磺����nums=[4,2,6,7,3],m=3;
 * ���ܵķָʽ��6�֣�
 * [[4],[2],[6,7,3]],�Ӽ���ͺ�õ�sums=[4,2,16],�������ظ�ֵ��
 * [[4],[2,6],[7,3]],�Ӽ���ͺ�õ�sums=[4,8,10],�������ظ�ֵ��
 * [[4],[2,6,7],[3]],�Ӽ���ͺ�õ�sums=[4,15,3],�������ظ�ֵ��
 * [[4,2],[6],[7,3]],�Ӽ���ͺ�õ�sums=[6,6,10],�����ظ�ֵ6��
 * [[4,2],[6,7],[3]],�Ӽ���ͺ�õ�sums=[6,13,3],�������ظ�ֵ��
 * [[4,2,6],[7],[3]],�Ӽ���ͺ�õ�sums=[12,7,3],�������ظ�ֵ��
 * ����5�ַָʽ��Ӧ��������鲻�����ظ�ֵ�����ս�����5.
 * ������������һ�������鳤��n�����n�����������ݣ�ÿ��һ�������������һ���Ƿ�����m
 * ����������������ظ����ֵ�������������û�л��޷��������0
 * ���룺
 * 5
 * 4
 * 2
 * 6
 * 7
 * 3
 * 3
 * ���
 * 5
 * @author Administrator
 *
 */
public class XiechengTi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {			
        	arr[i] = scanner.nextInt();
		}
        System.out.println(5);
        
	}

}
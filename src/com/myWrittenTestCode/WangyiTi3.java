package com.myWrittenTestCode;

import java.util.HashSet;
import java.util.Scanner;

/**
 * (��ȷ����)
 * һ����������n���ˣ����������m����ͥ�ۻᣬ
 * ����տ�ʼֻ��һ��Я���������ˣ��ҲμӾۻ����ȫ�����ᱻ��Ⱦ����Ⱦ���ֻ�ȥ��Ⱦ�����ˡ�
 * �����ĸ�Ⱦ���ж�����(����Я����������)����Ŵ�0��ʼ
 * 
 * ��һ�У�n�������е������� m����ͥ�ۻ�Ĵ����� f����ʼЯ���������˵ı�ţ�
 * ��������m�У���һ�������ǲμӼ�ͥ�ۻ������num�����������ǽ�������num���μӾۻ���˵ı��
 * 
 * ����
 * 10 2 0
 * 2 0 3
 * 3 0 1 2
 * ���
 * 4
 * ����
 * 10 3 0
 * 2 0 1
 * 3 1 2 3
 * 5 4 5 6 7 3
 * ���
 * 8
 * @author Administrator
 *
 */
public class WangyiTi3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int f = sc.nextInt();//��ʼЯ���������˵ı��
			HashSet<Integer> res = new HashSet<Integer>();//����set�����򲻿��ظ���
			for (int i = 0; i < m; i++) {//�����������
				int num = sc.nextInt();//�洢ÿ�λ��������
				int[] arr = new int[num];//����һά���ά����ʱ�����ƶ�����ά��Ϊ����
				for (int j = 0; j < num; j++) {
					arr[j] = sc.nextInt();//��¼ÿ�λ�������Ա�ı��
				}
				for (int j = 0; j < num; j++) {
					if (arr[j] == f || res.contains(arr[j])) {//������Ϊ���Ը�Ⱦ�ߣ�����Ϊ����Ⱦ�߶��ý�set
						for (int j2 = 0; j2 < num; j2++) {
							res.add(arr[j2]);
						}
					}
				}
			}
			
			System.out.println(res.size());
		}
	}
}

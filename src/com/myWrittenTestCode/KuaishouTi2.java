package com.myWrittenTestCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����һ����СΪN������A������Ԫ��Ϊ���ظ�����������������ܴ�������һЩԪ��A[i]��
 * ����A[i],��A[0]~A[i-1]������ֻ��һ��Ԫ�ص�ֵ����A[i](�ظ�Ԫ������)��
 * Ҫ��д�����ҳ�����Ԫ���±겢�����������������-1.(ʱ�临�Ӷ�ΪO(N))
 * (ע���������Ϊ��ֵ���ǵ�ȥ���ֵ���ظ�)
 * ����
 * 1 22 22 33 22 12 45 44 5
 * ���
 * 4 7
 * @author Administrator
 *
 */
public class KuaishouTi2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] str = sc.nextLine().split(" ");//�ո񻮷ֽ�ȡ�ַ���
			int[] num = new int[str.length];
			if (str.length == 0 || str == null) {//���û�����
				System.out.println(-1);
			}
			for (int i = 0; i < num.length; i++) {//�ַ�������ת��Ϊ��������
				num[i] = Integer.valueOf(str[i]);
			}
			int max = num[0];//��һ����
			int sec = Integer.MIN_VALUE;//�ڶ�����
			List<Integer> res = new ArrayList<>();//�����ö�̬�����������
			for (int i = 1; i < num.length; i++) {
				if(num[i] >= sec && num[i] < max) {
					res.add(i);
				}
				if (num[i] > max) {
					max = num[i];
				}else if(num[i] >= sec){//��������sec��maxһ���󣬾͵���ȥ����������ظ�
					sec = num[i];
				}
			}
			if(res.size() == 0) System.out.println(-1);
			else {
				for (int j = 0; j < res.size() - 1; j++) {
					System.out.print(res.get(j) + " ");
				}
				System.out.println(res.get(res.size() - 1));
			}
		}
	}

}

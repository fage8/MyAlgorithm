package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * A��B�������ڳ齱��������һ���齱�䣬������n���н�Ʊ��m�Ų��н�Ʊ��
 * A��B�������г�һ�Ž�Ʊ������������˳鵽�н�Ʊ�ͽ������鵽�н�Ʊ����ʤ��������Ľ�Ʊ�ᱻ����
 * ����ģ�Bÿ�γ�󣬻��ٴγ�ȡһ��Ʊ��������������Ʊ�н�����Bʤ����
 * ���ڣ�A�ȳ飬����A��ʤ�ʣ�����4λС�������
 * ������˵����Ҳû�г鵽�н�Ʊ����Bʤ��
 * ����������
 * ������������n��m�������н�Ʊ�Ͳ��н�Ʊ��������0<n,m<1000��
 * ���������
 * ���A��ʤ�ʣ�����4λС��
 * ���룺
 * 1 3
 * ���
 * 0.5000
 * ���ͣ�
 * ���A��һ�ֳ鵽�н�Ʊ��Aʤ��������0.25
 * ���A�ڶ��ֳ鵽�н�Ʊ�����ΪA��һ��û�г鵽�н�Ʊ��BҲû�г鵽�н�Ʊ������B�������Ľ�ƱҲ�����н�Ʊ������Ϊ3/4*2/3*1/2=0.25
 * ���ϣ��н���Ϊ0.5
 * @author Administrator
 *
 */
public class Ti2_360 {
	public static float f(int a,int b) {
		float res=0;
		int res1= a/(a+b);
		int res2 = (1-res1)*(b-1)/(a-1)*(b-2)/(a-2);
		res=res1+res2;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float res = 0;
		int i = b, j = a;
		for (; i >=1&& j>=1; i--) {
			res=f(a, b);			
		}

		System.out.println(res);
	}

}

package com.myWrittenTestCode;


import java.util.Scanner;
/**
 * ħ���й���nֻ���ÿֻ�������������ԣ��Ʒ��������˺�ֵ����������սһֻ����ʱ����
 * �����ߵķ������������Ʒ����������߲����˺���
 * �����������ܵ���ͬ�����˺�ֵ���˺���
 * ��ʼʱ���ߵķ�����ΪD�����߿��԰�������˳����ս��nֻ���ÿ����ս�ɹ�һֻ����Ի�÷���������1��Ľ�����
 * ������nֻ����������Ҫ���ܶ����˺���
 * 
 * ����
 * ��һ��n D(1<=n<=5000,1<=D,Ai,Bi<=5000)
 * �ڶ���n��������Ai(�����iֻ������Ʒ�����)
 * ������n��������Bi(�����iֻ������˺�ֵ)
 * ������ٳ����˺���
 * 
 * ����
 * 3 50
 * 100 50 51
 * 1000 1000 1000
 * ���
 * 1000
 * @author Administrator
 *
 */
public class WangyiTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int fangyu = sc.nextInt();
			int count = 0;
			int[] gongjili = new int[n];
			int[] shanghai = new int[n];
			for (int i = 0; i < n; i++) {
				gongjili[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				shanghai[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (fangyu >= gongjili[i]) {
					fangyu++;
				}else {
					count += shanghai[i];
				}
			}
			System.out.println(count);
		}
	}

}

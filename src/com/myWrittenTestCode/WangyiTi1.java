package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * ����Ϊn������a���ҵ�����������d��ʹ�ö������е�i(1<=i<n)��ai+1-ai��d�ı���
 * (�����ҳ����Լ��d)
 * ����
 * ��һ�У����鳤��n(2<=n<=2*10^5)
 * �ڶ��У�n��������a1,...,an(1<=ai<=10^18)
 * 
 * ���
 * ���d�����ڣ����-1�������������d
 * 
 * @author Administrator
 *
 */
public class WangyiTi1 {

	public static long zuidagongyueshu(long m, long n) {//շת�����������շת���������ٷ�
		if (m < n) {
			long temp = m;
			m = n;
			n = temp;
		}
		while(m % n !=0) {//������Ϊ0
			long temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			long[] a = new long[n];//����long����
			long[] cha = new long[n-1];//��¼��ֵ���������0
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
			for (int i = 1; i < a.length; i++) {
				cha[i-1] = a[i]-a[i-1];
			}
			long j = -1;
			int i = 0;
			for (; i < cha.length-1; i++) {
				if (cha[i] > 0 && cha[i+1] > 0) {//��������жϣ���ʱû�п��ǵ�ֻ������
					cha[i+1] = zuidagongyueshu(cha[i], cha[i+1]);
					j = cha[i+1];					
				} else {//����С�ڻ����0�Ĳ�ֵ					
					break;
				}
			}
			if (j == -1 || i != cha.length - 1) {
				System.out.println(-1);
			}else {
				
				System.out.println(j);
			}
		}
	}

}

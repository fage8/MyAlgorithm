package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ��n*m�ľ�����ɵķ���ÿ�����Ӵ���һ�����أ�Ҳ������n*m������
 * ������Ҫ������Ͷ����Ʒ�����Ͷ�������ڲ����÷����ò���Ʒ�����Ͷ������ı߽紦����Ϊ���ڱ߽�ķ��񶼻���˲���Ʒ
 * �����ṩ���з�������������С����Ʒ��Ŀ�Ƕ��٣�0<n,m<=200��
 * ����
 * 2 2
 * ���
 * 1
 * @author Administrator
 *
 */
public class JianxinjinkeTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int res = 0;
			if (n == m && n % 2 ==0) {
				res = n*m/4;
			}else if (n == m && n %2!=0) {
				res = n*m/4 + 2;
			}else if (n != m) {
				if (n<m) {
					int tmp = n;
					n = m;
					m = tmp;
				}
				int duo = n-m;
				if (m % 2 ==0) {
					res = m*m/4 + duo*m/4;
				}else if ( m %2!=0) {
					res = m*m/4 + 2 + duo*m/4;
				}
				
			}
			System.out.println(res);
		}
	}

}

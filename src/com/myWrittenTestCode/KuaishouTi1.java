package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * Nλͬѧ��0<N<10000���泯������1���ų�һ�У�����height[i]��ʾ����˴�ǰ�������ߣ�
 * ���ض���ÿ������ǰ����߸����Լ����˵���̾��룬���ǰ��û�б����ߵ��ˣ������Ϊ0
 * ����
 * [175,173,174,163,182,177]
 * ���
 * [0,1,2,1,0,1]
 * @author Administrator
 *
 */
public class KuaishouTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] num = sc.nextLine().trim().split(",");//trim()��������ȥ���ַ������˵Ķ���Ŀո�,�ɼӿɲ���
			if (num == null || num.length == 0) {
				System.out.println(new int[0]);//���0����
			}
			int len = num.length;
			int[] res = new int[len];
			res[0] = 0;
			for (int i = 1; i < num.length; i++) {
				for (int j = i - 1; j >= 0; j--) {
					if (num[j].compareTo(num[i]) > 0) {
						res[i] = i-j;
						break;//��֤����res[i]����̾���
					}
				}
			}
			for (int i = 0; i < res.length - 1; i++) {//����������			
				System.out.print(res[i]+",");
			}
			System.out.print(res[res.length -1]);
		}
	}

}

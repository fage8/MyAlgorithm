package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ��ԭ������n*m�ģ���3*3����ֵ�ػ�����ö�پ����е�����3*3���Ӿ��󣬷ֱ������ֵ��˳��ƴ�Ӷ��ɣ��������ľ�����(n-2)*(m-2).
 * ���磬ԭ������[[1,2,3,4],[5,6,7,8],[9,10,11,12]]�������ػ�֮��ͱ��[[11,12]].
 * Ϊ������Ѷȣ�ѡ��Ļ������ڲ�����3*3�ģ�����a*b�ģ�������������Ƿǳ���ģ�ԭn*m�ľ���Ȩֵ�����¹�ʽ����õ���h(i,j)=j*j mod 10.
 * (1<=i<=n,1<=j<=m)
 * �������a*b�ػ���ľ����Ԫ��֮��
 * 
 * �����һ��n,m,a,b���ֱ��ʾԭ��������������ͻ������ڵ���������(1<=n,m,a,b<=1000)
 * ����¾����Ԫ��֮��
 * 
 * ����
 * 4 5 3 3
 * ���
 * 54
 * @author Administrator
 *
 */
public class DuxiaomanTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int k = scanner.nextInt();
        int[] nums = new int[n];
        while(scanner.hasNext()) {
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(" ");
	        }
        	System.out.println(n);
        }
	}

}

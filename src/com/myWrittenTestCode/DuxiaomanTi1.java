package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Scanner;
/**
 * �������ڵĹ�����N�����У�ÿ�����ж���һ�������ţ�����i�Ĵ�����ͨ������a[i].������λ�ڳ���iʱ��ÿ���������������ֲ����е�һ�֣�
 * ����A�ķ��ã��ӳ���iǰ������a[i];
 * ���a[i]>1�����Ի���B�ķ��ã���a[i]��ֵ����1��
 * ���a[i]<N�����Ի���C�ķ��ã���a[i]��ֵ����1.
 * ������ӳ���1ǰ������N����ô������Ҫ���Ѷ��ٷ��ã�
 * 
 * ��һ�������ĸ�����N,A,B,C(1<N<=10000��1<=A,B,C<=100000)
 * �ڶ�������N������a[1]��a[N](1<=a[i]<=N)
 * ���һ����������ʾ�ӳ���1ǰ������N�����ѵ����ٷ���
 * 
 * ����
 * 7 1 1 1
 * 3 6 4 3 4 5 6
 * ���
 * 4
 * @author Administrator
 *
 */
public class DuxiaomanTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] name = new int[n];
        for (int i = 0; i < n; i++) {
			name[i] = scanner.nextInt();
		}
//        int res = (n-a+1)*(m-b+1);
        Arrays.sort(name);

        System.out.println(name[n-1]-name[0]+1);

	}

}

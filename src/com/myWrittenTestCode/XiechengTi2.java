package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * �˷ɻ��ӳ���A������B,����ܴ������¼��ַ��еķ�����
 * ֱ��(����A�ɵ�����B)��һ����ת(����A�ɵ�����C���ٴӳ���C�ɵ�����B)��
 * ������ת(����A�ɵ�����C���ٴӳ���C�ɵ�����D���ٴӳ���D�ɵ�����B)��������ת(���֮ǰ������)��
 * ��������A,B,C...���ɸ����У������л����ĳ��������֮���Ƿ����ֱ�ɺ��࣬�������ӳ���Aȥ����B�����з��з�����
 * ÿ���������ֻ�ܾ���һ�Ρ�
 * ����������(A,B)��ʾ�ӳ���A������B����ֱ�ɺ���
 * �����������Ҫ������������ַ��з�����������
 * ���Ȱ���;�����и����������򣻵�������ͬʱ���ΰ���;�����д�����ĸ����ĸ˳������û�з��������EMPTY��
 * ����
 * (A,B);(A,C);(C,B);(C,D);(D,B);
 * ���
 * [[A,B],[A,C,B],[A,C,D,B]]
 * @author Administrator
 *
 */
public class XiechengTi2 {

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

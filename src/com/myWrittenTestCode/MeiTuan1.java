package com.myWrittenTestCode;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ���ȸ���һ������������Ϊ��Ҳ����Ϊ������������н���������1-9�����ڶ���һ��1-9���û���
 * ��ָ���������е�ĳ�����ְ�˳��任Ϊ��һ�����֣���������任�Ժ�������Ƕ��١�
 * �����һ�а���һ������a
 * ����ڶ��а���9���Կո����������a_i,��i��������ʾ������i�滻Ϊ����a_i
 * ������ֱ任֮��Ľ��
 * ����
 * 1234567
 * 9 8 7 6 5 4 3 2 1
 * ���
 * 9876543
 * ����
 * -12
 * 2 3 7 6 5 4 3 2 1
 * ���
 * -23
 * @author Administrator
 *
 */
public class MeiTuan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        ArrayList<Integer> res = new ArrayList<Integer>();
        String[] str = sc.nextLine().split(" ");//�ո񻮷ֽ�ȡ�ַ���
		int[] num = new int[str.length];
		if (str.length == 0 || str == null) {//���û�����
			System.out.println(-1);
		}
		for (int i = 0; i < num.length; i++) {//�ַ�������ת��Ϊ��������
			num[i] = Integer.valueOf(str[i]);
		}
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(0) == '-') {
			}else {
//				i--;
				System.out.print(num[i]);				
			}
		}
	}

}

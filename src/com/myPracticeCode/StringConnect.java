package com.myPracticeCode;

import java.util.Scanner;

public class StringConnect {
	public static int stringConnect(String[] str) {
		if(str.length < 1) return 0;
		if(str.length == 1) return str[0].length();//���ַ�������Ϊ1ʱ���str.length
		int len = 0;
		String[] substr = new String[str.length - 1];
		for(int i = 1; i < str.length; i++) {//�������ȼ�һ�����ַ�������
			substr[i - 1] = str[i];
		}
		for(int i = 1; i < str.length; i++) {//���������ַ�������
//			substr[i - 1] = str[i];
			String ss = str[0]; 
			len = ss.length();
			if(ss.charAt(ss.length() - 1) <= str[i].charAt(0)) {
				len += stringConnect(substr);
			}else if(str[i].contains(ss)) {
				int ll = str[i].length() - ss.length();
				len += ll;//�����������ϸ����������û��������
			}
		}
		return len;

	}
	public static void main(String[] args) {
//		//��ȡ���鳤��
//        System.out.println("���������鳤�ȣ�");
//        Scanner scanner = new Scanner(System.in);
//        int arrayLength = scanner.nextInt();
//
//        //��������
//        System.out.println("�������������ݣ��Իس��ָ���");
//        String[] arr = new String[arrayLength];
//
//        //¼����������
//        for(int i=0;i<arr.length;i++){
//            arr[i] = scanner.next();
//        }
//
//        //��ӡ��������
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + "\t");
//        }
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���������");
		int num = sc.nextInt();//�����ַ�������
		String[] str = new String[num];
		System.out.println("�������ַ�����");
		for(int i = 0; i < num; i++) {
			str[i] = sc.next();//ÿ��������ַ��������ַ���������
		}
		for(int i = 0; i < str.length; i++) {
			for(int j = i + 1; j < str.length; j++) {
				if(str[i].compareTo(str[j]) > 0) {//�ȶ��ַ�������С��������
					String s = str[i];
					str[i] = str[j];
					str[j] = s;
				}
			}
		}
//		System.out.println(java.util.Arrays.toString(str));
		int len = stringConnect(str);//��������ַ���������м�����󳤶�
		System.out.println(len);
	}
}

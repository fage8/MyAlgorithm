package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * ������Ϸ������һ��ֻ��СЩ��ĸ���ַ��������ǻ��������������
 * (1)���������ַ������������гɻ����ַ��������ʤ��
 * (2)�������Ǳ���ɾ���ַ����е�һ���ַ���
 * Cassidy���֣��غ��ƣ�˭���ʤ
 * 
 * �����һ������tΪ����������������t�е��ַ�����Ϊt���������������˭���ʤ
 * 
 * ����
 * 2
 * aba
 * ab
 * ���
 * Cassidy
 * Eleanore
 * @author Administrator
 *
 */
public class WeiZhongTi2 {

	public static boolean f(String s) {
		int[] res = new int[26];//��¼��ͬ�ַ�����Ŀ
		for (int i = 0; i < res.length; i++) {
			res[i]=0;
		}
		for (int i = 0; i < s.length(); i++) {
			int k = s.charAt(i) - 'a';
			res[k]++;
		}
		int count =0;//��¼�ַ�Ϊ���������ַ�����
		for (int i = 0; i < res.length; i++) {
			if (res[i] % 2 != 0) {//�ַ�Ϊ������,�����������жϳ�������
				count++;
			}
		}
		if(count % 2 ==0 && count != 0){
			return false;
		}
		if (count ==0 || count % 2 !=0) {
			return true;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
	        int n = scanner.nextInt();
	        String[] nums = new String[n];
	        if (n<=10 && n>=1) {
				
	        	for (int i = 0; i < n; i++) {
	        		nums[i] = scanner.next();
	        	}

	        	for (int i = 0; i < n; i++) {
	        		if (f(nums[i])) {
	        			System.out.println("Cassidy");
	        		}else {
	        			System.out.println("Eleanore");
	        		}
	        	}
			}
        }
    }
}

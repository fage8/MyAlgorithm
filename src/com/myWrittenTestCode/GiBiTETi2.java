package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * �����ַ���s1��s2�����s1ɾ�������ַ����ܹ����s2��˵��s2Ϊs1���Ӵ�������s2��s1�е���ʼλ�õ����ֵ��λ�ô�1��ʼ��
 * ���s2����s1���Ӵ�������0
 * 
 * ����
 * abcdacd ad
 * ���
 * 5
 * @author Administrator
 *
 */
public class GiBiTETi2 {
//	//����һ����ǰ��ʼ����
//	public static int ziChuan(String t1, String t2){
//		int res = 0;//���Ӵ���ʱ�����0
//		char str[] = t1.toCharArray();
//		char sub[] = t2.toCharArray();
//		for (int i = 0; i < str.length; i++) {
//			int subIndex = 0;//�Ӵ�����
//			int j = i;
//			int count = 0;//ͳ�����ַ�����ͬ�ַ�����
//			while (subIndex < sub.length && j < str.length){//ÿ�α����Ӵ��Ƚ�
//				if(sub[subIndex] == str[j]) {
//					count++;
//					subIndex++;
//				}
//				j++;
//			}
//			if(count == sub.length)//˵���Ӵ������꣬����ƥ���Ӵ���������ʼ����+1
//				res = i + 1;//res=1,2,3,4,5������Ϊ5
//		}
//		return res;
//	}
	
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//			String[] a = scanner.nextLine().split(" ");
//			String s1 = a[0];
//			String s2 = a[1];
//			System.out.println(ziChuan(s1, s2));
//			
//		}
//    }
	//���������Ӻ�ʼ��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        	String s1 = scanner.next();//���ܵõ����пո���ַ���
        	String s2 = scanner.next();

        	int str = s1.length() - 1;
    		int sub = s2.length() - 1;
    		while (sub >= 0 && str >= 0) {//�Ӻ���ǰ�����������Ӵ����������ܼ�
    			if (s1.charAt(str)==s2.charAt(sub)) {
    				str--;
    				sub--;
    			}else {
    				str--;
    			}
    		}
    		if (sub != -1) {//�Ӵ�û�б�����
				System.out.println(0);
			}else {
				System.out.println(str+2);
			}
		}
	}

}

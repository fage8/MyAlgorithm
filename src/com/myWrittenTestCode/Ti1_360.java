package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ��һ�������DNA,�����ɺ���A��T��ɣ�����Ϊn��˳������
 * ��ѧ����һ���µ��ֶΣ����Ըı�����DNA,ÿһ�Σ���ѧ�ҿ��Խ�����DNA�����������λ�ã�Ҳ���Խ�ĳ���ض�λ�õĺ����޸�Ϊ��һ�ֺ���
 * ������һ��DNA,��ѧ��ϣ������������һ��DNA��ϣ����������ٵĲ�������
 * ���룺
 * ATTTAA
 * TTAATT
 * �����
 * 3
 * ˵����
 * �����޸ĵ�һ��λ�õĺ��ᣨA��ΪT��
 * ����3��5λ�õĺ���
 * ����4��6λ�õĺ���
 * @author Administrator
 *
 */
public class Ti1_360 {
	public static int f(String s) {
		int count=0;
		char[] temp =s.toCharArray();
		for (char c : temp) {
			if (c=='A') {
				count++;
			}
		}
		return count;
	}
	public static int f1(String source, String target) {
		char[] s =source.toCharArray();
		char[] t =target.toCharArray();
		int count =0;
		for (int i = 0; i < s.length; i++) {
			if (s[i]!=t[i]) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String source = sc.nextLine();
			String target = sc.nextLine();
			if (source == null || source.length() == 0 || target == null || target.length() == 0) {
				System.out.println(new int[0]);//���0����
			}
			int snum = f(source);
			int tnum = f(target);
			int cha = Math.abs(snum-tnum);
			int differ = f1(source,target);
			int lessnum = cha + (differ-cha)/2;
			System.out.println(lessnum);
//			int res1 = 0;
//			int res2 = 0;
//			int count1 = 0;
//			int count2 = 0;
//			ArrayList<Integer> a = new ArrayList<Integer>();
//			ArrayList<Integer> b = new ArrayList<Integer>();
//			ArrayList<Integer> a2 = new ArrayList<Integer>();
//			ArrayList<Integer> b2 = new ArrayList<Integer>();
//			for (int i = 0; i < s1.length(); i++) {
//				if (s1.charAt(i) == 'A') {
//					count1++;
//					a.add(i);
//				}
//				if (s1.charAt(i) == 'T') {
//					count2++;
//					b.add(i);
//				}
//			}
//			int count11 = 0;
//			int count22 = 0;
//			for (int i = 0; i < s2.length(); i++) {
//				if (s1.charAt(i) == 'A') {
//					count11++;
//					a2.add(i);
//				}
//				if (s1.charAt(i) == 'T') {
//					count22++;
//					b2.add(i);
//				}
//			}
//			if (count1 == count11 && count2 == count22) {
//				//ֻ����
//				for (int j = 0; j < count1; j++) {					
//					if (a.get(j) != a2.get(j)) {
//						
//					}
//				}
//			}else if (count1 == count11 && count2 != count22) {
//				//���ǽ������滻
//			}else if (count1 != count11 && count2 == count22) {
//				//���ǽ������滻
//			}else if (count1 != count11 && count2 == count22) {
//				//���滻�ٽ���
//			}
		}
	}

}

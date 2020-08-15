package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 有一种特殊的DNA,仅仅由核酸A和T组成，长度为n，顺次连接
 * 科学家有一种新的手段，可以改变这种DNA,每一次，科学家可以交换该DNA上两个核酸的位置，也可以将某个特定位置的核酸修改为另一种核酸
 * 现在有一个DNA,科学家希望将其改造成另一种DNA，希望你计算最少的操作次数
 * 输入：
 * ATTTAA
 * TTAATT
 * 输出：
 * 3
 * 说明：
 * 首先修改第一个位置的核酸（A改为T）
 * 交换3和5位置的核酸
 * 交换4和6位置的核酸
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
				System.out.println(new int[0]);//输出0数组
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
//				//只交换
//				for (int j = 0; j < count1; j++) {					
//					if (a.get(j) != a2.get(j)) {
//						
//					}
//				}
//			}else if (count1 == count11 && count2 != count22) {
//				//考虑交换和替换
//			}else if (count1 != count11 && count2 == count22) {
//				//考虑交换和替换
//			}else if (count1 != count11 && count2 == count22) {
//				//先替换再交换
//			}
		}
	}

}

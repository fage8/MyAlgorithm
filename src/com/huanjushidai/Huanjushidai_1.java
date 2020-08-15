package com.huanjushidai;

import java.util.Scanner;
//计算重复子字符串最大长度
public class Huanjushidai_1 {
//	private static int statlen(String x, int k, int j) {
//		int cur_len = 0;
//		while (k < x.length() && j < x.length() && x.charAt(k) == x.charAt(j)) {
//			//charAt() 方法用于返回指定索引处的字符,相当于c++中x[k]这种形式
//			//length()用于求String字符串对象的长度，而length用于求String字符串数组的长度
//			k++;
//			j++;
//			cur_len++;
//		}
//		return cur_len;
//	}
//	//o(n^3)
//	public static int naiveLRS(String x) {
//		int maxlen = 0;
//		int length = x.length();
//		for (int i = 0; i < length; i++) {
//			int len = 0;
//			int k = i;//第一个游标k,初始值为0
//			//第二个游标j，初始值为1
//			for (int j = i + 1; j < length; j++) {
//				len = statlen(x, k, j);//调用上面定义的函数，返回重复子串长度（重复子串可以有重合部分）
//				if (maxlen < len) {//取最大长度的字串
//					maxlen = len;
//				}
//			}
//		}
//		return maxlen;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String x = sc.nextLine();//enter键为结束标志
//		System.out.println(naiveLRS(x));
//	}
	public static int stateString(String x, int k, int j) {//必须加上static，不然main函数无法调用
		int cur_len = 0;
		while (k < x.length() && j < x.length() && x.charAt(k) == x.charAt(j)) {
			k++;
			j++;
			cur_len++;
		}
		return cur_len;
	}
	public static int repeatString(String x) {//必须加上static，不然main函数无法调用
		int maxlen = 0;
		for (int i = 0; i < x.length(); i++) {
			int k = i;
			for (int j = i + 1; j < x.length(); j++) {
				int len = stateString(x, k, j);//len可以不需要给初始值0，也可以给
				if (maxlen < len) {
					maxlen = len;
				}
			}
		}
		return maxlen;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {//加上了循环输入
			String x = sc.nextLine();
			System.out.println(repeatString(x));
		}
	}
}

package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 两个字符串s1，s2，如果s1删除若干字符后能够变成s2，说明s2为s1的子串，返回s2在s1中的起始位置的最大值（位置从1开始）
 * 如果s2不是s1的子串，返回0
 * 
 * 输入
 * abcdacd ad
 * 输出
 * 5
 * @author Administrator
 *
 */
public class GiBiTETi2 {
//	//方法一：从前开始遍历
//	public static int ziChuan(String t1, String t2){
//		int res = 0;//非子串的时候，输出0
//		char str[] = t1.toCharArray();
//		char sub[] = t2.toCharArray();
//		for (int i = 0; i < str.length; i++) {
//			int subIndex = 0;//子串索引
//			int j = i;
//			int count = 0;//统计两字符串相同字符个数
//			while (subIndex < sub.length && j < str.length){//每次遍历子串比较
//				if(sub[subIndex] == str[j]) {
//					count++;
//					subIndex++;
//				}
//				j++;
//			}
//			if(count == sub.length)//说明子串遍历完，保存匹配子串的主串起始索引+1
//				res = i + 1;//res=1,2,3,4,5，最终为5
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
	//方法二：从后开始遍历更好
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        	String s1 = scanner.next();//不能得到带有空格的字符串
        	String s2 = scanner.next();

        	int str = s1.length() - 1;
    		int sub = s2.length() - 1;
    		while (sub >= 0 && str >= 0) {//从后往前遍历主串和子串，这样做很简单
    			if (s1.charAt(str)==s2.charAt(sub)) {
    				str--;
    				sub--;
    			}else {
    				str--;
    			}
    		}
    		if (sub != -1) {//子串没有遍历完
				System.out.println(0);
			}else {
				System.out.println(str+2);
			}
		}
	}

}

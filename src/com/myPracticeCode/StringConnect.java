package com.myPracticeCode;

import java.util.Scanner;

public class StringConnect {
	public static int stringConnect(String[] str) {
		if(str.length < 1) return 0;
		if(str.length == 1) return str[0].length();//当字符串长度为1时输出str.length
		int len = 0;
		String[] substr = new String[str.length - 1];
		for(int i = 1; i < str.length; i++) {//遍历长度减一的子字符串数组
			substr[i - 1] = str[i];
		}
		for(int i = 1; i < str.length; i++) {//遍历整个字符串数组
//			substr[i - 1] = str[i];
			String ss = str[0]; 
			len = ss.length();
			if(ss.charAt(ss.length() - 1) <= str[i].charAt(0)) {
				len += stringConnect(substr);
			}else if(str[i].contains(ss)) {
				int ll = str[i].length() - ss.length();
				len += ll;//不过不满足上个条件的情况没有做出来
			}
		}
		return len;

	}
	public static void main(String[] args) {
//		//获取数组长度
//        System.out.println("请输入数组长度：");
//        Scanner scanner = new Scanner(System.in);
//        int arrayLength = scanner.nextInt();
//
//        //生成数组
//        System.out.println("请输入数组内容，以回车分隔：");
//        String[] arr = new String[arrayLength];
//
//        //录入数组内容
//        for(int i=0;i<arr.length;i++){
//            arr[i] = scanner.next();
//        }
//
//        //打印数组内容
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + "\t");
//        }
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串个数：");
		int num = sc.nextInt();//输入字符串个数
		String[] str = new String[num];
		System.out.println("请输入字符串：");
		for(int i = 0; i < num; i++) {
			str[i] = sc.next();//每行输入的字符串存入字符串数组中
		}
		for(int i = 0; i < str.length; i++) {
			for(int j = i + 1; j < str.length; j++) {
				if(str[i].compareTo(str[j]) > 0) {//先对字符串进行小到大排序
					String s = str[i];
					str[i] = str[j];
					str[j] = s;
				}
			}
		}
//		System.out.println(java.util.Arrays.toString(str));
		int len = stringConnect(str);//对排序的字符串数组进行计算最大长度
		System.out.println(len);
	}
}

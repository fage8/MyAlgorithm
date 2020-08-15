package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 去掉中文字符串中的6-10位的QQ号，注意QQ号首位不为0
 * 输入
 * adjk,ajdka,132311jskd
 * 输出
 * adjk,ajdka,jskd
 * 输入
 * 01313133dah1312344
 * 输出
 * 0dah（做法一）
 * 01313133dah（做法二）
 * @author Administrator
 *
 */
public class YuewenTi1 {
	//做法一：
    public static String filterContent (String content) {
        String[] res = content.split("[1-9]\\d{5,9}");
    	String rString = "";
    	for (int i = 0; i < res.length; i++) {
			rString += res[i];
		}
		return rString;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        String reString = filterContent(s);
        //做法二：\D表示非数字，括号里面的内容保留
        String reString = s.replaceAll("(^|\\D)[1-9]\\d{5,9}(\\D|$)", "$1$2");
        System.out.println(reString);
	}

}

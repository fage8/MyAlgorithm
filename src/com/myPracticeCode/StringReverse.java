package com.myPracticeCode;

import java.util.Scanner;
/**
 * 反转字符串，保证子串不反转
 * 
 * 输入
 * I am a student.
 * 输出
 * student. a am I
 * @author Administrator
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			StringBuffer stringBuffer = new StringBuffer(str);
			String s = stringBuffer.reverse().toString();//整体翻转后的字符串
//			System.out.print(s);
			String[] reStrings = s.split(" ");
			String[] s2 = new String[reStrings.length];
			for (int i = 0; i < reStrings.length; i++) {
				s2[i] = new StringBuffer(reStrings[i]).reverse().toString();
			}
			for (int i = 0; i < s2.length - 1; i++) {				
				System.out.print(s2[i] + " ");
			}
			System.out.println(s2[s2.length - 1]);
 		}
	}

}

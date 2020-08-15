package com.myWrittenTestCode;

import java.util.Scanner;

/**
 * （正确做法）
 * 在字符串前面添加字符，使得变成最短的回文字符串，输出最短回文字符串
 * 
 * @author Administrator
 *
 */
public class DianxinTi3 {
	public static boolean f(String s) {
		boolean flag = true;
		for (int i = 0; i <= s.length()/2; i++) {
			if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
	       String rs = new String();
	       String s = scanner.next();
	       StringBuffer sb = new StringBuffer();
	       StringBuffer sb1 = new StringBuffer(s);
	       StringBuffer sb2 = sb1.reverse();
	       for (int i = s.length()-1; i >= 0; i--) {
	    	   sb.append(s.charAt(i));
		   }
	       rs = sb.reverse().toString();
	       for (int i = rs.length() -1; i >= 1 && ! f(sb2.toString()); i--) {
	    	   sb2.insert(rs.length(), rs.charAt(i));
		   }
	       System.out.println(sb2);
        }
	}

}

package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 回文游戏，输入一个只含小些字母的字符串，他们会进行两个操作：
 * (1)重新排列字符串，将其排列成回文字符串，则获胜；
 * (2)否则，他们必须删掉字符串中的一个字符。
 * Cassidy先手，回合制，谁会获胜
 * 
 * 输入第一行数字t为组数，接下来输入t行的字符串，为t个测试用例，输出谁会获胜
 * 
 * 输入
 * 2
 * aba
 * ab
 * 输出
 * Cassidy
 * Eleanore
 * @author Administrator
 *
 */
public class WeiZhongTi2 {

	public static boolean f(String s) {
		int[] res = new int[26];//记录相同字符的数目
		for (int i = 0; i < res.length; i++) {
			res[i]=0;
		}
		for (int i = 0; i < s.length(); i++) {
			int k = s.charAt(i) - 'a';
			res[k]++;
		}
		int count =0;//记录字符为奇数个的字符个数
		for (int i = 0; i < res.length; i++) {
			if (res[i] % 2 != 0) {//字符为奇数个,就是这里我判断出了问题
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

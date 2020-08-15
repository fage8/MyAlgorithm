package com.myWrittenTestCode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * (正确做法)
 * 输出两个数之间的所有素数，输入非法，输出“ERROR”，不存在素数，输出“NO DATA”                   
 * @author Administrator
 *
 */
public class XingyeshujinTi1 {
	public static boolean isPrime(int num) {
		boolean flag = true;
		if (num < 2) {//负数,0,1肯定不是素数
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % 2 == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			//如果是数字串加逗号加数字串就是合法，其他非法
			String s = scanner.nextLine();
			if (!Pattern.matches("-?\\d+,-?\\d+", s)) {//正则表达式匹配非法，注意负号的匹配
				System.out.println("ERROR");
			}else {
				String[] str = s.split(",");
				int x = Integer.valueOf(str[0]);
				int y = Integer.valueOf(str[1]);
				
				if (x > y) {//交换x和y
					int z = x;
					x = y;
					y = z;
				}
				ArrayList<Integer> res = new ArrayList<Integer>();
				for (int i = x; i <= y; i++) {
					if (isPrime(i)) {
						res.add(i);
					}
				}
				if (res.size() == 0) {
					System.out.println("NO DATA");
				}else {
					for (int i = 0; i < res.size() - 1; i++) {
						System.out.print(res.get(i) + ",");
					}
					System.out.println(res.get(res.size() -1));
				}
			}
			
		}
	}

}

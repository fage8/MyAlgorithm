package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * -代表连续递增字符，如a-e代表abcde，A-D代表ABCD，X-a代表XYZa
 * 每个子串紧跟数字，数字代表出现的次数，如a3代表aaa，a-d2代表abcdabcd（A的ASCII码为65，a的ASCII码为97）
 * 输入描述:
 * 给定一个串上述满足上述压缩规则的字符串，假定此压缩后的自字符串只包含字母和代表压缩规则的数字和‘-’，
 * 且最大不超过1000个字符，原始字符串单个字符出现不会超过10000000次
 * 输出描述：
 * 原字符串的出现频率最高的字符及次数（统计字符频率时不区分大小写，输出对应小写字符即可，
 * 如果有多个字符出现相同的最多次数，输出较小的字符，如b3a3则输出a3）
 * 输入：
 * A3bc2X-b2(AAAbcbcXYZabXYZab)
 * 输出
 * a5
 * 
 * @author Administrator
 *
 */
public class MiHaYouTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] str = new String[n][2];
        int[][] res = new int[n][2];
        for (int i = 0; i < n; i++) {
			str[i] = scanner.nextLine().split(" ");
			res[i][0] = Integer.valueOf(str[i][0]);
			res[i][1] = Integer.valueOf(str[i][1]);
		}

        int count =1;
        for (int i = 0; i < n; i++) {
        	for (int j = i+1; j < n; j++) {
				
        		if (res[i][1] > res[j][0]) {
        			count++;
        		}
			}
			
		}
        System.out.println(count);
	}

}

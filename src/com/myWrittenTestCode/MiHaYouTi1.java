package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * -�������������ַ�����a-e����abcde��A-D����ABCD��X-a����XYZa
 * ÿ���Ӵ��������֣����ִ�����ֵĴ�������a3����aaa��a-d2����abcdabcd��A��ASCII��Ϊ65��a��ASCII��Ϊ97��
 * ��������:
 * ����һ����������������ѹ��������ַ������ٶ���ѹ��������ַ���ֻ������ĸ�ʹ���ѹ����������ֺ͡�-����
 * ����󲻳���1000���ַ���ԭʼ�ַ��������ַ����ֲ��ᳬ��10000000��
 * ���������
 * ԭ�ַ����ĳ���Ƶ����ߵ��ַ���������ͳ���ַ�Ƶ��ʱ�����ִ�Сд�������ӦСд�ַ����ɣ�
 * ����ж���ַ�������ͬ���������������С���ַ�����b3a3�����a3��
 * ���룺
 * A3bc2X-b2(AAAbcbcXYZabXYZab)
 * ���
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

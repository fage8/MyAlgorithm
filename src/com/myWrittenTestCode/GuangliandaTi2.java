package com.myWrittenTestCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * (��ȷ����)
 * n�Դ����ţ��ж�������Եķ�ʽ
 * ���룺
 * 3
 * �����
 * [{{{}}}, {{}{}}, {{}}{}, {}{{}}, {}{}{}]
 * @author Administrator
 *
 */

public class GuangliandaTi2 {
	static List<String> res = new ArrayList<String>();
	static int num = 0;
	public static List<String> generateParentThesis(int n) {
		num = n;
		trackback("", 0, 0);
		return res;
	}
	private static void trackback(String str, int L, int R) {
		if (L == num && R == num) {
			res.add(str);
		}else {
			if (L < num) {//��������Ŀ����
				trackback(str + "{", L + 1, R);
			}
			if (R < L) {//��������С����������
				trackback(str + "}", L, R + 1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
        	int n = scanner.nextInt();
        	List<String> generateParentThesis = generateParentThesis(n);
    		System.out.println(generateParentThesis);
        }
	}

}

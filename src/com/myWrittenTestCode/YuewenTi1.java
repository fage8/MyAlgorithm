package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * ȥ�������ַ����е�6-10λ��QQ�ţ�ע��QQ����λ��Ϊ0
 * ����
 * adjk,ajdka,132311jskd
 * ���
 * adjk,ajdka,jskd
 * ����
 * 01313133dah1312344
 * ���
 * 0dah������һ��
 * 01313133dah����������
 * @author Administrator
 *
 */
public class YuewenTi1 {
	//����һ��
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
        //��������\D��ʾ�����֣�������������ݱ���
        String reString = s.replaceAll("(^|\\D)[1-9]\\d{5,9}(\\D|$)", "$1$2");
        System.out.println(reString);
	}

}

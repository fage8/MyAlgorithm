package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * һ��������ֽ���������湹�ɡ�
 * ���ڸ�������ֽ��ĳ��Ϳ������ж��ܷ���������ֽ�幹��һ��������ֽ��
 * 
 * ��һ�а���һ������T����ʾ����������������1<=T<=10��
 * ����ÿ��������ݰ������У�ÿ�б�ʾһ��ֽ��ĳ��Ϳ�h,w
 * ����ܹ���ֽ�����POSSIBLE,�������IMPOSSIBLE
 * 
 * 2
 * 1345 2584
 * 2584 683
 * 2584 1345
 * 683 1345
 * 683 1345
 * 2584 683
 * 1234 4567
 * 1234 4567
 * 4567 4321
 * 4322 4567
 * 4321 1234
 * 4321 1234
 * 
 * ���
 * POSSIBLE
 * IMPOSSIBLE
 * @author Administrator
 *
 */
public class JingdongTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int k = scanner.nextInt();
        int[] nums = new int[n];
        while(scanner.hasNext()) {
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(" ");
	        }
        	System.out.println(n);
        }
	}

}

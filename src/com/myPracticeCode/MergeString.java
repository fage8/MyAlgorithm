package com.myPracticeCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ��һ���ַ�����4��Ԫ�ؽ��ڶ����ַ������뵽���棬�ڶ��ַ����ж��ֱ�����ӵ���һ���ַ�������
 * @author Administrator
 *
 */
public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String str1  = scanner.nextLine();
        String str2  = scanner.nextLine();
        List<String> list = doInsert(str1.trim().split(" "),str2.trim().split(" "));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
 
    private static List<String> doInsert(String[] c1, String[] c2) {
        List<String> list = new ArrayList<>();
        int j = 0;
        int count = 0;
        for (int i = 0; i < c1.length; i++) {
            list.add(c1[i]);
            count++;
            if (count == 4 && j < c2.length){
                count = 0;
                list.add(c2[j]);
                j++;
            }
        }
        while(j < c2.length){
            list.add(c2[j++]);
        }
        return list;
    }
}


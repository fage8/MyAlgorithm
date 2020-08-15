package com.myPracticeCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 第一个字符串隔4个元素将第二个字符串插入到后面，第二字符串有多的直接连接到第一个字符串后面
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


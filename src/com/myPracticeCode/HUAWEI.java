package com.myPracticeCode;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 * 提取字符串中的数字，并按照从小到大输出
 * @author Administrator
 *
 */

public class HUAWEI {
	public static ArrayList<Integer> getNumeric(String str) {
	    str=str.trim();
		ArrayList<Integer> name = new ArrayList<>();
	    if(str != null && !"".equals(str)){
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)>=48 && str.charAt(i)<=57){
	                name.add(str.charAt(i) - '0');
	            }
	        }
	    }
	    return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		String str= scanner.nextLine();
		ArrayList<Integer> name = new ArrayList<>();
		name = getNumeric(str);
		Collections.sort(name);
		for (int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i));
			
		}

	}

}

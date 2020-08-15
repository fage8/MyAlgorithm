package com.myWrittenTestCode;

import java.util.Scanner;

public class HuaweiTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String[] str= scanner.nextLine().split(" ");
        while(scanner.hasNext()) {
				String string = str[0];//Æ¥ÅäµÄ×Ö·û´®
				int len = string.length();
				String[] strings = str[1].split("],");
				String[][] res = new String[strings.length][3];
				int qishi = 0;
				for (int i = 0; i < strings.length; i++) {
						
					if (string == strings[i].substring(0, len) && strings[i].charAt(len) == '[') {
						for (int j = 0; j < strings[i].length(); j++) {
							
							if (strings[i].charAt(j) == '0' && (strings[i].charAt(j) != ','||strings[i].charAt(j)!= ']')) {
								qishi = j;
								j++;
							}else {
								res[i][j] = strings[i].substring(qishi , j);  
							}
						}
					}
				}
			for (int i = 0; i < strings.length; i++) {
				for (int j = 0; j < 2; j++) {
					
					System.out.print(res[i][j] + " ");
					System.out.print(res[i][2]);
					
				}
				System.out.println();
			}
        }
	}

}

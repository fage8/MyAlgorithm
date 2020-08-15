package com.myHandwrittenCode;

import java.util.Scanner;
/** 
 * 富途一面题(正确做法)
 * 给出字符串S，变成字符串T
 * 你可以删除第一个字符，也可以删除最后一个字符
 * 添加到新的字符串T中，先加入字典顺序小的（A<B，A先进字符串T中）
 * 
 * 输入
 * ACDBCB
 * 输出
 * ABCBCD
 * 输入
 * ABCAAABCAAADCB
 * 输出
 * ABBCAAABCAAACD
 * @author Administrator
 *
 */
public class StringOrderMin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			char[] ch = s.toCharArray();
 			StringBuffer t = new StringBuffer();
			int first = 0, end = ch.length - 1;
			while(first <= end) {
				boolean flag = false;
				for (int i = 0; first + i <= end; i++) {//用来比较出第一个小的元素
					if(ch[first+i] < ch[end-i]){
						flag = true;
						break;
					}
					else if (ch[first+i] > ch[end-i]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					t.append(ch[first]);
					first++;
				}else {
					t.append(ch[end]);
					end--;
				}
			}
			System.out.println(t.toString());
		}

	}

}

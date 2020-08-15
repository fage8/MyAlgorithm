package com.myWrittenTestCode;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * (正确做法)
 * 投票评选：
 * 1.票数最多者当选
 * 2.票数相同的，根据员工姓名排序，字母序号越小排前面，a>b>c，A>B>C;如果项目之间有包含关系，短的姓名在长姓名的前面，Tom>Tomy
 * 非法输入直接返回：error.0001
 * 输入合法，返回当选的员工名字
 * 
 * 输入(只包含大小写字母，首字母大写，其他字母小写)
 * Tom,Lily,Tom,Lucy,Lucy,Jack
 * 输出
 * Lucy
 * @author Administrator
 *
 */

public class HuaweiTi1 {
	public static boolean heFa(char[] c) {//判断每个员工名单是否合法
		boolean b = true;
		if (c[0]<'A' || c[0]>'Z') {
			b = false;
			return b;
		}
		for (int i = 1; i < c.length; i++) {
			if (c[i]<'a' || c[i]>'z') {
				b = false;
				break;
			}
		}
		return b;
	}
	private static String hashSort(HashMap<String,Integer> hash) {//对hash进行按照value排序
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (String temp : hash.keySet()) {//遍历hash
			list.add(hash.get(temp));//添加value到list动态数组中
		}
		int max= Collections.max(list);
		ArrayList<String> string = new ArrayList<String>();
		for (String s : hash.keySet()) {
			if (hash.get(s)==max) {
				string.add(s);//添加最大的value对应的key到string动态数组中
			}
		
		}
		//Arrays.sort(str);
		Collections.sort(string);//默认顺序字典顺序，小到大
		return string.get(0);//获取value最大的key序号最小的那个key
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String[] a= scanner.nextLine().split(",");
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        boolean ff = true;

    	for (int i = 0; i < a.length; i++) {
    		boolean f = heFa(a[i].toCharArray());//判断每个员工名单是否合法
    		if (f) {//合法
				if (hash.containsKey(a[i])) {//包含key,对应value+1
					hash.put(a[i], hash.get(a[i])+1);//value == map.get(key)
				}else {//不包含key,对应value=1
					hash.put(a[i], 1);
				}
			}else {//不合法
				ff = false;
				break;
			}
		}
    	
    	if (ff) {
			System.out.println(hashSort(hash));
		}else {
			System.out.println("error.0001");
		}

	}

}

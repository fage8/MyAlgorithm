package com.myWrittenTestCode;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * (��ȷ����)
 * ͶƱ��ѡ��
 * 1.Ʊ������ߵ�ѡ
 * 2.Ʊ����ͬ�ģ�����Ա������������ĸ���ԽС��ǰ�棬a>b>c��A>B>C;�����Ŀ֮���а�����ϵ���̵������ڳ�������ǰ�棬Tom>Tomy
 * �Ƿ�����ֱ�ӷ��أ�error.0001
 * ����Ϸ������ص�ѡ��Ա������
 * 
 * ����(ֻ������Сд��ĸ������ĸ��д��������ĸСд)
 * Tom,Lily,Tom,Lucy,Lucy,Jack
 * ���
 * Lucy
 * @author Administrator
 *
 */

public class HuaweiTi1 {
	public static boolean heFa(char[] c) {//�ж�ÿ��Ա�������Ƿ�Ϸ�
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
	private static String hashSort(HashMap<String,Integer> hash) {//��hash���а���value����
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (String temp : hash.keySet()) {//����hash
			list.add(hash.get(temp));//���value��list��̬������
		}
		int max= Collections.max(list);
		ArrayList<String> string = new ArrayList<String>();
		for (String s : hash.keySet()) {
			if (hash.get(s)==max) {
				string.add(s);//�������value��Ӧ��key��string��̬������
			}
		
		}
		//Arrays.sort(str);
		Collections.sort(string);//Ĭ��˳���ֵ�˳��С����
		return string.get(0);//��ȡvalue����key�����С���Ǹ�key
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String[] a= scanner.nextLine().split(",");
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        boolean ff = true;

    	for (int i = 0; i < a.length; i++) {
    		boolean f = heFa(a[i].toCharArray());//�ж�ÿ��Ա�������Ƿ�Ϸ�
    		if (f) {//�Ϸ�
				if (hash.containsKey(a[i])) {//����key,��Ӧvalue+1
					hash.put(a[i], hash.get(a[i])+1);//value == map.get(key)
				}else {//������key,��Ӧvalue=1
					hash.put(a[i], 1);
				}
			}else {//���Ϸ�
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

package com.myPracticeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class VectorTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v1 = new ArrayList<Integer>();
		ArrayList<Integer> v2;
		Integer[] a1 = {1, 2, 3, 4, 5};
		// ����̬����Ԫ�ظ�ֵ����̬����
		ArrayList<Integer> v3 = new ArrayList<>(Arrays.asList(a1));  
		v2 = v3;
		ArrayList<Integer> v4 = new ArrayList<Integer>(v2);
		System.out.println("the size of v3 is: " + v3.size());
		System.out.println("the first element of v3 is: " + v3.get(0));
		System.out.println("version 1 traversal:");
		for (int i = 0; i < v3.size(); i++) {
			System.out.print(" " + v3.get(i));
		}
		System.out.println();
		v3.set(0, 9);  // ��0λ�ø�ֵ9
		Collections.sort(v3); // ����̬��������
		System.out.println("version 2 traversal:");
		for (int item : v3) {
			System.out.print(" " + item);
		}
		v3.add(0, 10);  // ��0λ�����10��ԭ��0λ�õ�Ԫ�������� 
		v3.add(-1);  // ��ĩβ���-1
		System.out.println();
		System.out.println("version 2 traversal:");
		for (int item : v3) {
			System.out.print(" " + item);
		}
		v3.remove(v3.size() - 1);  // �Ƴ�ĩβ��Ԫ��
		System.out.println();
		System.out.println("version 2 traversal:");
		for (int item : v3) {
			System.out.print(" " + item);
		}
	}

}

package com.myPracticeCode;

import java.util.Arrays;

public class ArrayTraversal {

	public static void main(String[] args) {

	      int[] a0 = new int[5];
	   // java��û�� int[5] a1 = {1,2,3}������ȥ�Զ���ȫ
	      int[] a1 = {1,2,3}; 
	      System.out.println("a1.len is:"+ a1.length);
	      System.out.println("a1 first component is��"+ a1[0]);
	      System.out.println("(1) arrayTraversal��");
	      for(int i = 0; i < a1.length; i++){
	          System.out.print(" "+a1[i]);
	      }
	      System.out.println();
	      System.out.println("(2) arrayTraversal��");

	      a1[0] = 4;
	      Arrays.sort(a1);//Arrays��ľ�̬��������
	      for(int item: a1){
	          System.out.print(" "+item);
	      }

	}

}

package com.myPracticeCode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * (��ȷ����)
 * n���˿��Ŷӣ���1��n��ţ��˿�i��ʼλ��Ϊi��ÿ���˿�����������ai��bi
 * �����ź�˿�i��λ��Ϊj����˿�i�Ĳ������Ϊai*(j-1)+bi*(n-j)
 * �����й˿Ͱ��ź󣬲���������
 * ��������ΰ���˳���ÿ���˿������Ӧ��λ��i
 * 
 * 7*(1-1)+3*(3-1)+8*(2-1)+5*(3-2)+9*(3-1)+8*(3-3)=37
 * ����[8,9,7],[5,8,3]
 * ���[3,1,2]
 * 
 * ����[1,2,3], [1,2,3]
 * ���[3,2,1]
 * ����[1,2,4], [1,2,3]
 * ���[3,2,1]
 * ����[2,3,5], [2,3,6]
 * ���[2,1,3]
 * 
 * 
 * ����ֱ����HashMap��¼key:a[i] - b[i]��value����Ӧ��1��2��3��4��Ȼ���key�������ó�value���С�
 * @author Administrator
 *
 */
public class TanXinPriorQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	String[] s = sc.nextLine().split(",");
        	String[] s2 = sc.nextLine().split(",");
        	int[] a = new int[s.length];
        	int[] b = new int[s.length];
        	for (int i = 0; i < s2.length; i++) {
				a[i] = Integer.valueOf(s[i]);
				b[i] = Integer.valueOf(s2[i]);
			}
        	//��a-b���ʱ��������λ����С����Ȳ���Ӱ�죬���ǻ�Ӱ����������˳����д����С�ڻ���ھ͵ý���
	        PriorityQueue<Pair> heap = new PriorityQueue<>(
	        		 (Pair p1, Pair p2) ->(p1.a - p1.b < p2.a - p2.b) ? 1 : -1);
	         for (int i = 0; i < a.length; i++) {
				heap.offer(new Pair(a[i], b[i],i+1));//���
			}
        	int sum = 0;
        	ArrayList<Integer> xuhao = new ArrayList<Integer>();
	        for (int i = 0; i < b.length; i++) {
	        	 Pair pair = heap.poll();//����
//	        	 System.out.println(pair.xuhao+",");
	        	 xuhao.add(pair.xuhao);
//	        	 sum+=pair.a *i + pair.b * (b.length-i-1);

			}
//	        System.out.println(sum);
	        System.out.println(xuhao);
		}
	
    }


        
 
	public static class Pair {//�Զ������ȶ��й���
		int a,b,xuhao;
		public Pair(int a, int b ,int xuhao) {
			this.a = a;
			this.b = b;
			this.xuhao = xuhao;
		}
	}
	
}
	


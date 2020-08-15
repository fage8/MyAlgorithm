package com.myPracticeCode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * (正确做法)
 * n个顾客排队，从1到n编号，顾客i初始位置为i，每个顾客有两个属性ai，bi
 * 被安排后顾客i的位置为j，则顾客i的不满意度为ai*(j-1)+bi*(n-j)
 * 求所有顾客安排后，不满意度最低
 * 输出被依次安排顺序后，每个顾客起初对应的位置i
 * 
 * 7*(1-1)+3*(3-1)+8*(2-1)+5*(3-2)+9*(3-1)+8*(3-3)=37
 * 输入[8,9,7],[5,8,3]
 * 输出[3,1,2]
 * 
 * 输入[1,2,3], [1,2,3]
 * 输出[3,2,1]
 * 输入[1,2,4], [1,2,3]
 * 输出[3,2,1]
 * 输入[2,3,5], [2,3,6]
 * 输出[2,1,3]
 * 
 * 
 * 或者直接用HashMap纪录key:a[i] - b[i]，value：对应的1、2、3、4，然后对key排序，再拿出value就行。
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
        	//当a-b相等时交不交换位置最小满意度不受影响，但是会影响最后的排列顺序，我写的是小于或等于就得交换
	        PriorityQueue<Pair> heap = new PriorityQueue<>(
	        		 (Pair p1, Pair p2) ->(p1.a - p1.b < p2.a - p2.b) ? 1 : -1);
	         for (int i = 0; i < a.length; i++) {
				heap.offer(new Pair(a[i], b[i],i+1));//入队
			}
        	int sum = 0;
        	ArrayList<Integer> xuhao = new ArrayList<Integer>();
	        for (int i = 0; i < b.length; i++) {
	        	 Pair pair = heap.poll();//出队
//	        	 System.out.println(pair.xuhao+",");
	        	 xuhao.add(pair.xuhao);
//	        	 sum+=pair.a *i + pair.b * (b.length-i-1);

			}
//	        System.out.println(sum);
	        System.out.println(xuhao);
		}
	
    }


        
 
	public static class Pair {//自定义优先队列规则
		int a,b,xuhao;
		public Pair(int a, int b ,int xuhao) {
			this.a = a;
			this.b = b;
			this.xuhao = xuhao;
		}
	}
	
}
	


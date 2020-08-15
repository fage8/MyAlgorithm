package com.myWrittenTestCode;

import java.util.PriorityQueue;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
/**
 * (��ȷ����)
 * ��ʼ��ֻ��һ�γ鿨���ᣬÿ�γ鿨�˷�һ�γ鿨���ᣬ���һ�ſ�Ƭ��
 * ���ſ�Ƭ�����������֣���һ�����ִ������ܻ�õ�Ǯ���ڶ������ִ������ܻ�õĶ���鿨������
 * ����ĳ鿨�����ǿ����ۼƵġ�
 * ��֪���˿�Ƭ�����������еĿ�Ƭ�ϵ����֣��Լ����п�Ƭ��˳����ֻ��Ҫ����һ�ֿ�Ƭ˳��ʹ�����ܻ��Ǯ����ࡣ
 * (̰���㷨)
 * ��һ��n����Ƭ��������������n�У�ÿ����������ai bi����һ�ſ�Ƭ
 * ai��ʾ���ſ�Ƭ��õ�Ǯ����bi��ʾ���ſ�Ƭ�ܻ�õĶ���鿨������������ܻ�õ����Ǯ��
 * 
 * ����
 * 5
 * 0 2
 * 1 1
 * 1 0
 * 1 0
 * 2 0
 * ���
 * 4
 * @author Administrator
 *
 */
public class WeiZhongTi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
	        int n = Integer.valueOf(scanner.nextLine());
	        int[][] nums = new int[n][2];
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(" ");
				nums[i][0] = Integer.valueOf(str[0]);
				nums[i][1] = Integer.valueOf(str[1]);
			}

            // ʹ��һ�����ѣ��������Ϊ��(̰���㷨)
            //    �ȱȽϿ�Ƭ�Ķ���鿨������ ����鿨�������Ŀ�Ƭ �����ȼ��ϸ�
            //    �� ��Ƭ�Ķ���鿨������ͬʱ���ٱȽϸÿ��ܻ�õ�Ǯ�����ܻ�õ�Ǯ�����Ŀ�Ƭ�����ȼ��ϸ�
	        //PriorityQueueԭ��������С��ǰ�����ں�
	         PriorityQueue<Pair> heap = new PriorityQueue<>(
	        		 (Pair p1, Pair p2) ->(p1.b ==p2.b) ? p2.a-p1.a : p2.b-p1.b);//���߼�ǰ�߾��Ǵ�С���������
	         for (int i = 0; i < n; i++) {
				heap.offer(new Pair(nums[i][0], nums[i][1]));//���
			}
	         Pair pair = heap.poll();//����
	         int count = pair.b, sum = pair.a;
	         while(count != 0) {
	        	 Pair pair1 = heap.poll();
	        	 count--;
	        	 count += pair1.b;
	        	 sum += pair1.a;
			}
	         System.out.println(sum);
        }
    }
	public static class Pair {//�Զ������ȶ��й���
		int a,b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}

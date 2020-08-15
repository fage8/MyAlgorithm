package com.myWrittenTestCode;

import java.util.PriorityQueue;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
/**
 * (正确做法)
 * 初始你只有一次抽卡机会，每次抽卡浪费一次抽卡机会，获得一张卡片，
 * 这张卡片上有两个数字，第一个数字代表你能获得的钱，第二个数字代表你能获得的额外抽卡次数。
 * 额外的抽卡次数是可以累计的。
 * 你知道了卡片的数量，所有的卡片上的数字，以及所有卡片的顺序，你只需要安排一种卡片顺序，使得你能获得钱数最多。
 * (贪心算法)
 * 第一行n代表卡片的数量，接下来n行，每行用两个数ai bi描述一张卡片
 * ai表示这张卡片获得的钱数，bi表示这张卡片能获得的额外抽卡次数，输出你能获得的最多钱数
 * 
 * 输入
 * 5
 * 0 2
 * 1 1
 * 1 0
 * 1 0
 * 2 0
 * 输出
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

            // 使用一个最大堆，排序规则为：(贪心算法)
            //    先比较卡片的额外抽卡次数， 额外抽卡次数最多的卡片 的优先级较高
            //    当 卡片的额外抽卡次数相同时，再比较该卡能获得的钱数，能获得的钱数最多的卡片的优先级较高
	        //PriorityQueue原本规则是小在前，大在后
	         PriorityQueue<Pair> heap = new PriorityQueue<>(
	        		 (Pair p1, Pair p2) ->(p1.b ==p2.b) ? p2.a-p1.a : p2.b-p1.b);//后者减前者就是大到小排序进队列
	         for (int i = 0; i < n; i++) {
				heap.offer(new Pair(nums[i][0], nums[i][1]));//入队
			}
	         Pair pair = heap.poll();//出队
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
	public static class Pair {//自定义优先队列规则
		int a,b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}

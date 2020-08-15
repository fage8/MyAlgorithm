package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 给出N个正整数1-N，开始时每个正整数单独地在自己的集合里。
 * 现在对这些正整数集合执行一系列操作，操作有以下类型：
 * 1.选择两个不同的正整数X和Y,把X所在的集合与Y所在的集合合并成一个集合。如果X和Y在合并前就在同一个集合里，则什么都不做。
 * 2.选择一个正整数X，把X从它当前所在集合里取出来，自己独立成一个新的集合。如果X当前所在集合里只有X单独一个正整数，则什么都不做。
 * 3.选择一个正整数X，输出X当前所在集合里的正整数个数。
 * 给出正整数个数N和操作数M，依次执行每个操作。
 * 
 * 输入描述：
 * 第一行为一个正整数T，表示T组数据。
 * 每组数据的第一行为两个正整数N和M，分别表示正整数个数和操作数。
 * 接下来M行，每行表示一个操作。每个操作包含两个或三个正整数，其中第一个正整数OP表示操作的类型，用1、2或3表示描述中的操作。
 * 如果是操作类型1，则接下来有两个不同的正整数x和y，如果是操作2或3，则接下来有一个正整数x。
 * 输出描述：
 * 对于每一个类型3操作，输出一行，包括一个整数，为输入中的x所在集合里的正整数个数。
 * 
 * 输入
 * 3
 * 3 7
 * 3 1
 * 1 1 2
 * 3 1
 * 1 2 3
 * 3 1
 * 2 1
 * 3 1
 * 3 5
 * 1 2 3
 * 3 1
 * 2 3
 * 1 2 1
 * 3 1
 * 3 5
 * 1 2 3
 * 1 2 1
 * 3 1
 * 2 3
 * 3 1
 * 输出
 * 1
 * 2
 * 3
 * 1
 * 1
 * 2
 * 3
 * 2
 * @author Administrator
 *
 */
public class WangyihuyuTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int Q = 0; Q < T; Q++) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	int[][] m = new int[M][3];
        	for (int i = 0; i < M; i++) {
        		m[i][0] = sc.nextInt();
        		if (m[i][0] == 1) {
        			//合并x和y所在的集合
        			m[i][1] = sc.nextInt();
					m[i][2] = sc.nextInt();
					
				}else if(m[i][0] == 2){
					//将x提出来成立新的集合
					m[i][1] = sc.nextInt();
					
				}else if(m[i][0] == 3){
					//输出x所在集合的正整数个数
					m[i][1] = sc.nextInt();
					System.out.println(i);
				}
        	}
        }
	}
}

package com.myHandwrittenCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 华为技术面题
 * (正确做法)
 * 有多个同学排序，每个同学有两个属性w，k。w表示体重，k表示前面不比他轻的同学个数。
 * 请对原始同学的排列进行排序，使得符合上述排序规则。
 * 输入[[8,0], [4,4], [8,1], [5,0], [6,1], [5,2]]
 * 输出[[5,0], [8,0], [5,2], [6,1], [4,4], [8,1]]、
 * 先按照w递减排序，w内k递增排序
 * 之后依次将每位同学插入到序号为k（从0开始）的位置中，最终的顺序就是题目要求
 * 
 * @author Administrator
 *
 */
public class reconstructQueue {
	public static int[][] reconstructQueue(int[][] arr) {
		//按照体重降序，k值升序排列
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] == o2[0] ?  o1[1] - o2[1] : o2[0] - o1[0];  
			}
		});
		ArrayList<int[]> res = new ArrayList<int[]>();
        for(int i = 0; i < arr.length; i++){
        	/*判断插入的索引是否符合ArrayList范围，在0 和 size之间，
        	 * size是ArrayList实际元素个数，不包括底层数组的null元素*/
        	//切记不要第一次就将元素插入到索引为1的位置，因为此时size大小为0，会发生异常
        	res.add(arr[i][1], arr[i]);//将arr[i]插入到arr[i][1]位置上
        }
        
		return res.toArray(new int[res.size()][]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{8,0},{4,4},{8,1},{5,0},{6,1},{5,2}};
//		Scanner scanner = new Scanner(System.in);
//		String[][] str = new String[6][2];
//		int[][] arr = new int[6][2];
//		for (int i = 0; i < arr.length; i++) {
//			str[i] = scanner.nextLine().split(",");
//			arr[i][0] = Integer.valueOf(str[i][0]);
//			arr[i][1] = Integer.valueOf(str[i][1]);
//		}

//		System.out.println(arr.length);
		int[][] res = new int[arr.length][2];
		res = reconstructQueue(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i][0] + "," + res[i][1]);
		}
	}

}

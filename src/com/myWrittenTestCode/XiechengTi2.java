package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 乘飞机从城市A到城市B,会可能存在以下几种飞行的方案：
 * 直飞(城市A飞到城市B)，一程中转(城市A飞到城市C，再从城市C飞到城市B)，
 * 两程中转(城市A飞到城市C，再从城市C飞到城市D，再从城市D飞到城市B)，三程中转(类比之前的例子)。
 * 假设现有A,B,C...若干个城市，输入中会给出某两个城市之间是否存在直飞航班，请计算出从城市A去城市B的所有飞行方案，
 * 每个城市最多只能经过一次。
 * 输入描述：(A,B)表示从城市A到城市B存在直飞航班
 * 输出描述：需要对输出的若干种飞行方案进行排序
 * 优先按照途径城市个数升序排序；当个数相同时依次按照途径城市代表字母的字母顺序排序；没有方案输出“EMPTY”
 * 输入
 * (A,B);(A,C);(C,B);(C,D);(D,B);
 * 输出
 * [[A,B],[A,C,B],[A,C,D,B]]
 * @author Administrator
 *
 */
public class XiechengTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {			
        	arr[i] = scanner.nextInt();
		}
        System.out.println(5);
        
	}

}

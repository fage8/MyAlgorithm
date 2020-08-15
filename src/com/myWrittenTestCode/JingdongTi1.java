package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 一个长方体纸箱由六个面构成。
 * 现在给出六块纸板的长和宽，请你判断能否用这六块纸板构成一个长方体纸箱
 * 
 * 第一行包含一个整数T，表示测试数据组数。（1<=T<=10）
 * 对于每组测试数据包含六行，每行表示一块纸板的长和宽h,w
 * 如果能构成纸箱输出POSSIBLE,否则输出IMPOSSIBLE
 * 
 * 2
 * 1345 2584
 * 2584 683
 * 2584 1345
 * 683 1345
 * 683 1345
 * 2584 683
 * 1234 4567
 * 1234 4567
 * 4567 4321
 * 4322 4567
 * 4321 1234
 * 4321 1234
 * 
 * 输出
 * POSSIBLE
 * IMPOSSIBLE
 * @author Administrator
 *
 */
public class JingdongTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int k = scanner.nextInt();
        int[] nums = new int[n];
        while(scanner.hasNext()) {
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(" ");
	        }
        	System.out.println(n);
        }
	}

}

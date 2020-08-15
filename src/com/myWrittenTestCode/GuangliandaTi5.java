package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 夺宝比赛共5人报名参加，奖励为一堆金币，比赛规则如下：
 * 参赛者互不认识，也不知道其他人的存在
 * 参赛者不知道比赛的整体进度及自己和其他人的当前名次
 * 每名参赛者找到金币后需要先将金币分成5等份，然后拿走自己的那一份
 * 若金币不能被5等分，需要参赛者先从自己口袋中补充一些金币进去，然后再5等分
 * 5人都找到金币后，比赛结束
 * 比赛结束后，已知参赛者在平分金币时每人都补充了1个金币进去，而且最终剩余的金币数量在1000至2000之间
 * 请计算5名参赛者各自拿到了多少金币？
 * @author Administrator
 *
 */
public class GuangliandaTi5 {

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

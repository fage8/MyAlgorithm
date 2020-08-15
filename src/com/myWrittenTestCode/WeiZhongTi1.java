package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * n个朋友m个礼物，要求均分礼物:
 * (1)可以花a元送红包打发走一位朋友；
 * (2)花b元再买一件礼物，两种操作可以混着用.
 * 要求输出打发所有朋友的最小花费
 * 
 * 第一行输入四个整数n,m,a,b
 * 输出最少花费
 * 输入
 * 7 5 10 100
 * 20
 * 输入
 * 2 4 10 10
 * 0
 * 输入
 * 4 6 10 12
 * 10
 * @author Administrator
 *
 */
public class WeiZhongTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
	        int n = scanner.nextInt();
	        int m = scanner.nextInt();
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int res = 0;
	        if (n>=1 && n <=100 && m>=1 && m<=100 && a>=1 && a<=100 && b>=1 && b<=100) {
	        	if (n>m) {
	        		int j = n - m;
	        		if (a<b) {
	        			res = a*j;
	        		}else {
	        			res = b*j;
	        		}
	        	}else if (m % n != 0 && n < m) {//不能平分时候,当时忘记这种情况
//					int yu = m % n;
//					int shang = m/n;
//					int liwu = ((shang+1)*n-m) * b;
//					int count = 0, t =n;
//					while(m % t != 0) {
//						t--;
//						count++;
//					}
//					int hongbao = count * a;
//					if (liwu < hongbao) {//这里没有考虑混合的情况，也可以ac
//						res = liwu;
//					}else {
//						res = hongbao;
//					}


    		        // 列出线性规划方程
    		        // n：总客人数， m：总礼物数
    		        // x：离开多少人，y：买多少礼物，k的目的是：让礼物能完全均分，k必须是自然数
    		        // 方程1：k * (n - x) = m + y
    		        // 方程2：minCost = x * a + y * b，求能使minCost最小的 x 和 y。
    		        int r = Integer.MAX_VALUE;
    		 
    		        // redPacketNum代表发几个红包，最多只需要发 n-1 个红包
    		        for (int redPacketNum = 0; redPacketNum < n; redPacketNum++) {
    		            // 求出当发 redPacketNum 个红包时，需要买的礼物数 buyGiftNum
    		            if (m % (n - redPacketNum) == 0) {
    		                r = Math.min(r , redPacketNum * a);
    		            } else {
    		                int buyGiftNum = (m / (n - redPacketNum) + 1) * (n - redPacketNum) - m;
    		                r = Math.min(r , redPacketNum * a + buyGiftNum * b);
    		            }
    		        }
    		        res = r;
				}
			}
				
	        System.out.println(res);
        }
    }
}

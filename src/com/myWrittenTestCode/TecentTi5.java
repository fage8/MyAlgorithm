package com.myWrittenTestCode;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
/**
 * (正确做法)
 * 一颗满二叉树，按照1,2,3...编号，给定序号x，x往上每一层有一个它的祖先节点，返回x的在第k层的祖先节点
 * @author Administrator
 *
 */
public class TecentTi5 {


	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int Q = sc.nextInt();
	    for (int i = 0; i < Q; i++) {
	        long x = sc.nextLong();
	        int k = sc.nextInt();
	        System.out.println(getFather(x,k));
	    }
	}
	 
	//找父节点
	public static long getFather(long x,int k){
	    int nowDeep = getDeep(x);//x所在的层数
	    if (k >= nowDeep || k < 1) {
	        return -1;
	    }
	    //一层层往上找父节点，总共需要计算nowDeep - k次
	    if (x % 2 == 0) {
			x = x >> (nowDeep - k);
		}else {
			x = (x - 1) >> (nowDeep - k);
		}
//	    for (int i = 0; i < nowDeep - k; i++) {
//	        if (x % 2 == 0) {//x位于左子树
//	            x = x >> 1;
//	        }else {//x位于右子树
//	            x = (x - 1) >> 1;
//	        }
//	    }
	    return x;
	}
	 
	//计算当前节点x的所在层数，层数从1开始
	public static int getDeep(long x){
	    int deep = 0;
	    long i = 1;
	    while(i <= x){
	        i <<= 1;//左移1位说明乘以2
	        deep++;
	    }
	    return deep;
	}

}

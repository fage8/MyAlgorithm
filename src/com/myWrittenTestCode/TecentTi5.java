package com.myWrittenTestCode;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
/**
 * (��ȷ����)
 * һ����������������1,2,3...��ţ��������x��x����ÿһ����һ���������Ƚڵ㣬����x���ڵ�k������Ƚڵ�
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
	 
	//�Ҹ��ڵ�
	public static long getFather(long x,int k){
	    int nowDeep = getDeep(x);//x���ڵĲ���
	    if (k >= nowDeep || k < 1) {
	        return -1;
	    }
	    //һ��������Ҹ��ڵ㣬�ܹ���Ҫ����nowDeep - k��
	    if (x % 2 == 0) {
			x = x >> (nowDeep - k);
		}else {
			x = (x - 1) >> (nowDeep - k);
		}
//	    for (int i = 0; i < nowDeep - k; i++) {
//	        if (x % 2 == 0) {//xλ��������
//	            x = x >> 1;
//	        }else {//xλ��������
//	            x = (x - 1) >> 1;
//	        }
//	    }
	    return x;
	}
	 
	//���㵱ǰ�ڵ�x�����ڲ�����������1��ʼ
	public static int getDeep(long x){
	    int deep = 0;
	    long i = 1;
	    while(i <= x){
	        i <<= 1;//����1λ˵������2
	        deep++;
	    }
	    return deep;
	}

}

package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ��nλ�˿ͳ���һ���г����г�һ�������ξ���10^5��վ�㣬��1��10^5���
 * ������֪ÿһλ�˿͵��ϳ�վ���³�վ�����ǲ�֪����Щ�˿͵Ķ�Ʊ˳��
 * ��һλ�˿Ͷ�Ʊʱ�������ڵ�ǰ���������λ��ѡ��һ����ϲ����λ�ã��������ǲ�֪���˿͵İ��ã����������嶩�ĸ�λ�������ǲ�֪����
 * ��������Ҫ�����г�������Ҫ���Ŷ�����λ������ʹ�����۳˿͵Ķ�Ʊ�����˳���������ģ����г˿Ͷ�����λ������
 * �ٸ����ӣ�����λ�˿ͣ�
 * A��1->2
 * B:2->3
 * C:1->3
 * ����Ʊ˳����A,C,B,��ôֻ��Ҫ������λ��һ�������㡣��A��Ʊʱ������ѡ��һ����λ����C��Ʊʱ��������λֻʣ��һ�������ᶩ���ʣ�����λ��
 * ��B��Ʊʱ��������λҲֻ��һ�������ᶩ�����λ�����ʼA���Ǹ���λ��
 * ����Ʊ˳����A,B,C����ô�п��ܻ���Ҫ������λ��A����һ����λ��B������A��ͬ����λ����ʱC����Ʊʱ��ֻ�ܶ���������λ
 * ���Զ����������ӣ�����3
 * ����������
 * ��һ�а���һ������n����ʾ�˿͵�������1<=n<=1000��
 * ������n��ÿ�а�����������si��ti����ʾ��iλ�˿͵��ϳ�վ����³�վ�㣨1<=si<ti<=10^5��
 * ���������
 * �����Ӧ�Ĵ�
 * 
 * ���룺
 * 10
 * 84 302
 * 275 327
 * 364 538
 * 26 364
 * 29 386
 * 545 955
 * 715 965
 * 404 415
 * 903 942
 * 150 402
 * �����
 * 6
 * @author Administrator
 *
 */
public class JingdongTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
//        int k = scanner.nextInt();
        int[][] nums = new int[n][2];
	        for (int i = 0; i < n; i++) {
				String[] str= scanner.nextLine().split(" ");
				nums[i][0] = Integer.valueOf(str[0]);
				nums[i][1] = Integer.valueOf(str[1]);
	        }
	        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
	        int[] instance = new int[n];
	        for (int i = 0; i < n; i++) {
				if (nums[i][0] < min) {
					min = nums[i][0];
				}
				if (nums[i][1] > max) {
					max = nums[i][1];
				}
				instance[i] = nums[i][1] - nums[i][0];
			}
	        int maxStance = max - min;
	        Arrays.sort(instance);
	        int i = 0;
	        for (; i < instance.length; i++) {
	        	int sum=0; 
	        	sum+= instance[i];
				if (sum > maxStance) {
					break;
				}
			}
        	System.out.println(i+1);
        }
	}



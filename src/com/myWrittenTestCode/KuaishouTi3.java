package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ���ţ��ֻ��ź�8λ����3����3����������Ϊ˳�Ӻ��룬��8λ�����ظ�3����3������Ϊ���Ӻ���
 * ˳�ӺŻ��Ӻ�λ����ģ���ֵ�ߣ���ͬλ���ı��ӺŴ���˳�Ӻŵļ�ֵ
 * һ���ֻ���ͬʱ��˳�ӻ��ӵģ��Լ�ֵ�����Ϊ�ֻ��ż�ֵ
 * ��ͬ��ֵ���ֻ��ţ����������˳��һ�£��ȶ���
 * �������ֻ��ţ������ֵ����Ľ��ţ����潢�����null
 * 
 * ����
 * 15112347234,15176313245,15176313346,15176313325,15166667234,15188847234
 * ���
 * 15166667234,15112347234,15188847234
 * @author Administrator
 *
 */
public class KuaishouTi3 {

	private static void swap(int[][] res, int i, int j) {
		int temp = res[i][1];
		res[i][1] = res[j][1];
		res[j][1] = temp;
		
		temp = res[i][2];
		res[i][2] = res[j][2];
		res[j][2] = temp;
		
		temp = res[i][0];
		res[i][0] = res[j][0];
		res[j][0] = temp;
	}
	
	private static void sort(int[][] res) {
		for (int i = 0; i < res.length - 1; i++) {
			for (int j = 1; j < res.length - i; j++) {
				if (res[j][1] > res[j-1][1]) {
					swap(res, j-1, j);
				}
			}
		}
		for (int i = 0; i < res.length - 1; i++) {
			for (int j = 1; j < res.length - i; j++) {
				if (res[j][2] > res[j-1][1] && res[j][2] > res[j-1][2]) {
					swap(res, j-1, j);
				}
			}
		}
	}

	public static int[] judge(String str) {//�ж��ֻ����Ƿ��ǽ��ţ�������ż�ֵ�ȼ�
		//substring(3)��ȡ����3��ʼ�����ַ�����toCharArray() �������ַ���ת��Ϊ�ַ�����
		char[] chs = str.substring(3).toCharArray();
		int shunZi = 0;
		int chFu = 0;
		int temps = 0;//ͳ��˳�ӵ����������ַ�������Ӧ�ó�ʼ��Ϊ1��
		int tempc =0;//ͳ�Ʊ��ӵ��ظ��ַ�����
		for (int i = 1; i < chs.length; i++) {
			if (chs[i] - chs[i-1] == 1) {//���������ַ�
				temps++;
				chFu = chFu > tempc ? chFu : tempc;
				tempc = 0;
			}else if (chs[i] == chs[i-1]) {//�ظ��ַ�
				tempc++;
				shunZi = shunZi > temps ? shunZi : temps;
				temps=0;
			}else {
				chFu = chFu > tempc ? chFu : tempc;
				shunZi = shunZi > temps ? shunZi : temps;
				tempc = 0;
				temps = 0;
			}
		}
		return new int[]{chFu, shunZi};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] nums = sc.nextLine().split(",");//�ֻ����ַ�������
			int[][] res = new int[nums.length][3];//��һ�м�¼��������ֵ
			for (int i = 0; i < nums.length; i++) {
				int[] judge = judge(nums[i]);//�ж��Ƿ��ǽ���
				res[i][0] = i;//��һ�м�¼��������ֵ
				res[i][1] = judge[0] > 1 ? judge[0]: 0;//��¼����˳�Ӽ�ֵ�ȼ�
				res[i][2] = judge[1] > 1 ? judge[1]: 0;//��¼���ű��Ӽ�ֵ�ȼ�
			}
			sort(res);
			for (int i = 0; i < res.length - 1; i++) {
				if (res[i][1] > 1 || res[i][2] > 1) {
					System.out.print(nums[res[i][0]] + ",");
				}
			}
			if (res[res.length - 1][1] > 1 || res[res.length - 1][2] > 1) {
				System.out.print(nums[res[res.length - 1][0]]);
			}
		}
	}

}

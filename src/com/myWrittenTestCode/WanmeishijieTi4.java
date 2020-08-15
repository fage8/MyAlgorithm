package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ��������
 * @author Administrator
 *
 */
public class WanmeishijieTi4 {
	private static int solveKS(int[] w, int[] v, int index, int capacity) {
        //��׼���������������Ч�����������㣬ֱ�ӷ��ص�ǰ��ֵ0
        if (index < 0 || capacity <= 0)
            return 0;

        //���ŵ�index����Ʒ���ü�ֵ
        int res = solveKS(w, v, index - 1, capacity);
        //�ŵ�index����Ʒ���ü�ֵ��ǰ���ǣ���index����Ʒ���Էŵ��£�
        if (w[index] <= capacity) {
            res = Math.max(res, v[index] + solveKS(w, v, index - 1, capacity - w[index]));
        }
        return res;
    }

    public static int knapSack(int[] w, int[] v, int C) {
        int size = w.length;
        return solveKS(w, v, size - 1, C);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
        	int n = Integer.valueOf(scanner.nextLine());
        	int k = Integer.valueOf(scanner.nextLine());//������ʵ��С
        	int[] w = new int[n];
        	int[] v = new int[n];

			String[] str= scanner.nextLine().split(" ");
			String[] str1= scanner.nextLine().split(" ");
			for (int i = 0; i < n; i++) {
				w[i] = Integer.valueOf(str[i]);
				v[i] = Integer.valueOf(str1[i]);
			}

	        System.out.println(knapSack(w,v,k));
        }
	}

}

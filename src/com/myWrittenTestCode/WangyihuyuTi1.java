package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * ��Ϸ������վ������ĳ�������ڣ����ֳ�һ�Ѵ󵶣����Գ������ⷽ��ӿ���ÿ��������һ������Ʒʱ���������Ʒ����ʧ��ͬʱ���ĳ��Ȼ���Ӧ�䳤��
 * СA���ó��������Ϸ�����������һ�µ���Ϸ��������û���κο��Կ����Ĳ���Ʒʱ������ѵ������ճ���
 * 
 * ����������
 * ��һ��һ��������T����ʾ�ж���������
 * ����ÿ����������һ��������������M(5<=M<=500)��L(0<L<=500)���ֱ��ʾ��Ϸ�����С�������ʼ�󵶵ĳ���
 * ������M�У�ÿһ����M���ɿո�ֿ���p(0<=p<=500).��pΪ0ʱ����ʾ�ø���û�в���Ʒ�������ʾ�����ǿ����ò���Ʒʱ�����ĳ�������p
 * ����������������X,Y����ʾ����վ�ڵ�x�У���y��(��������0��ʼ����)
 * 
 * ����
 * 2
 * 10 3
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 2 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 1 0 2 0 0 0
 * 0 0 0 0 0 0 0 0 0 2
 * 0 0 0 1 0 0 0 0 0 1
 * 0 0 0 1 0 0 2 0 2 0
 * 8 8
 * 10 2
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0
 * 0 0 2 0 0 1 0 0 0 0
 * 0 0 0 1 2 0 2 0 0 0
 * 0 0 0 0 2 1 2 0 2 0
 * 0 0 2 0 0 0 0 0 2 0
 * 0 0 0 0 0 0 0 2 0 0
 * 0 0 0 1 0 0 0 0 0 0
 * 2 5
 * ���
 * 17
 * 3
 * @author Administrator
 *
 */
public class WangyihuyuTi1 {

    public static int movingCountCore(int[][] m, int rows, int cols, int row, int col,int l){
        if(rows >= 0 || cols >= 0||row < rows || col < cols){
        	if (m[row][col] != 0) {						
        		l = m[row][col] + movingCountCore(m, rows, cols, row - 1, col, l) + movingCountCore(m, rows, cols, row, col - 1, l) + movingCountCore(m,rows, cols, row + 1, col, l)+ movingCountCore(m, rows, cols, row, col + 1, l);
        		m[row][col] = 0;
        	} else {
        		l = movingCountCore(m, rows, cols, row - 1, col,l) + movingCountCore(m, rows, cols, row, col - 1, l) + movingCountCore(m,rows, cols, row + 1, col, l)+ movingCountCore(m, rows, cols, row, col + 1, l);     
        	}
        }

        return l;
    }
    public static int movingCount(int x, int y, int rows, int cols,int l, int[][] m){
        if(rows <= 0 || cols <= 0|| rows>500|| cols>500|| x <= 0 || y <= 0|| x >= rows || y >= cols||l <= 0 || l >500){
            return 0;
        }
    	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < cols ;j++) {				
    			if (m[i][j] <0 || m[i][j]>500) {
					return 0;
				}
    		}
    	}
        int count = l;
		
		count = movingCountCore(m, rows, cols, x, y, l);
	
        return count;
    }
    
	public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int Q = 0; Q < T; Q++) {
        	int M = sc.nextInt();
        	int L = sc.nextInt();
        	int[][] m = new int[M][M];
        	String[][] str1 = new String[M][M];
        	for (int i = 0; i < M; i++) {
        		str1[i] = sc.nextLine().split(" ");
        	}
        	for (int i = 0; i < M; i++) {
        		for (int j = 0; j < M ;j++) {				
        			m[i][j] = Integer.valueOf(str1[i][j]);
        		}
        	}
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int count = movingCount(x,y, M, M, L, m);
        	System.out.println(count);
		}
    }

}

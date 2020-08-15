package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 游戏的主角站在其中某个方格内，他手持一把大刀，可以朝着任意方向挥砍。每当他砍到一个补给品时，这个补给品会消失，同时刀的长度会相应变长。
 * 小A很擅长玩这个游戏，请你帮他算一下当游戏结束（即没有任何可以砍到的补给品时），这把刀的最终长度
 * 
 * 输入描述：
 * 第一行一个正整数T，表示有多少组样例
 * 对于每组样例，第一行是两个正整数M(5<=M<=500)和L(0<L<=500)，分别表示游戏区域大小和主角最开始大刀的长度
 * 接下来M行，每一行是M个由空格分开的p(0<=p<=500).当p为0时，表示该格子没有补给品，否则表示若主角砍到该补给品时，刀的长度增加p
 * 接下来是两个整数X,Y，表示主角站在第x行，第y列(行列数从0开始计算)
 * 
 * 输入
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
 * 输出
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

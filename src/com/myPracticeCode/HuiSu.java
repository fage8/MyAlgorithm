package com.myPracticeCode;
import java.util.Scanner;

public class HuiSu {
    public static int getDigitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static boolean check(int k, int rows, int cols, int row, int col, boolean[] visited){
        if(row >= 0 && row < rows && col >= 0 && col < cols && getDigitSum(row) + getDigitSum(col) <= k && !visited[row * cols + col]){
            return true;
        }
        return false;
    }
    public static int movingCountCore(int k, int rows, int cols, int row, int col, boolean[] visited){
        int count = 0;
        if(check(k, rows, cols, row, col, visited)){
            visited[row * cols + col] = true;
            count = 1 + movingCountCore(k, rows, cols, row - 1, col, visited) + movingCountCore(k, rows, cols, row, col - 1, visited) + movingCountCore(k, rows, cols, row + 1, col, visited)+ movingCountCore(k, rows, cols, row, col + 1, visited);     
        }
        return count;
    }
    public static int movingCount(int k, int rows, int cols){
        if(k < 0 || rows <= 0 || cols <= 0){
            return 0;
        }
        boolean[] visited = new boolean[rows * cols];
        for(int i = 0; i < rows * cols; i++){
            visited[i] = false;
        }
        int count = movingCountCore(k, rows, cols, 0, 0, visited);
        return count;
    }
    
	public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int k = sc.nextInt();
        int count = movingCount(k, rows, cols);
        System.out.println(count);
    }
}

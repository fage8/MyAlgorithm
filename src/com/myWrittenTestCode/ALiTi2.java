package com.myWrittenTestCode;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *(正确做法)
 * 输入n,m两个整数代表n行m列，2<=n,m<=500
 * 下面输入n行字符串，每个字符串都包含m个字符（只含有'.','#','E','S'）
 * 其中S代表起点，E代表终点，#代表无法通过
 * 从起点出发，可向左，向右，向上，向下移动一步
 * 也可按如下中心对称移动，也只算移动一步，飞行器最多使用5次
 * X（i,j）→ X'（n+1-i,m+1-j），i，j都是从1开始
 * (X（i,j）→ X'（n-1-i,m-1-j），i，j都是从0开始)
 * 求从起点到终点最少需要移动几步，无法到达终点输出-1
 * 
 *输入
 * 4 4
 * #S..
 * E#..
 * #...
 * ....
 * 说明：先中心对称到达（4，3），然后向上一步，向右一步，中心对称到达终点
 * 输出
 * 4
 * @author Administrator
 *
 */
public class ALiTi2 {

	static int [][] forward = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};//4行2列
    static class Node{
        int node_x;
        int node_y;
        Node(int x, int y){
            node_x = x;
            node_y = y;
        }
    }
    //  使用广度优先搜索的方法BFS
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();//这个目的就是跳过第一行输入的n和m，免得输入会报错
        char[][] strChar = new char[n][m];
 
        int end_x = -1;//终点位置
        int end_y = -1;
        LinkedList<Node> queue = new LinkedList<>();
        //  dp[i][j][k]代表到达[i][j]位置，用了k个飞行器时（不一定要都用，是有k个飞行器的条件），最少经过的步数
        int[][][] dp = new int[n][m][5];
 
        //  给dp中的每个值附一个初值
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                for(int k = 0; k < 5;k++){
                    dp[i][j][k] = m * n + 1;  //  注意，不可以赋值为Integer.MAX_VALUE,加减之后会出现负值
                }
            }
        }
        // 遍历输入存放到二维字符数组中，确定起始位置和终点位置
        for(int i = 0; i < n; i++){
            String temp = sc.nextLine();
            for(int j = 0; j < m; j++){
                if(temp.charAt(j) == 'S'){//起点位置
                    Node node = new Node(i,j);//新建链表节点，存放坐标位置
                    for(int k = 0; k < 5;k++){
                        dp[i][j][k] = 0;//起点位置的最短距离为0
                    }
                    queue.add(node);//添加头节点到链表中
                }
                else if(temp.charAt(j) == 'E'){
                    end_x = i;
                    end_y = j;
                }
                strChar[i][j] = temp.charAt(j);//放到二维字符数组中
            }
        }
 
        //  BFS广度优先搜索，寻找到达终点经过的最少的步数
        while(!queue.isEmpty()){
            Node node = queue.poll();//弹出起始节点
            int x = node.node_x;
            int y = node.node_y;
            //  上下左右走，相同k更新
            for(int i = 0; i < 4;i++){//起始位置开始上下左右走
                int temp_x = x + forward[i][0];
                int temp_y = y + forward[i][1];
                if(temp_x >= 0 && temp_x < n && temp_y >= 0 && temp_y < m && strChar[temp_x][temp_y] != '#'){
                    boolean flag = false;
                    for(int k = 0; k < 5; k++){
                        if(dp[temp_x][temp_y][k] > dp[x][y][k] + 1){//非起点值的初始化的值是n*m+1
                            dp[temp_x][temp_y][k] = dp[x][y][k] + 1;
                            flag = true;
                        }
                    }
                    //  相当于每一个节点的步数重新做了更新，都要重新考虑一遍此节点
                    if(flag){
                        queue.add(new Node(temp_x,temp_y));
                    }
                }
            }
            //  跳跃更新
            if(strChar[n - x - 1][m - y - 1] != '#'){
 
                boolean flag = false;
                for(int k = 0; k < 4; k++){//跳跃了一次，后面只有4次了
                    if(dp[n - x - 1][m - y - 1][k + 1] > dp[x][y][k] + 1){//非起点值的初始化的值是n*m+1
                        dp[n - x - 1][m - y - 1][k + 1] = dp[x][y][k] + 1;
                        flag = true;
                    }
                }
                if(flag){
                    queue.add(new Node(n - x - 1,n - y - 1));
                }
            }
 
        }
        
        if(dp[end_x][end_y][4] != n * m + 1) {
            System.out.println(dp[end_x][end_y][4]);
        }else{
            System.out.println(-1);
        }
        
    }

}

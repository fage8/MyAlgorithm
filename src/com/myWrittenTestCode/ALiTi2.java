package com.myWrittenTestCode;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *(��ȷ����)
 * ����n,m������������n��m�У�2<=n,m<=500
 * ��������n���ַ�����ÿ���ַ���������m���ַ���ֻ����'.','#','E','S'��
 * ����S������㣬E�����յ㣬#�����޷�ͨ��
 * �������������������ң����ϣ������ƶ�һ��
 * Ҳ�ɰ��������ĶԳ��ƶ���Ҳֻ���ƶ�һ�������������ʹ��5��
 * X��i,j���� X'��n+1-i,m+1-j����i��j���Ǵ�1��ʼ
 * (X��i,j���� X'��n-1-i,m-1-j����i��j���Ǵ�0��ʼ)
 * �����㵽�յ�������Ҫ�ƶ��������޷������յ����-1
 * 
 *����
 * 4 4
 * #S..
 * E#..
 * #...
 * ....
 * ˵���������ĶԳƵ��4��3����Ȼ������һ��������һ�������ĶԳƵ����յ�
 * ���
 * 4
 * @author Administrator
 *
 */
public class ALiTi2 {

	static int [][] forward = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};//4��2��
    static class Node{
        int node_x;
        int node_y;
        Node(int x, int y){
            node_x = x;
            node_y = y;
        }
    }
    //  ʹ�ù�����������ķ���BFS
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();//���Ŀ�ľ���������һ�������n��m���������ᱨ��
        char[][] strChar = new char[n][m];
 
        int end_x = -1;//�յ�λ��
        int end_y = -1;
        LinkedList<Node> queue = new LinkedList<>();
        //  dp[i][j][k]������[i][j]λ�ã�����k��������ʱ����һ��Ҫ���ã�����k���������������������پ����Ĳ���
        int[][][] dp = new int[n][m][5];
 
        //  ��dp�е�ÿ��ֵ��һ����ֵ
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                for(int k = 0; k < 5;k++){
                    dp[i][j][k] = m * n + 1;  //  ע�⣬�����Ը�ֵΪInteger.MAX_VALUE,�Ӽ�֮�����ָ�ֵ
                }
            }
        }
        // ���������ŵ���ά�ַ������У�ȷ����ʼλ�ú��յ�λ��
        for(int i = 0; i < n; i++){
            String temp = sc.nextLine();
            for(int j = 0; j < m; j++){
                if(temp.charAt(j) == 'S'){//���λ��
                    Node node = new Node(i,j);//�½�����ڵ㣬�������λ��
                    for(int k = 0; k < 5;k++){
                        dp[i][j][k] = 0;//���λ�õ���̾���Ϊ0
                    }
                    queue.add(node);//���ͷ�ڵ㵽������
                }
                else if(temp.charAt(j) == 'E'){
                    end_x = i;
                    end_y = j;
                }
                strChar[i][j] = temp.charAt(j);//�ŵ���ά�ַ�������
            }
        }
 
        //  BFS�������������Ѱ�ҵ����յ㾭�������ٵĲ���
        while(!queue.isEmpty()){
            Node node = queue.poll();//������ʼ�ڵ�
            int x = node.node_x;
            int y = node.node_y;
            //  ���������ߣ���ͬk����
            for(int i = 0; i < 4;i++){//��ʼλ�ÿ�ʼ����������
                int temp_x = x + forward[i][0];
                int temp_y = y + forward[i][1];
                if(temp_x >= 0 && temp_x < n && temp_y >= 0 && temp_y < m && strChar[temp_x][temp_y] != '#'){
                    boolean flag = false;
                    for(int k = 0; k < 5; k++){
                        if(dp[temp_x][temp_y][k] > dp[x][y][k] + 1){//�����ֵ�ĳ�ʼ����ֵ��n*m+1
                            dp[temp_x][temp_y][k] = dp[x][y][k] + 1;
                            flag = true;
                        }
                    }
                    //  �൱��ÿһ���ڵ�Ĳ����������˸��£���Ҫ���¿���һ��˽ڵ�
                    if(flag){
                        queue.add(new Node(temp_x,temp_y));
                    }
                }
            }
            //  ��Ծ����
            if(strChar[n - x - 1][m - y - 1] != '#'){
 
                boolean flag = false;
                for(int k = 0; k < 4; k++){//��Ծ��һ�Σ�����ֻ��4����
                    if(dp[n - x - 1][m - y - 1][k + 1] > dp[x][y][k] + 1){//�����ֵ�ĳ�ʼ����ֵ��n*m+1
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

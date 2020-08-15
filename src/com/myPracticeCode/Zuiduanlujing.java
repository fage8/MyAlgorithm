package com.myPracticeCode;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * ��������ǰ��һ��n���ڵ������ȫ��ͨ�޻�ͼ�������ϵı�ֻ��2����ɫ����ɫ���ߺ�ɫ�����ڻ�����һ������k�������������k���ڵ������[a1, a2, ..., ak]��
[a1, a2, ..., ak]����ǡ������С����ҽ������������������
1. ����Ҫ��һ����a1��ʼ��ak������·����
2. ��a1��ʼ����a2��һ��a1��a2�����·��Ȼ���a2��ʼ��������һ����a3�����·���Դ����ƣ����յ�a(k-1)��ak��
3. �ߵ�·�������ٰ���һ����ɫ�ıߡ�

���ǿ�һ�������ͼƬ�е��������k=3����ô����������ǡ������С���[1,4,7], [5,5,3]����������в��Ǻ����У� [1,4,6], [5,5,5], [3,7,3]��
�ܹ���n^k��n��k�η���·������������ô�ж���·���ǡ������С��أ����ֵ���ܷǳ�������Ľ����(10^9+7)ȡģ�Ϳ��ԡ�
 * @author Administrator
 *
 */
public class Zuiduanlujing {
    static int mod = 1000000007;
    static Set<Integer>[] adj;
    static boolean[] visited;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        adj = new HashSet[n + 1];//���򲻿��ظ�
        visited = new boolean[n + 1];
        BigInteger bad = new BigInteger("0");
        for(int i = 1;i <= n;i++) {
        	adj[i] = new HashSet<>();
        }
        while(scanner.hasNext()){
            int a = scanner.nextInt(), b = scanner.nextInt(), weight = scanner.nextInt();
            if(weight == 0) {
                adj[a].add(b);
                adj[b].add(a);
            }
        }
        for(int i = 1;i <= n;i++)
            if(!visited[i]) {
            	bad = bad.add(fastPow(dfs(i),k)).mod(new BigInteger("" + mod));
            }
        BigInteger big = fastPow(n,k);
        System.out.println(big.subtract(bad).add(new BigInteger(mod + "")).mod(new BigInteger(mod + "")));
    }
 
    public static int dfs(int num){
        visited[num] = true;
        int res = 1;
        for(int next: adj[num]){
            if(!visited[next]) res += dfs(next);
        }
        return res;
    }
 
    public static BigInteger fastPow(int n, int k){
        if(k == 0) return new BigInteger("1");
        BigInteger half = fastPow(n, k / 2);
        if(k%2 == 0) return half.multiply(half).mod(new BigInteger(mod + ""));
        else return half.multiply(half).multiply(new BigInteger(n + "")).mod(new BigInteger(mod + ""));
    }
     
}

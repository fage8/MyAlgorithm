package com.myPracticeCode;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * 现在你面前有一棵n个节点的树（全连通无环图）。树上的边只有2种颜色，红色或者黑色。现在还给你一个整数k，考虑下面这个k个节点的序列[a1, a2, ..., ak]。
[a1, a2, ..., ak]如果是”好序列“当且仅当满足下面的条件：
1. 我们要走一条从a1开始到ak结束的路径。
2. 从a1开始，到a2走一条a1到a2的最短路。然后从a2开始，继续走一条到a3的最短路，以此类推，最终到a(k-1)和ak。
3. 走的路径中至少包含一条黑色的边。

我们看一下上面的图片中的树，如果k=3，那么下面的序列是“好序列”：[1,4,7], [5,5,3]。下面的序列不是好序列： [1,4,6], [5,5,5], [3,7,3]。
总共有n^k（n的k次方种路径方案），那么有多少路径是“好序列”呢？这个值可能非常大，输出的结果对(10^9+7)取模就可以。
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
        adj = new HashSet[n + 1];//无序不可重复
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

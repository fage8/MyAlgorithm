package com.myWrittenTestCode;

import java.util.*;
/**
 * (正确做法)
 * 输入描述:
 *  第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类文章的喜好度 第3行为一个正整数q代表查询的组数  
 * 第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。
 * 数据范围n <= 300000,q<=300000 k是整型
 * 输出描述：
 * 一共q行，每行一个整数代表喜好值为k的用户的个数
 * 输入例子1:
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 * 输出例子1:
 * 1
 * 0
 * 2
 * @author Administrator
 *
 */
public class ShidaifuxingTi1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int cur;
//            Map<Integer, List<Integer>> map = new HashMap<>();
//            for (int i = 1; i <= n; i++) {
//                cur = sc.nextInt();
//                if (!map.containsKey(cur)){
//                    ArrayList<Integer> temp = new ArrayList<>();
//                    temp.add(i);
//                    map.put(cur,temp);
//                }else{
//                    map.get(cur).add(i);
//                }
//            }
//            int m = sc.nextInt();
//            for (int i = 0; i < m; i++) {
//                int l = sc.nextInt();
//                int r = sc.nextInt();
//                int target = sc.nextInt();
//                if (!map.containsKey(target)){
//                    System.out.println(0);
//                }else {
//                    List<Integer> list = map.get(target);
//                    if (list.get(0)<l && list.get(list.size()-1)>r){
//                        System.out.println(0);
//                    }else {
//                        int res = 0;
//                        for (Integer j : list) {
//                            if (j>r)break;
//                            if (j>=l)res++;
//                        }
//                        System.out.println(res);
//                    }
//                }
//            }
//        }
//    }
    //方法二：暴力法可能会存在k值越界，或者超时
     public static void main(String[] args) {
	 	// TODO Auto-generated method stub
	 	Scanner scanner = new Scanner(System.in);
	 	int n = scanner.nextInt();//用户数
	 	int[] a = new int[300001];
	 	for (int i = 0; i < n; i++) {
	 		a[i] = scanner.nextInt();//用户的喜好度
	 	}
	 	int q = scanner.nextInt();//组数
	 	int[] res = new int[q];
	 	for (int i = 0; i < q; i++) {
	 		int l = scanner.nextInt();
	 		int r = scanner.nextInt();
	 		int k = scanner.nextInt();
	 		int count = 0;
	 		for(int j = l - 1; j < r; j++)
	 		{
	 			if(a[j] == k) count++;
	 		}
	 		res[i] = count;
	 	}
	 	for (int i = 0; i < res.length; i++) {//输出结果
	 		System.out.println(res[i]);
	 	}
	 }
}

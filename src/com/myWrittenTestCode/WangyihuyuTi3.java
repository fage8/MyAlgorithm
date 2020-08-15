package com.myWrittenTestCode;
import java.util.Scanner;
/**
 * (正确做法)
 * 若一个排列中所有元素都不在自己原来的位置上，那么这样的排列称为原排列的一个错排
 * D(n) = (n - 1) * (D(n-1) + D(n-2))
 * 假设排列A:A1,A2,...,An为1..n的一个排列，排列B：B1,B2,...,Bn为1..n的另一个排列。B是A的一个错排
 * 定义A和B的距离为：
 * Distance(A,B)=V1|PosA(1)-PosB(1)|+V2|PosA(2)-PosB(2)|+...+Vn|PosA(n)-PosB(n)|
 * PosA(i),PosB(i)分别表示数字i在排列A和排列B中的位置。V为输入的权重，Vi表示对应的数字i的权重，并且Vi都是100以内的正整数。
 * 给定排列A和权重序列V，在所有的排列A的错排中，最小的距离是多少。
 * 关键结论：|PosA(i)-PosB(i)|取值范围为[1,n-1]
 * 
 * 输入描述：
 * 第一行一个正整数T，表示有多少组样例
 * 对于每一个测试数据包含3行，第一行为n(1<n<=20)，第二行有n个正整数，表示排列A。第三行包含n个正整数，依次是V1,V2,...,Vn(1<=V1<=100)
 * 输入
 * 3
 * 3
 * 1 2 3
 * 1 2 3
 * 4
 * 4 3 2 1
 * 1 1 1 1
 * 2
 * 1 2
 * 10 20
 * 输出
 * 7
 * 4
 * 30
 * @author Administrator
 *
 */
public class WangyihuyuTi3 {

    public static int MAX= Integer.MAX_VALUE;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int t = scanner.nextInt();
       int res[] = new int[t];

       for(int k = 0; k < t; k++) {
           int n = scanner.nextInt();
           int a[] = new int[n];//原排列
           int v[] = new int[n];//权重
           for (int i = 0; i < n; i++) {
               a[i] = scanner.nextInt();
           }
           int min = Integer.MAX_VALUE;
           int min_index = 0;
           for (int i = 0; i < n; i++) {
               v[i] = scanner.nextInt();
               if (v[i] < min) {
            	   min = v[i];
            	   min_index = i;
               }
           }
           for (int i = 0; i < n; i++) {
        	   if (n % 2 == 0) {//n为偶数的情况，最短距离求法
        		   res[k] += v[i];
				
			   }else {//n为奇数的情况，最短距离求法
				   if (i != min_index) {//min_index为最小权值对应的索引值
					   res[k] += v[i];
				   }else {
					   res[k] += 2 * v[min_index];
				   }
			   }
           }

       }
       for (int i = 0; i < t; i++) {
    	   System.out.println(res[i]);
       }

    }
    
//    public static void f(int a[], int b[], int v[], int k){
//        if(k == a.length) {
//            if(f1(a,b)) {
//               int temp1 = f2(a,b,v);
//               if(temp1 < MAX)
//                   MAX = temp1;
//            }
//
//            return;
//        }
//
//        for(int i = k; i < a.length; i++){
//            int temp = a[k];
//            a[k] = a[i];
//            a[i] = temp;
//            f(a, b, v, k + 1);
//            temp = a[k];
//            a[k] = a[i];
//            a[i] = temp;
//        }
//
//    }
//
//
//    public static boolean f1(int a[], int b[]){
//        for (int i = 0; i < a.length; i++) {
//            if(a[i] == b[i])
//                return false;
//        }
//
//        return true;
//    }
//
//    public static int f2(int a[], int b[], int v[]){
//        int temp[] = new int[a.length];
//        for (int i = 0; i < a.length ; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if(a[i] == b[j]) {
//                    temp[i] = j+1;
//                    break;
//                }
//            }
//        }
//        int sum = 0;
//        for(int i = 0; i < b.length; i++) {
//            sum = v[i] * Math.abs(temp[i] - b[i]) + sum;
//        }
//
//        return sum;
//    }
//
//    public static void f3(int a[], int v[]){
//        for(int i = 0; i < a.length - 1; i++){
//            int minOp = i;
//            for(int j = i + 1; j < a.length; j++){
//                if(a[j-1] > a[j]){
//                   minOp = j;
//                }
//            }
//
//            int temp = a[minOp];
//            a[minOp] = a[i];
//            a[i] = temp;
//            temp = v[minOp];
//            v[minOp] = v[i];
//            v[i] = temp;
//        }
//
//    }
}


package com.myWrittenTestCode;
import java.util.Scanner;
/**
 * (��ȷ����)
 * ��һ������������Ԫ�ض������Լ�ԭ����λ���ϣ���ô���������г�Ϊԭ���е�һ������
 * D(n) = (n - 1) * (D(n-1) + D(n-2))
 * ��������A:A1,A2,...,AnΪ1..n��һ�����У�����B��B1,B2,...,BnΪ1..n����һ�����С�B��A��һ������
 * ����A��B�ľ���Ϊ��
 * Distance(A,B)=V1|PosA(1)-PosB(1)|+V2|PosA(2)-PosB(2)|+...+Vn|PosA(n)-PosB(n)|
 * PosA(i),PosB(i)�ֱ��ʾ����i������A������B�е�λ�á�VΪ�����Ȩ�أ�Vi��ʾ��Ӧ������i��Ȩ�أ�����Vi����100���ڵ���������
 * ��������A��Ȩ������V�������е�����A�Ĵ����У���С�ľ����Ƕ��١�
 * �ؼ����ۣ�|PosA(i)-PosB(i)|ȡֵ��ΧΪ[1,n-1]
 * 
 * ����������
 * ��һ��һ��������T����ʾ�ж���������
 * ����ÿһ���������ݰ���3�У���һ��Ϊn(1<n<=20)���ڶ�����n������������ʾ����A�������а���n����������������V1,V2,...,Vn(1<=V1<=100)
 * ����
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
 * ���
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
           int a[] = new int[n];//ԭ����
           int v[] = new int[n];//Ȩ��
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
        	   if (n % 2 == 0) {//nΪż�����������̾�����
        		   res[k] += v[i];
				
			   }else {//nΪ�������������̾�����
				   if (i != min_index) {//min_indexΪ��СȨֵ��Ӧ������ֵ
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


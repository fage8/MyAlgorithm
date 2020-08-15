package com.myWrittenTestCode;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ∆Ø¡˜Œ Ã‚
 * @author Administrator
 *
 */
public class WanmeishijieTi1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p[] = s.split(" ");
        int[] people = new int[p.length];
        for(int i=0;i<p.length;i++){
            people[i]=Integer.parseInt(p[i]);
        }
        int limit = sc.nextInt();
        System.out.println(minBoot(people, limit));
    }
 
    private static int minBoot(int[] a, int limit) {
        int result = 0,count=0;
        int n = a.length;
        Arrays.sort(a);
        if(a[n-1]<=limit/2)return a.length/2;
        for (int i = 0; i < n-count; i++) {
            if(i==n-count-1){
                result++;
                break;
            }
            if(a[i]!=-1){
                if(a[i]+a[n-count-1]>limit){
                    if(i>0){
                        a[i-1]=-1;
                    }
                    i--;
                }else if(a[i]+a[n-count-1]==limit){
                    a[i]=-1;
                }
                result++;count++;
            }
        }
        return result;
    }


}

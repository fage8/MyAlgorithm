package com.myHandwrittenCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 阿里新零售金融面试题(正确做法)
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 * 输入
 * [3,30,34,5,9]
 * 输出
 * 9534330
 * @author Administrator
 *
 */
public class LargeNumber {
	public static String largestNumber(String[] str) {
        if(str.length < 1) return "";//鲁棒性
        
        // for(int i = 0; i < str.length; i++){
        //     for(int j = i + 1; j < str.length; j++){
        //         if((str[i] + str[j]).compareTo(str[j] + str[i]) < 0){
        //             String s = str[i];
        //             str[i] = str[j];
        //             str[j] = s;
        //         }
        //     }
        // }
        Arrays.sort(str, new Comparator<String>() {//重写sort方法
            @Override
            public int compare(String o1, String o2) {
                return -(o1+o2).compareTo(o2+o1);//小于0则交换
            }
        });
        if(str[0].equals("0")){//最大的元素为0，说明数组元素全为0,结果为0不是多个0
            return "0";
        }else{
            return String.join("", str);//将字符串数组变成字符串
        } 
        //String ans = "";
        // for(int i = 0; i < str.length; i++){
        //     ans += str[i];
        // }
        // return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(",");
		String largestNumber = largestNumber(str);
		System.out.println(largestNumber);
	}

}

package com.myHandwrittenCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * ���������۽���������(��ȷ����)
 * ����һ��Ǹ������������������ǵ�˳��ʹ֮���һ������������
 * ����
 * [3,30,34,5,9]
 * ���
 * 9534330
 * @author Administrator
 *
 */
public class LargeNumber {
	public static String largestNumber(String[] str) {
        if(str.length < 1) return "";//³����
        
        // for(int i = 0; i < str.length; i++){
        //     for(int j = i + 1; j < str.length; j++){
        //         if((str[i] + str[j]).compareTo(str[j] + str[i]) < 0){
        //             String s = str[i];
        //             str[i] = str[j];
        //             str[j] = s;
        //         }
        //     }
        // }
        Arrays.sort(str, new Comparator<String>() {//��дsort����
            @Override
            public int compare(String o1, String o2) {
                return -(o1+o2).compareTo(o2+o1);//С��0�򽻻�
            }
        });
        if(str[0].equals("0")){//����Ԫ��Ϊ0��˵������Ԫ��ȫΪ0,���Ϊ0���Ƕ��0
            return "0";
        }else{
            return String.join("", str);//���ַ����������ַ���
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

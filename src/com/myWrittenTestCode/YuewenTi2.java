package com.myWrittenTestCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * (��ȷ����)
 * ���ڶ�̬���������ÿ���ַ������ֽ��д�����ӣ���������ַ���
 * ����
 * ["742934823489","424234324899943","428928942384928"]
 * ���
 * "853906202108360"
 * @author Administrator
 *
 */
public class YuewenTi2 {
    public static String sum (ArrayList<String> numbers) {
	    BigInteger sum = new BigInteger("0");
    	for (int i = 0; i < numbers.size(); i++) {
    		BigInteger a = new BigInteger(numbers.get(i));
			sum = sum.add(a);
		}
		return String.valueOf(sum);
    	
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			ArrayList<String> arrayList = new ArrayList<String>();
			String[] s = sc.nextLine().split(",");
			for (int i = 0; i < s.length; i++) {
				arrayList.add(s[i]);
			}
			String res = sum(arrayList);
			System.out.println(res);
		}
	}

}

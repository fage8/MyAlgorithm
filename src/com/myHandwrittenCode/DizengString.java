package com.myHandwrittenCode;

import java.util.Arrays;
import java.util.Scanner;

public class DizengString {
    /**
     * ����һ����(��ȷ����)
    ����һ������������������飬���������Ԫ�����еĳ��ȡ�
    ���磺 ����������Ϊ[100,4,200,1,3,2],
    �������Ԫ������Ϊ[1, 2, 3, 4]. ����������еĳ��ȣ�4 
    ����Ҫ����ʱ�临�Ӷ���O��n��֮�ڵ��㷨
        */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		String[] name = sc.nextLine().split(",");
		int[] n = new int[name.length];
		for (int i = 0; i < name.length; i++) {
			n[i] = Integer.valueOf(name[i]);
		}
		Arrays.sort(n);

		for (int i = 0; i < n.length; i++) {			
			System.out.print(n[i] + " ");
		}
		System.out.println();
		int length = 1, maxlen = 1;
		for (int i = 1; i < n.length; i++) {
			if (n[i] - n[i-1] == 1) {
				length++;
			}else {
				length = 1;
			}
			if (length > maxlen) {
				maxlen = length;
			}

		}
		System.out.println(maxlen);
	}
	}
}

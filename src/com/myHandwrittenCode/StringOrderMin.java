package com.myHandwrittenCode;

import java.util.Scanner;
/** 
 * ��;һ����(��ȷ����)
 * �����ַ���S������ַ���T
 * �����ɾ����һ���ַ���Ҳ����ɾ�����һ���ַ�
 * ��ӵ��µ��ַ���T�У��ȼ����ֵ�˳��С�ģ�A<B��A�Ƚ��ַ���T�У�
 * 
 * ����
 * ACDBCB
 * ���
 * ABCBCD
 * ����
 * ABCAAABCAAADCB
 * ���
 * ABBCAAABCAAACD
 * @author Administrator
 *
 */
public class StringOrderMin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			char[] ch = s.toCharArray();
 			StringBuffer t = new StringBuffer();
			int first = 0, end = ch.length - 1;
			while(first <= end) {
				boolean flag = false;
				for (int i = 0; first + i <= end; i++) {//�����Ƚϳ���һ��С��Ԫ��
					if(ch[first+i] < ch[end-i]){
						flag = true;
						break;
					}
					else if (ch[first+i] > ch[end-i]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					t.append(ch[first]);
					first++;
				}else {
					t.append(ch[end]);
					end--;
				}
			}
			System.out.println(t.toString());
		}

	}

}

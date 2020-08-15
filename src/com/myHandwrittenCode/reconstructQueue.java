package com.myHandwrittenCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * ��Ϊ��������
 * (��ȷ����)
 * �ж��ͬѧ����ÿ��ͬѧ����������w��k��w��ʾ���أ�k��ʾǰ�治�������ͬѧ������
 * ���ԭʼͬѧ�����н�������ʹ�÷��������������
 * ����[[8,0], [4,4], [8,1], [5,0], [6,1], [5,2]]
 * ���[[5,0], [8,0], [5,2], [6,1], [4,4], [8,1]]��
 * �Ȱ���w�ݼ�����w��k��������
 * ֮�����ν�ÿλͬѧ���뵽���Ϊk����0��ʼ����λ���У����յ�˳�������ĿҪ��
 * 
 * @author Administrator
 *
 */
public class reconstructQueue {
	public static int[][] reconstructQueue(int[][] arr) {
		//�������ؽ���kֵ��������
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] == o2[0] ?  o1[1] - o2[1] : o2[0] - o1[0];  
			}
		});
		ArrayList<int[]> res = new ArrayList<int[]>();
        for(int i = 0; i < arr.length; i++){
        	/*�жϲ���������Ƿ����ArrayList��Χ����0 �� size֮�䣬
        	 * size��ArrayListʵ��Ԫ�ظ������������ײ������nullԪ��*/
        	//�мǲ�Ҫ��һ�ξͽ�Ԫ�ز��뵽����Ϊ1��λ�ã���Ϊ��ʱsize��СΪ0���ᷢ���쳣
        	res.add(arr[i][1], arr[i]);//��arr[i]���뵽arr[i][1]λ����
        }
        
		return res.toArray(new int[res.size()][]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{8,0},{4,4},{8,1},{5,0},{6,1},{5,2}};
//		Scanner scanner = new Scanner(System.in);
//		String[][] str = new String[6][2];
//		int[][] arr = new int[6][2];
//		for (int i = 0; i < arr.length; i++) {
//			str[i] = scanner.nextLine().split(",");
//			arr[i][0] = Integer.valueOf(str[i][0]);
//			arr[i][1] = Integer.valueOf(str[i][1]);
//		}

//		System.out.println(arr.length);
		int[][] res = new int[arr.length][2];
		res = reconstructQueue(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i][0] + "," + res[i][1]);
		}
	}

}

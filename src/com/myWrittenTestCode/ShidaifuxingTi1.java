package com.myWrittenTestCode;

import java.util.*;
/**
 * (��ȷ����)
 * ��������:
 *  ��1��Ϊn�����û��ĸ��� ��2��Ϊn����������i�������û����Ϊi���û���ĳ�����µ�ϲ�ö� ��3��Ϊһ��������q�����ѯ������  
 * ��4�е��ڣ�3+q���У�ÿ�а���3������l,r,k����һ���ѯ�������Ϊl<=i<=r���û��ж���������ϲ��ֵΪk���û��ĸ�����
 * ���ݷ�Χn <= 300000,q<=300000 k������
 * ���������
 * һ��q�У�ÿ��һ����������ϲ��ֵΪk���û��ĸ���
 * ��������1:
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 * �������1:
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
    //�����������������ܻ����kֵԽ�磬���߳�ʱ
     public static void main(String[] args) {
	 	// TODO Auto-generated method stub
	 	Scanner scanner = new Scanner(System.in);
	 	int n = scanner.nextInt();//�û���
	 	int[] a = new int[300001];
	 	for (int i = 0; i < n; i++) {
	 		a[i] = scanner.nextInt();//�û���ϲ�ö�
	 	}
	 	int q = scanner.nextInt();//����
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
	 	for (int i = 0; i < res.length; i++) {//������
	 		System.out.println(res[i]);
	 	}
	 }
}

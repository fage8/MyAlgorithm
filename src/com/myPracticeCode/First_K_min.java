package com.myPracticeCode;

public class First_K_min {
	public static void main(String[] args) {
        int[] a = {90, 90, 67, 3, 3, 8, 43, 89, 90, 90};
        System.out.print("ԭ����Ϊ��");
        int k = 4;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        quickSelect(a, 0, a.length - 1, k);
        System.out.print("��"+k+"С��Ԫ��Ϊ");
        System.out.println(a[k - 1]);
        System.out.print("ǰ"+k+"��Ԫ��Ϊ");
        for (int i = 0; i < k; i++) {
			System.out.print(a[i] + " ");
		}
    }

	public static void quickSelect(int[] a, int left, int right, int k) {
        if (right - left <= 1) {
            return;
        }
        int pivot = findPivot(a, left, right);
        int i = left;
        int j = right - 1;
        for (; ; ) {
            while (a[++i] < pivot) {}
            while (a[--j] > pivot) {}
            if(i < j){
                swap(a,i,j);
            }else{break;}
        }
        swap(a,i,right - 1);
        if(i == k){return;}
        else if(i > k){
            quickSelect(a,left,i - 1,k);
        }else{
            quickSelect(a,i + 1,right,k - i + 1);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    //  Ѱ��֧��ķ������������˵���м�λ�õ�����Ԫ�ص��м�Ԫ��ֵ��Ϊ֧��
    //  ˳����leftС��֧��Ԫ��С��right�����Լ���һ�αȽϴ���
    public static int findPivot(int[] a, int left, int right) {
        int mid = (left + right) / 2;
        if (a[left] > a[mid]) {
            swap(a, left, mid);
        }
        if (a[right] < a[mid]) {
            swap(a, right, mid);
        }
        if (a[left] > a[right]) {
            swap(a, left, right);
        }
        //��֧��Ԫ���ƶ������ұ�Ԫ�ص���ߣ��������Լ���һ�αȽϴ���
        swap(a, mid, right - 1);
        return a[right - 1];
    }
}

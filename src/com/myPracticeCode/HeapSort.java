package com.myPracticeCode;

import java.util.Scanner;
/**
 * ������
 * @author Administrator
 *
 */
public class HeapSort {

   public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] string = scanner.nextLine().split(",");
		int[] a = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			a[i] = Integer.valueOf(string[i]);
		}
        heapSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }


    /**
     * �����ѣ�
     * @param arr ��������
     */
    private static void heapSort(int[] arr) {
        //������
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            //�ӵ�һ����Ҷ�ӽ��������ϣ�������������ṹ
            adjustHeap(arr, i, arr.length);
        }

        //�����ѽṹ+�����Ѷ�Ԫ����ĩβԪ��
        for (int i = arr.length - 1; i > 0; i--) {
            //���Ѷ�Ԫ����ĩβԪ�ؽ��н���
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            //���¶Զѽ��е���
            adjustHeap(arr, 0, i);
        }
    }

    /**
     * ������
     * @param arr ��������
     * @param parent ���ڵ�
     * @param length ��������βԪ������
     */
    private static void adjustHeap(int[] arr, int parent, int length) {
        //��temp��Ϊ���ڵ�
        int temp = arr[parent];
        //����
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //�Һ���
            int rChild = lChild + 1;
            // ������Һ��ӽ�㣬�����Һ��ӽ���ֵ�������ӽ�㣬��ѡȡ�Һ��ӽ��
            if (rChild < length && arr[lChild] < arr[rChild]) {
                lChild++;
            }

            // ���������ֵ�Ѿ����ں��ӽ���ֵ����ֱ�ӽ���
            if (temp >= arr[lChild]) {
                break;
            }

            // �Ѻ��ӽ���ֵ���������
            arr[parent] = arr[lChild];

            //ѡȡ���ӽ������ӽ��,��������ɸѡ
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = temp;
    }
}

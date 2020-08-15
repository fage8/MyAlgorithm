package com.myPracticeCode;

import java.util.Arrays;
/**
 * ���������
 * @author Administrator
 *
 */
public class TopK {
    public static void main(String[] args) {
        int[] num = { 2, 20, 3, 7, 9, 1, 17, 18, 0, 4 };
        heapSort(num,3);
        System.out.println(Arrays.toString(num));
    }

    /**
     * ������
     * 
     * @param num
     */
    private static void heapSort(int[] num, int K) {
        for (int i = num.length / 2 - 1; i >= 0; i--) {
            adjustMin(num, i, num.length);// ����0~num.length-1������
        }
        // ���Ҫʵ��topK����������ִ��
        for (int j = num.length - 1; j >= 0 && K > 0; j--,K--) {
            // �������һ��
            swap(num, 0, j);
            // �ٴε���0~j-1������
            adjustMin(num, 0, j);
        }
        //ʹ�����ѣ�K=3�����[9, 7, 3, 2, 4, 1, 0, 17, 18, 20]����������ֵ17,18,20
        //ʹ����С�ѣ�K=3�����[3, 4, 9, 7, 20, 18, 17, 2, 1, 0]����С������ֵ2,1,0
    }

    /**
     * ����ջ�������һ��Ԫ��
     * 
     * @param num
     * @param i
     * @param j
     */
    private static void swap(int[] num, int i, int j) {
        int tem = num[i];
        num[i] = num[j];
        num[j] = tem;
    }

    /**
     * ����Ϊ�󶥶�
     * 
     * @param num
     * @param root_index
     */
    private static void adjust(int[] num, int root_index, int length) {
        //
        int root = num[root_index];
        for (int j = root_index * 2 + 1; j < length; j = j * 2 + 1) {
            // ���Ķ���
            if (j + 1 < length && num[j] < num[j + 1]) {
                j = j + 1;// ָ�������Ķ���
            }
            if (root < num[j]) {
                num[root_index] = num[j];
                root_index = j;// ��ǻ�����һ��λ��
            } else {
                break;// �Ѿ��Ǵ󶥶��ˣ�����Ҫ������
            }
        }
        num[root_index] = root;
    }

    /**
     * С����
     * 
     * @param num
     * @param root_index
     * @param length
     */
    private static void adjustMin(int[] num, int root_index, int length) {
        //
        int rootValue = num[root_index];
        for (int k = root_index * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && num[k] > num[k + 1])
                k = k + 1;// Kָ����С���ӽڵ�
            if (num[k] < rootValue) {
                num[root_index] = num[k];
                root_index = k;// ��k����һ��λ��
            } else {
                break;// ������Ҫ�ٵ�����
            }
        }
        num[root_index] = rootValue;
    }
}

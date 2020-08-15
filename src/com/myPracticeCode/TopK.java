package com.myPracticeCode;

import java.util.Arrays;
/**
 * 输出有问题
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
     * 堆排序
     * 
     * @param num
     */
    private static void heapSort(int[] num, int K) {
        for (int i = num.length / 2 - 1; i >= 0; i--) {
            adjustMin(num, i, num.length);// 调整0~num.length-1的数据
        }
        // 如果要实现topK，就在这里执行
        for (int j = num.length - 1; j >= 0 && K > 0; j--,K--) {
            // 交换最后一个
            swap(num, 0, j);
            // 再次调整0~j-1的数据
            adjustMin(num, 0, j);
        }
        //使用最大堆，K=3，输出[9, 7, 3, 2, 4, 1, 0, 17, 18, 20]，最大的三个值17,18,20
        //使用最小堆，K=3，输出[3, 4, 9, 7, 20, 18, 17, 2, 1, 0]，最小的三个值2,1,0
    }

    /**
     * 交换栈顶和最后一个元素
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
     * 调整为大顶堆
     * 
     * @param num
     * @param root_index
     */
    private static void adjust(int[] num, int root_index, int length) {
        //
        int root = num[root_index];
        for (int j = root_index * 2 + 1; j < length; j = j * 2 + 1) {
            // 最大的儿子
            if (j + 1 < length && num[j] < num[j + 1]) {
                j = j + 1;// 指向了最大的儿子
            }
            if (root < num[j]) {
                num[root_index] = num[j];
                root_index = j;// 标记换了哪一个位置
            } else {
                break;// 已经是大顶堆了，不需要调整了
            }
        }
        num[root_index] = root;
    }

    /**
     * 小顶堆
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
                k = k + 1;// K指向最小的子节点
            if (num[k] < rootValue) {
                num[root_index] = num[k];
                root_index = k;// 和k换了一下位置
            } else {
                break;// 本身不需要再调整了
            }
        }
        num[root_index] = rootValue;
    }
}

package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * ����������λ��ż��λ����(��1��ʼ)����żλ�ý���������ż������
 * @author Administrator
 *
 */
public class QiNiuYunTi1 {

	public static class ListNode {
	    int val;
	    ListNode next;
	    public ListNode(int a) {
			val = a;
		}
	}


    public static ListNode exchangeOddEvenNode (ListNode input) {
        // write code here
        ListNode root = new ListNode(0);
        root.next = input;
        ListNode pre = root;
        ListNode cur = input;
        while(cur!= null && cur.next != null){//ż�����ڵ�����������ڵ���жϽ�ֹ����
            pre.next = cur.next;//0->2
            cur.next = pre.next.next;//1->3
            pre.next.next = cur;//2->1
            pre = cur;//pre���Ƶ�cur��λ��
            cur = cur.next;//cur���Ƶ���һ������
        }
        return root.next;
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(",");
		ListNode head = new ListNode(0);
		ListNode input = head;
		for (int i = 0; i < str.length; i++) {
			ListNode cur = new ListNode(Integer.valueOf(str[i]));
			input.next = cur;
			cur.next = null;
			input = input.next;//input����һλ
		}
		ListNode res = exchangeOddEvenNode(head.next);
		for (; res != null; res = res.next) {
			if (res.next != null) {
				System.out.print(res.val + ",");
			}else {
				System.out.println(res.val);//���һ���ڵ�
			}
		}
 	}
}


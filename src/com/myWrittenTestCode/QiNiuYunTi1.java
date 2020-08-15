package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 把链表奇数位和偶数位交换(从1开始)，奇偶位置交换不是奇偶数交换
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
        while(cur!= null && cur.next != null){//偶数个节点或者奇数个节点的判断截止条件
            pre.next = cur.next;//0->2
            cur.next = pre.next.next;//1->3
            pre.next.next = cur;//2->1
            pre = cur;//pre后移到cur的位置
            cur = cur.next;//cur后移到下一个奇数
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
			input = input.next;//input后移一位
		}
		ListNode res = exchangeOddEvenNode(head.next);
		for (; res != null; res = res.next) {
			if (res.next != null) {
				System.out.print(res.val + ",");
			}else {
				System.out.println(res.val);//最后一个节点
			}
		}
 	}
}


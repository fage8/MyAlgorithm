package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * ����������м�ڵ㣬����м�ڵ������������غ�����Ǹ�
 * 
 * ����
 * 1,2,3,4
 * ���
 * 3
 * @author Administrator
 *
 */
public class GuangliandaTi1 {


	public static class ListNode {
	    String val;
	    ListNode next;
	    ListNode(String x) { val = x; }
	}
	 

    public static ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
			String[] str= scanner.nextLine().split(",");
			ListNode head = new ListNode("");
			ListNode p = head;
			for (int i = 0; i < str.length; i++) {//β�巨��������
				ListNode listNode = new ListNode(str[i]);//�ڵ����ַ�������
				listNode.next = p.next;//����listNode�ڵ� 
				p.next = listNode;
				listNode = listNode.next;//�ڵ����
				p = p.next;
			}
			ListNode node = middleNode(head.next);//head��ͷ�ڵ㣬����ֵ
        	System.out.println(node.val);
        }
	}

}

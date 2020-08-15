package com.myPracticeCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * �ϲ���������Ϊһ����������,���������
 * @author Administrator
 *
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class MergeLinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){//ǰ��������������Ϊ��
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        }else{
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
        // ListNode head = new ListNode(-1);//�����½�һ������ֵ��ͷ�ڵ�
        // ListNode pre = head;//ͷ�巨����ת�������ʹ��β�巨
        // while(l1 != null && l2 != null){
        //     if(l1.val < l2.val){
        //         pre.next = l1;
        //         pre = pre.next;//pre����
        //         l1 = l1.next;//l1����
        //     }else{
        //         pre.next = l2;
        //         pre = pre.next;
        //         l2 = l2.next;
        //     }
        // }
        // if(l1 == null) pre.next = l2;
        // if(l2 == null) pre.next = l1;
        // return head.next;//��Ϊͷ�ڵ㲻��ֵ
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] str1  = sc.nextLine().split(" ");
        String[] str2  = sc.nextLine().split(" ");
        ListNode node1 = null, node2 = null;
        for (int i = 0; i < str1.length; i++) {//ֵ�������뵽����1��
        	node1 = new ListNode(Integer.valueOf(str1[i]));
        	node1 = node1.next;
        }
        for (int i = 0; i < str2.length; i++) {//ֵ�������뵽����2��
			node2 = new ListNode(Integer.valueOf(str2[i]));
			node2 = node2.next;
		}
		ListNode hNode = mergeTwoLists(node1, node2);
		System.out.println(hNode);
	}

}

package com.myPracticeCode;

import java.util.Scanner;

/**
 * ��ת���������������
 * @author Administrator
 *
 */
public class ReverseLinkedList {
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { 
	    	 val = x; 
	     }
	}

    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode preNode = null;
        //ListNode reverseNode = null;
        while(curNode != null){//��ֹ��ָ���쳣
            ListNode nextNode = curNode.next;//������һ���ڵ�
            //reverseNode = curNode;//��ת�����ͷ�ڵ�
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
            // if(nextNode != null){
            //     curNode = nextNode;
            // }else{//nextNodeΪ��ʱ��curNode��Ϊ��תͷ�ڵ㣬���ؽ��
            //     return reverseNode;
            // } 
        }
        return preNode;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] str  = sc.nextLine().split(" ");
        ListNode head = new ListNode(Integer.valueOf(str[0]));
        ListNode node1 = head.next;
        for (int i = 1; i < str.length; i++) {//ֵ�������뵽������
        	node1 = new ListNode(Integer.valueOf(str[i]));
        	node1 = node1.next;
        }

		ListNode hNode = reverseList(head);
		while(hNode != null) {			
			System.out.println(hNode.val);
			hNode = hNode.next;
		}
	}
}

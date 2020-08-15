package com.myPracticeCode;

import java.util.Scanner;

/**
 * 反转单链表，输出有问题
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
        while(curNode != null){//防止空指针异常
            ListNode nextNode = curNode.next;//保存下一个节点
            //reverseNode = curNode;//反转链表的头节点
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
            // if(nextNode != null){
            //     curNode = nextNode;
            // }else{//nextNode为空时，curNode即为反转头节点，返回结果
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
        for (int i = 1; i < str.length; i++) {//值遍历输入到链表中
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

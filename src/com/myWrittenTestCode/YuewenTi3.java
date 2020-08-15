package com.myWrittenTestCode;

import java.util.Scanner;

/**
 * (正确做法)
 * 链表反转
 * 输入
 * 1,2,3,4,5
 * 输出
 * {5,4,3,2,1}
 * @author Administrator
 *
 */
public class YuewenTi3 {

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
       String[] str  = sc.nextLine().split(",");
       ListNode head = new ListNode(0);
       ListNode node = head;
       for (int i = 0; i < str.length; i++) {//头插法建立链表
       		ListNode node1 = new ListNode(Integer.valueOf(str[i]));
       		node.next = node1;
       		node1.next = null;
       		node = node.next;
       }

		ListNode hNode = reverseList(head.next);
		System.out.print("{");
		while(hNode.next != null) {			
			System.out.print(hNode.val + ",");
			hNode = hNode.next;
		}
		System.out.println(hNode.val + "}");
	}

}

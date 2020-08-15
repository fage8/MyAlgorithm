package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (正确做法)
 * 返回链表的中间节点，如果中间节点有两个，返回后面的那个
 * 
 * 输入
 * 1,2,3,4
 * 输出
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
			for (int i = 0; i < str.length; i++) {//尾插法建立链表
				ListNode listNode = new ListNode(str[i]);//节点是字符串类型
				listNode.next = p.next;//插入listNode节点 
				p.next = listNode;
				listNode = listNode.next;//节点后移
				p = p.next;
			}
			ListNode node = middleNode(head.next);//head是头节点，不存值
        	System.out.println(node.val);
        }
	}

}

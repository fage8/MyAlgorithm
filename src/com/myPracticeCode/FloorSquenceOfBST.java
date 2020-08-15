package com.myPracticeCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * �ж����������Ƿ��Ƕ���������,�е�����
 * @author Administrator
 *
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class FloorSquenceOfBST {
	public static boolean isCompleteTree(TreeNode root){
        if(root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = null;
        while(queue.size() != 0){
            node = queue.peek();//��ȡ���е�ͷԪ��
            queue.poll();
//          System.out.println(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return true;
    }

	public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(",");
        Queue<TreeNode> queue=new LinkedList<>();
        if(strings[0].equals("None")){
            System.out.print("True");
            System.exit(0);
        }
        TreeNode head= new TreeNode(Integer.parseInt(strings[0]));//������ڵ�
        //�ٱ���һ������㣬���������ж��Ƿ��Ƕ����������õ�
        TreeNode root=head;
        //��˳����ӽ��
        queue.add(head);
        //�ж�������û�и�ֵ
        boolean flag=false;
        //�ع�����������
        for(int i=1;i<str.length;i++){
	        //��ӽ��
	        TreeNode temp=new TreeNode(Integer.parseInt(strings[i]));
	        queue.add(temp);
	        //���û�и����㸳ֵ��������㸳ֵ
		    if(!flag){
		        head.left=temp;
		        flag=true;
		    }
	        //������㸳ֵ������ҽ�㸳ֵ
	        else{
	           head.right=temp;
	           //���ҽ�㶼��ֵ���ˣ�������
	           queue.poll();
	           //������һ���µĽ������ֵ���ҽ�㣬�����˳����
	           head=queue.peek();
	           flag=false;
	       }
        }
        boolean ok = isCompleteTree(root);
        System.out.println(ok);
    }
}

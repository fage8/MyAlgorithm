package com.myPracticeCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * 判断满二叉树是否是二叉排序树,有点问题
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
            node = queue.peek();//获取队列的头元素
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
        TreeNode head= new TreeNode(Integer.parseInt(strings[0]));//定义根节点
        //再保存一个根结点，后面用来判断是否是二叉搜索树用到
        TreeNode root=head;
        //按顺序添加结点
        queue.add(head);
        //判断左结点有没有赋值
        boolean flag=false;
        //重构二叉树代码
        for(int i=1;i<str.length;i++){
	        //添加结点
	        TreeNode temp=new TreeNode(Integer.parseInt(strings[i]));
	        queue.add(temp);
	        //如果没有给左结点赋值，则给左结点赋值
		    if(!flag){
		        head.left=temp;
		        flag=true;
		    }
	        //如果左结点赋值，则给右结点赋值
	        else{
	           head.right=temp;
	           //左、右结点都赋值完了，出队列
	           queue.poll();
	           //重新找一个新的结点来赋值左、右结点，按入队顺序来
	           head=queue.peek();
	           flag=false;
	       }
        }
        boolean ok = isCompleteTree(root);
        System.out.println(ok);
    }
}

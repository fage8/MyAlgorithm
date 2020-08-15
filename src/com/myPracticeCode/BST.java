package com.myPracticeCode;
import java.util.*;

/**
 * �ж����������Ƿ��Ƕ���������
 * �����Ƕ��������˳��
 * @author Administrator
 *
 */
//���������
class BTreeNode{
    int val;
    BTreeNode left;
    BTreeNode right;
    BTreeNode(int val){
        this.val=val;
    }
}
public class BST{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       //����˳��������㣬�������������ҽ�㻹û��ֵ ������õ�
        Queue<BTreeNode> queue=new LinkedList<>();
        String [] str=sc.nextLine().split(",");
                //���������ս��ʱ������None
                //�ж��Ƿ�ΪNone������Ҳ�Ƕ���������
        if(str[0].equals("None")){
            System.out.print("True");
            System.exit(0);
        }
                //��������
        BTreeNode head=new BTreeNode(Integer.parseInt(str[0]));
        //�ٱ���һ������㣬���������ж��Ƿ��Ƕ����������õ�
                BTreeNode root=head;
                //��˳����ӽ��
        queue.add(head);
                //�ж�������û�и�ֵ
        boolean flag=false;
                //�ع�����������
        for(int i=1;i<str.length;i++){
                        //��ӽ��
            BTreeNode temp=new BTreeNode(Integer.parseInt(str[i]));
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
        //�ҳ������������ֵ
        int max=GetMaxLeft(root.left);
                //�ҵ�����������Сֵ
        int min=GetMinRight(root.right);
 
                     
                //������������ֵ��ҪС�ڸ�����ֵ�������ҳ����ֵ���ж�
                //������������ֵ��Ҫ���ڸ�����ֵ�������ҳ���Сֵ���ж�
        //���������������������ֱ�����False,���涼�����ж϶�����������
                //���ҳ���ֵֻ��ͨ��90%
                if(root.val<max||root.val>min){
            System.out.print("False");
        }
                //�ж��Ƿ��Ƕ���������
        else if(check(root)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
    //�������������ֵ�ķ���
    public static int GetMaxLeft(BTreeNode left){
        int max=left.val;
        LinkedList<BTreeNode> list=new LinkedList<>();
        list.add(left);
        while(list.size()>0){
            BTreeNode node=list.poll();
            if(node.val>max){max=node.val;}
            if(node.left!=null){
                list.add(node.left);
            }
            if(node.right!=null){
                list.add(node.right);
            }
        }
        return max;
    }
    //������������Сֵ�ķ���
     public static int GetMinRight(BTreeNode right){
        int min=right.val;
        LinkedList<BTreeNode> list=new LinkedList<>();
        list.add(right);
        while(list.size()>0){
            BTreeNode node=list.poll();
            if(node.val>min){min=node.val;}
            if(node.left!=null){
                list.add(node.left);
            }
            if(node.right!=null){
                list.add(node.right);
            }
        }
        return min;
    }
    //�ж϶����������ķ���
        //�ݹ�
    public static boolean check(BTreeNode root){
     //�ݹ��������
          if(root.left==null&&root.right==null) return true;
     else if((root.left.val<root.val)&&(root.right.val>root.val)){
                return check(root.left)&&check(root.right);
            }
        else {
            return false;
        }
    }
}
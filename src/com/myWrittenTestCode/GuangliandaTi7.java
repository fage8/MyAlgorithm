package com.myWrittenTestCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 二叉树每个节点都存放一个整数值
 * 找出路径和等于给定数值的路径总数
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能是从父节点到子节点）
 * 输入：
 * root=[10,5,-3,3,2,null,11,3,-2,null,1],sum = 8
 *        10
 *       5  -3
 *     3  2    11
 *   3  -2  1  
 * 输出：
 * 3
 * 解释：
 * 和等于8的路径有：5->3,5->2->1,-3->11
 * @author Administrator
 *
 */
public class GuangliandaTi7 {
	public static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum, new ArrayList<>(), 0);
        return res;
    }
    
    public static void dfs(TreeNode root, int sum, List<Integer>path, int curSum) {
        if(root == null) return;
        path.add(root.val);
        curSum += root.val;
        if(root.left == null && root.right == null && curSum == sum){
            res.add(new ArrayList<>(path));
        } else{
            dfs(root.left, sum, path, curSum);
            dfs(root.right, sum, path, curSum);
        }
        path.remove(path.size()-1);
        curSum -= root.val;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
			String[] str= scanner.nextLine().split(",");
			int[] arr = new int[str.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.valueOf(str[i]);
			}
			int sum = scanner.nextInt();
			ArrayList<Integer> root = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				root.add(arr[i]);
			}
			List<List<Integer>> res = pathSum(root, sum);
        }
	}

}

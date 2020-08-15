//package com.zhaoshangyinghang;
//
//import java.text.DateFormatSymbols;
//import java.util.Vector;
//
//import org.omg.CORBA.PUBLIC_MEMBER;
//
//public class Zhaoshangyinghang_2 {
//	public Vector<String> generateParenthesis(int n) {
//		this.n = n;
//		Vector<String> ret;
//		dfs(0, 0, 0, "", ret);
//		return ret;
//	}
//	private int n;
//	private void dfs(int x, int l, int r, String str, Vector<String> &ret) {
//		if (x == 2 * n) {
//			ret.push_back(str);//向量ret尾部增加一个元素str
//			return;
//		}
//		if (l < n) {
//			dfs(x + 1, l + 1, r, str + "(", ret);
//		}
//		if (r < n && l > r) {
//			dfs(x + 1, l, r + 1, str + ")", ret);
//		}
//	}
//}

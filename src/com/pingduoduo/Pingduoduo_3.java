package com.pingduoduo;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Pingduoduo_3 {
	public static String slice(int offset, int count, int a, int b) {
		int startA = Math.min(a, Math.max(0, offset));
		int endA = Math.max(0, Math.min(a, offset + count));
		int startB = Math.min(b, Math.max(0, offset - a));
		int endB = Math.max(0, Math.min(b, offset + count - a));
		return startA + " " + endA + " " + startB + " " + endB;
	}
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			System.out.print(slice(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));
		}
	}
}

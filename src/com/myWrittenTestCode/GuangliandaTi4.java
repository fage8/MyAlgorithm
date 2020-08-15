package com.myWrittenTestCode;

import java.util.Arrays;

/**
 * (正确做法)
 * 假设某宾馆开辟出8个隔离房间连成一排，每间房不是有人住就是空着。
 * 每天，无论房间是被占用或空置，都会根据以下规则进行更改：
 * 1.如果一间房的两个相邻的房间都被占用或都是空的，那么该房间就会被占用。
 * 2.否则，它就会被空置。
 * （请注意，由于宾馆中的房间排成一行，所以行中的第一个和最后一个房间无法有两个相邻的房间）
 * 如果第i间房被占用，则rooms[i]==1,否则rooms[i]==0
 * 根据房间的初始状态，在N天后入住隔离房间的状况
 * 输入：
 * rooms=[0,1,0,1,1,0,0,1],N = 7
 * 输出：
 * [0,0,1,1,0,0,0,0]
 * 隔离房间每天的状况：
 * Day 0：[0,1,0,1,1,0,0,1]
 * Day 1：[0,1,1,0,0,0,0,0]
 * Day 2：[0,0,0,0,1,1,1,0]
 * Day 3：[0,1,1,0,0,1,0,0]
 * Day 4：[0,0,0,0,0,1,0,0]
 * Day 5：[0,1,1,1,0,1,0,0]
 * Day 6：[0,0,1,0,1,1,0,0]
 * Day 7：[0,1,1,1,0,0,0,0]
 * 输入：
 * rooms=[1,0,0,1,0,0,1,0],N = 1000000000
 * 输出：
 * [0,0,1,1,1,1,1,0]
 * @author Administrator
 *
 */
public class GuangliandaTi4 {
	public static int[] stateAfterNdays(int[] state, int N) {
		int[] newState = new int[state.length];
		N %= 255;
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < state.length - 1; j++) {
				if (state[j - 1] == state[j + 1]) {
					newState[j] = 1;
				}
			}
			state = Arrays.copyOf(newState, newState.length);
			Arrays.fill(newState, 0);
		}
		return state;
		
	}
	public static void main(String[] args) {
//		int[] initState = {1,0,0,1,0,0,1,0};
		int[] initState = {0,1,0,1,1,0,0,1};
		int N = 7;
		int[] state = stateAfterNdays(initState, N);
		for (int i = 0; i < state.length - 1; i++) {
			System.out.print(state[i] + ",");
		}
		System.out.println(state[state.length - 1]);
	}

}

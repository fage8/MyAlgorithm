package com.myWrittenTestCode;

import java.util.Arrays;

/**
 * (��ȷ����)
 * ����ĳ���ݿ��ٳ�8�����뷿������һ�ţ�ÿ�䷿��������ס���ǿ��š�
 * ÿ�죬���۷����Ǳ�ռ�û���ã�����������¹�����и��ģ�
 * 1.���һ�䷿���������ڵķ��䶼��ռ�û��ǿյģ���ô�÷���ͻᱻռ�á�
 * 2.�������ͻᱻ���á�
 * ����ע�⣬���ڱ����еķ����ų�һ�У��������еĵ�һ�������һ�������޷����������ڵķ��䣩
 * �����i�䷿��ռ�ã���rooms[i]==1,����rooms[i]==0
 * ���ݷ���ĳ�ʼ״̬����N�����ס���뷿���״��
 * ���룺
 * rooms=[0,1,0,1,1,0,0,1],N = 7
 * �����
 * [0,0,1,1,0,0,0,0]
 * ���뷿��ÿ���״����
 * Day 0��[0,1,0,1,1,0,0,1]
 * Day 1��[0,1,1,0,0,0,0,0]
 * Day 2��[0,0,0,0,1,1,1,0]
 * Day 3��[0,1,1,0,0,1,0,0]
 * Day 4��[0,0,0,0,0,1,0,0]
 * Day 5��[0,1,1,1,0,1,0,0]
 * Day 6��[0,0,1,0,1,1,0,0]
 * Day 7��[0,1,1,1,0,0,0,0]
 * ���룺
 * rooms=[1,0,0,1,0,0,1,0],N = 1000000000
 * �����
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

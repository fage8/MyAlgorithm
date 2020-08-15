package com.myWrittenTestCode;


import java.util.Scanner;
/**
 * 魔塔中共有n只怪物，每只怪物有两个属性，破防能力和伤害值，当勇者挑战一只怪物时，若
 * ·勇者的防御力大于其破防能力，勇者不受伤害。
 * ·否则勇者受到等同于其伤害值的伤害。
 * 初始时勇者的防御力为D，勇者可以按照任意顺序挑战这n只怪物，每次挑战成功一只后可以获得防御力提升1点的奖励。
 * 击败这n只怪物最少需要承受多少伤害。
 * 
 * 输入
 * 第一行n D(1<=n<=5000,1<=D,Ai,Bi<=5000)
 * 第二行n个正整数Ai(代表第i只怪物的破防能力)
 * 第三行n个正整数Bi(代表第i只怪物的伤害值)
 * 输出最少承受伤害量
 * 
 * 输入
 * 3 50
 * 100 50 51
 * 1000 1000 1000
 * 输出
 * 1000
 * @author Administrator
 *
 */
public class WangyiTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int fangyu = sc.nextInt();
			int count = 0;
			int[] gongjili = new int[n];
			int[] shanghai = new int[n];
			for (int i = 0; i < n; i++) {
				gongjili[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				shanghai[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (fangyu >= gongjili[i]) {
					fangyu++;
				}else {
					count += shanghai[i];
				}
			}
			System.out.println(count);
		}
	}

}

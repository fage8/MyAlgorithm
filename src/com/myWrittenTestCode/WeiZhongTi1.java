package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * (��ȷ����)
 * n������m�����Ҫ���������:
 * (1)���Ի�aԪ�ͺ������һλ���ѣ�
 * (2)��bԪ����һ��������ֲ������Ի�����.
 * Ҫ��������������ѵ���С����
 * 
 * ��һ�������ĸ�����n,m,a,b
 * ������ٻ���
 * ����
 * 7 5 10 100
 * 20
 * ����
 * 2 4 10 10
 * 0
 * ����
 * 4 6 10 12
 * 10
 * @author Administrator
 *
 */
public class WeiZhongTi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
	        int n = scanner.nextInt();
	        int m = scanner.nextInt();
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int res = 0;
	        if (n>=1 && n <=100 && m>=1 && m<=100 && a>=1 && a<=100 && b>=1 && b<=100) {
	        	if (n>m) {
	        		int j = n - m;
	        		if (a<b) {
	        			res = a*j;
	        		}else {
	        			res = b*j;
	        		}
	        	}else if (m % n != 0 && n < m) {//����ƽ��ʱ��,��ʱ�����������
//					int yu = m % n;
//					int shang = m/n;
//					int liwu = ((shang+1)*n-m) * b;
//					int count = 0, t =n;
//					while(m % t != 0) {
//						t--;
//						count++;
//					}
//					int hongbao = count * a;
//					if (liwu < hongbao) {//����û�п��ǻ�ϵ������Ҳ����ac
//						res = liwu;
//					}else {
//						res = hongbao;
//					}


    		        // �г����Թ滮����
    		        // n���ܿ������� m����������
    		        // x���뿪�����ˣ�y����������k��Ŀ���ǣ�����������ȫ���֣�k��������Ȼ��
    		        // ����1��k * (n - x) = m + y
    		        // ����2��minCost = x * a + y * b������ʹminCost��С�� x �� y��
    		        int r = Integer.MAX_VALUE;
    		 
    		        // redPacketNum����������������ֻ��Ҫ�� n-1 �����
    		        for (int redPacketNum = 0; redPacketNum < n; redPacketNum++) {
    		            // ������� redPacketNum �����ʱ����Ҫ��������� buyGiftNum
    		            if (m % (n - redPacketNum) == 0) {
    		                r = Math.min(r , redPacketNum * a);
    		            } else {
    		                int buyGiftNum = (m / (n - redPacketNum) + 1) * (n - redPacketNum) - m;
    		                r = Math.min(r , redPacketNum * a + buyGiftNum * b);
    		            }
    		        }
    		        res = r;
				}
			}
				
	        System.out.println(res);
        }
    }
}

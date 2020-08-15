package com.myWrittenTestCode;

import java.util.Scanner;
/**
 * 不含有重复字符的最长子串的长度
 * @author Administrator
 *
 */
public class WeibaoTi1 {
	//做法二
//	public static int lengthOfLongestSubstring(String s) {
//        if(s.length() < 1) return 0;
//        int maxLen = 1;
//        for(int head = 0, tail = 1; tail < s.length(); tail++){
//            char c = s.charAt(tail);
//            int index = s.indexOf(c, head);
//            if(index < tail){//说明c在tail之前有重复的,更新head
//                head = head + (index - head + 1);
//            }
//            int curLength = tail - head + 1;//不重复子串的长度
//            if(curLength > maxLen){
//                maxLen = curLength;
//            }
//        }
//        return maxLen;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
        	String s = scanner.nextLine();
        	int i = 0, j = 0;       
            int length = s.length();       
            int maxLen = 0;        
            boolean[] exits = new boolean[256];//128个字符，256个字节
            while(j < length)       
            {            
                if(exits[s.charAt(j)])            
                {                
                    maxLen = Math.max(maxLen,j-i);                
                    while(s.charAt(i) != s.charAt(j))                
                    {                    
                        exits[s.charAt(i)] = false;                    
                        i++;                
                    }                
                    i++;                
                    j++;            
                }            
                else            
                {                
                    exits[s.charAt(j)] = true;                
                    j++;            
                }        
            }        
            maxLen = Math.max(maxLen, j-i);        
        	System.out.println(maxLen);
        }
	}

}

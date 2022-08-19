package com.toquocbao.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static int romanToInt(String s) {
		Integer result = 0;
		Map<String, Integer> valueMap = new HashMap<>();
		valueMap.put("I", 1);
		valueMap.put("V", 5);
		valueMap.put("X", 10);
		valueMap.put("L", 50);
		valueMap.put("C", 100);
		valueMap.put("D", 500);
		valueMap.put("M", 1000);
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (s.contains(String.valueOf(ch[i]))) {
				int j = i + 1;
				if (String.valueOf(ch[i]).equals("I") && j < ch.length) {
					if (String.valueOf(ch[j]).equals("V") || String.valueOf(ch[j]).equals("X")) {
						result += - valueMap.get(String.valueOf(ch[i])) + valueMap.get(String.valueOf(ch[++i]));
					} else {
						result += valueMap.get(String.valueOf(ch[i]));
					}
				} else if(String.valueOf(ch[i]).equals("X")) {
					if (String.valueOf(ch[j]).equals("L") || String.valueOf(ch[j]).equals("C") ) {
						result += - valueMap.get(String.valueOf(ch[i])) + valueMap.get(String.valueOf(ch[++i]));
					} else {
						result += valueMap.get(String.valueOf(ch[i]));
					}
				} else if (String.valueOf(ch[i]).equals("C")) {
					if (String.valueOf(ch[j]).equals("D") || String.valueOf(ch[j]).equals("M") ) {
						result += - valueMap.get(String.valueOf(ch[i])) + valueMap.get(String.valueOf(ch[++i]));
					} else {
						result += valueMap.get(String.valueOf(ch[i]));
					}
				} else {
					result += valueMap.get(String.valueOf(ch[i]));
				}
				
			}	
		}
		return (int) result;
	}
	public static int romanToIntFollow(String s) {
		 int ans = 0, num = 0;
		    for (int i = s.length()-1; i >= 0; i--) {
		   switch(s.charAt(i)) {
		      case 'I': num = 1; break;
		      case 'V': num = 5; break;
		      case 'X': num = 10; break;
		      case 'L': num = 50; break;
		      case 'C': num = 100; break;
		      case 'D': num = 500; break;
		      case 'M': num = 1000; break;
		}
		     if (4 * num < ans) ans -= num;
		     else ans += num;
		}
		     return ans;
	}

	public static void main(String[] args) {
		System.out.println(romanToIntFollow("MCMXCIV"));
	}

}

package com.toquocbao.leetcode;

public class ReverseStringBase {
	public static String reverseStringBase(String str) {
		StringBuilder result = new StringBuilder();
		String[] strTemp = str.split("");
		for(int i = 0; i < strTemp.length;i++) {
			if (strTemp[i].contains(strTemp[i].toUpperCase())) {
				result.append(strTemp[i].toLowerCase());
			}else {
				result.append(strTemp[i].toUpperCase());
			}
		}
		
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println("A".contains("A"));
		System.out.println(reverseStringBase("uorVxMTCKlDxbcWW"));
	}

}

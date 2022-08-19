package com.toquocbao.leetcode;

public class DetectCapitalUse {
	public static boolean detectCapitalUse(String word) {
		
		if(word.length() < 2) return true;
		if(word.toUpperCase().equals(word)) return true;
		if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(detectCapitalUse("leetcode"));
	}
}

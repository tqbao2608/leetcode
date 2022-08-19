package com.toquocbao.leetcode;

import java.util.Arrays;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
		if (s.length() == 0)
			return 0;
		int result = 0;
		for (int i = s.length(); i > 0; i--) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			if (s.charAt(i) != ' ') {
				result++;
				continue;
			}
			break;
		}

		return result;
	}

	public static int lengthFollow(String s) {
		s = s.trim();
		int p = s.lastIndexOf(' ');
		return s.length() - p - 1;
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        for (int i = 0; i < n; i++) {
	        	nums1[m+i] = nums2[i];	
	        }
	        Arrays.sort(nums1);
	        for (int i = 0; i < nums1.length; i++) {
				System.out.println(nums1[i]);
				
			}
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {3,4,5};
		merge(nums1, 3, nums2,3);
	}
}

package com.toquocbao.leetcode;

public class NextGreaterElement {
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];

		for(int i = 0; i < nums1.length; i++) {
			int greaterIdx = -1, j = nums2.length - 1;
			while(j >= 0 && nums2[j] != nums1[i]) {
				if(nums2[j] > nums1[i]){
					greaterIdx = nums2[j];
				}
				j--;
			}
			ans[i] = greaterIdx;
		}
		return ans;

    }

	
	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int [] result =  nextGreaterElement(nums1, nums2);
		for(int i = 0; i < result.length ;i++) {
			System.out.println(result[i]);
		}
	}

}

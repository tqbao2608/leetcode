package com.toquocbao.leetcode;

public class NumArray {
	 static int[] nums = {-2, 0, 3, -5, 2, -1 };

	public NumArray(int[] nums) {
	    for(int i = 1; i < nums.length; i++)
	        nums[i] += nums[i-1];
	    
	    this.nums = nums;
	}

	public  int sumRange(int i, int j) {
	    if(i == 0)
	        return nums[j];
	    
	    return nums[j] - nums[i - 1];
	}

	public static void main(String[] args) {
		NumArray array = new NumArray(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println(array.sumRange(2, 5));
	}

}

package com.toquocbao.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class isPowerOfTwo {

	public static boolean isTwo(int n) {
		if(n == 1) return true;
		for(;n % 2 == 0 && n > 0; n /= 2) {
			if(Math.sqrt(n) == 2 || n == 2) return true;
		}
		return false;
	}
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 Set<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(i > k)
	            	set.remove(nums[i-k-1]); 
	            if(!set.add(nums[i]))
	            	return true; 
	        }
	        return false;
	 }
	 public static boolean containsNearbyDuplicateMap(int[] nums, int k) {
		 if (nums == null || nums.length < 2) return false;
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(nums[i])) {
	                if (i - map.get(nums[i]) <= k) return true;
	            }
	            map.put(nums[i], i);
	        }
	        return false;
	 }
	 
	 
	
	public static void main(String[] args) {
		//System.out.println(isTwo(2));
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
}

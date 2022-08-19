package com.toquocbao.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindLHS {
	public static int findLHS(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = 0;
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			if (map.containsKey(i + 1)) {
				result = Math.max(result, map.get(i) + map.get(i + 1));
			}
			if (map.containsKey(i - 1)) {
				result = Math.max(result, map.get(i) + map.get(i - 1));
				
			}
		}
		/*for(int i: map.keySet()) {
			if(map.containsKey(i +1)) {
				result = Math.max(result, map.get(i) + map.get(i + 1));
			}
		}*/
        
		return result;
    }
	public static void main(String[] args) {
		
	}
}

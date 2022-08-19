package com.toquocbao.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestClassStatic {
	
	    public static void main(String args[]) {
	        // init map
	        Map<Integer, String> map = new HashMap<Integer, String>();
	        map.put(100, "A");
	        map.put(101, "B");
	        map.put(102, "C");
	        map.put(100, "D");
	        // show map
	        Set<Integer> set = map.keySet();
	        for (Integer key : set) {
	            System.out.println(key + " " + map.get(key));
	        }
	    }
	
}

package com.toquocbao.leetcode;

public class FindPoisonedDuration {
	
	public int findPoisonedDuration(int[] timeSeries, int duration) {	
		if (timeSeries.length == 0) return 0;	
		int total = 0;
        for(int i = 0;  i < timeSeries.length -  1;++i) {
        	total += Math.min(timeSeries[i+1]-timeSeries[i], duration);
        }
		return total + duration;
    }
	/* public int findPoisonedDuration(int[] timeSeries, int duration) {
	        if (timeSeries.length == 0) return 0;
	        int begin = timeSeries[0], total = 0;
	        for (int t : timeSeries) {
	            total = total + (t < begin + duration ? t - begin : duration);
	            begin = t;
	        }   
	        return total + duration;
	    } */
	public static void main(String[] args) {
		
	}
}

package com.toquocbao.leetcode;

public class NumberOfPrefixes {
	
	public static int[] numberOfPrefixes(String[] arr1, String[] arr2) {
		int[] result = new int[arr2.length];
		for(int i = 0; i < arr2.length; i++) {
			int temp = 0;
			for(int j = 0; j < arr1.length; j++) {
				if(arr1[j].startsWith(arr2[i])) {
					temp++;
				}
			}
			result[i] = temp;
		}
		return result;
	}

	public static void main(String[] args) {
		String[] arr1 = {"fpt", "fsoft", "ftel", "fville1", "fville2"}, arr2 = {"f", "fv", "ft"};
		numberOfPrefixes(arr1, arr2);
		for(int i = 0; i < numberOfPrefixes(arr1, arr2).length; i++) {
			System.out.println(numberOfPrefixes(arr1, arr2)[i]);
		}
	}
}

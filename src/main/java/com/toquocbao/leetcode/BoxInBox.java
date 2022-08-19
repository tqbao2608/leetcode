package com.toquocbao.leetcode;

public class BoxInBox {

	public static boolean boxInBox(int[] arr1, int[] ar2) {
		int tempArr1 = 0;
		int tempArr2 = 0;
		for(int i = 0; i < arr1.length ; i++) {
			if(arr1[0]  > ar2[0]) {
				if (arr1[i] < ar2[i]) 	return false;
			} else {
				if(arr1[i] > ar2[i]) return false;	
			}
			
			tempArr1  += arr1[i];
			tempArr2  += ar2[i];
			
		}
		if(Math.abs(tempArr1-tempArr2) >= 3) return true;
		return false;
	}
	public static void main(String[] args) {
		int[] arr1 = {8,1,1}, arr2 = {1,2,3};
		System.out.println(boxInBox(arr1, arr2));
	}
}

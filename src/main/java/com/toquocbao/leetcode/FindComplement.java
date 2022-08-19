package com.toquocbao.leetcode;

public class FindComplement {

	public static int findComplement(int num) {
		int i = 0;
		int j = 0;

		while (i < num) {
			i += Math.pow(2, j);
			j++;
		}
		//100110, its complement is 011001, the sum is 111111. So we only need get the min number large or equal to num, then do substraction
		return i - num;
	}

	public static void main(String[] args) {
		System.out.println(findComplement(3));
	}

}

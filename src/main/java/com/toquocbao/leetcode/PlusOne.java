package com.toquocbao.leetcode;

import java.util.Arrays;

public class PlusOne {

	public static int totalArray(int[] digits) {

		int temp = 0;
		for (int i = 0; i < digits.length; i++) {
			if (i + 1 == digits.length) {
				temp += digits[i] + 1;
			} else {
				temp += digits[i]*Math.pow(10, digits.length - i - 1);
			}
		}

		return temp;
	}

	public static int[] plusOne(int[] digits) {

		int toltal = totalArray(digits);
		int lengthArray = digits.length;
		if (toltal % 10 == 0)
			lengthArray += 1;
		int[] result = new int[lengthArray];
		int i = 1;
		while (toltal > 0) {
			result[lengthArray-i] = toltal % 10;
			i++;
			toltal = toltal / 10;
		}
		return result;
	}
	
	public static int[] plusOneFollow(int[] digits) {
		for (int i=digits.length-1; i>=0; i--) {
            digits[i] = (++digits[i])%10;
            if (digits[i] != 0) return digits;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }

	public static void main(String[] args) {
		int[] digits = {1,2,3};
		System.out.println(Arrays.toString(plusOneFollow(digits)));
	}
}
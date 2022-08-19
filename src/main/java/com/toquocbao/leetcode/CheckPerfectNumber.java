package com.toquocbao.leetcode;

public class CheckPerfectNumber {
	public static boolean checkPerfectNumber(int num) {
        int temp = 1;
        for(int i = 2 ; i <= (int) Math.sqrt(num);i++) {
        	if(num % i == 0)
        		temp += i + num/i ;
    	  
		}
        return temp == num;
    }
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));
		System.out.println("check perfect number");
	}
}

package com.toquocbao.leetcode;

public class LicenseKeyFormatting {
	
	public static String licenseKeyFormatting(String s, int k) {
		 StringBuilder sb = new StringBuilder();
	        for (int i = s.length() - 1; i >= 0; i--)
	            if (s.charAt(i) != '-')
	                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
	        return sb.reverse().toString().toUpperCase();
    }
	
	public static void main(String[] args) {
		String s = "5F3Z-2e-9-w";
		
		System.out.println(licenseKeyFormatting(s, 4));
	}

}

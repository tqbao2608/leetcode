package com.toquocbao.leetcode;

public class CheckRecord {
	
	public static boolean checkRecord(String s) {
		if(s.contains("LLL")) return false;
		String temp = s.replaceAll("A", "");
		if(s.length() - temp.length() > 1) return false;
		return true;
		// can use matches
	}
	public static boolean checkRecord1(String s) {
		 int countA=0;
	        int continuosL = 0;
	        int charA = 'A';
	        int charL ='L';
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i) == charA){
	                countA++;
	                continuosL = 0;
	            }
	            else if(s.charAt(i) == charL){
	                continuosL++;
	            }
	            else{
	                continuosL = 0;
	            }
	            if(countA >1 || continuosL > 2 ){
	                return false;
	            }
	        }
	        return true;
	}
	public static void main(String[] args) {
		System.out.println(checkRecord1("LLAPPP"));
	}
}

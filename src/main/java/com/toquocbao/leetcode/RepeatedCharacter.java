package com.toquocbao.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {
	
	 public static char repeatedCharacter(String s) {
		 Set<Character> set = new HashSet();
	        for (char c : s.toCharArray())  
	            if (!set.add(c)) 
	                return c;
					
	        return 'a';
	    }
	 public static  String greatestLetter(String s) {
		 /*Set<String> set = new HashSet();
		 for(String st : s.split("")) {
			 if (!set.add(st) && !set.contains(st.toUpperCase())) {
				return st;
			}
		 }
	        
		 return "r";*/
		 /*char c='z', C='Z';
		    
		    for(int i=0; i<26; i++){
		        // check if both upper and lowercase of the character exist  
		        // if it does return the character else decrement the character
		        // by one
		        if(s.indexOf(c)!=-1 && s.indexOf(C)!=-1)
		            return ""+C;
		        else{
		            c--;
		            C--;
		        }
		    }
		    
		    return "";*/
		 for(char i='Z'; i>='A'; i--){ 
	            if(s.indexOf(i)!=-1 && s.indexOf(i+32)!=-1){ return i+""; } 
	        }
	        return "";
		    
	    }
	 

	public static void main(String[] args) {
	System.out.println(repeatedCharacter("abccbaacz"));
	System.out.println(greatestLetter("lEeTcOdE"));
	}

}

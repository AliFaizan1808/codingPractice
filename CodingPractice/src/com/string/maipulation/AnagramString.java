package com.string.maipulation;

public class AnagramString {
	
	/*
	 * Write a java program to check whether two given strings are anagram. If two
	 * strings contain same set of characters but in different order then the two
	 * strings are called anagram.
	 */
	
	public static void main(String[] args) {
		
        String one = "own";
        String two = "nowa";
        
        boolean anagramFlag = true;
        for(int i = 0 ; i< two.length() ; i++) {
        	if(one.indexOf(two.charAt(i)) < 0) {
        		anagramFlag = false;
        	}
        }
        
        if(anagramFlag) {
        	System.out.println("Both the string are anagram");
        }else {
        	System.out.println("Both string are not anagram to each other.");
        }
        
	}

}

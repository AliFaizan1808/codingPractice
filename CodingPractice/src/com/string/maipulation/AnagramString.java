package com.string.maipulation;

public class AnagramString {
	
	/*
	 * Write a java program to check whether two given strings are anagram. If two
	 * strings contain same set of characters but in different order then the two
	 * strings are called anagram.
	 */
	
	public static void main(String[] args) {
		
        String name = "NADAN";
        char[] charArray = name.toCharArray();
        
        //way 1 :
        StringBuilder sb = new StringBuilder(name);
        StringBuilder reverseSb = sb.reverse();
        
        if(name.equalsIgnoreCase(reverseSb.toString())) {
        	System.out.println("String is Anagram");
        }else {
        	System.out.println("String is not an Anagram");
        }
       
        //way 2 :
        String reverseName = "";
        for(int i = charArray.length-1 ; i>=0; i--) {
        	reverseName+=charArray[i];
        }
        
        if(name.equalsIgnoreCase(reverseName)) {
        	System.out.println("String is Anagram");
        }else {
        	System.out.println("String is not an Anagram");
        }
        
        
        
	}

}

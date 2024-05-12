package com.string.maipulation;

public class PalindromString {

	/*
	 * A Palindrome is a word , phrase , number or other sequence of symbols or
	 * elements , whose meaning may be interpreted as the same way in eother forward
	 * direction or in reverse direction .
	 */	
	
	public static void main(String[] args) {
		String name = "NADAN";
        char[] charArray = name.toCharArray();
        
        //way 1 :
        StringBuilder sb = new StringBuilder(name);
        StringBuilder reverseSb = sb.reverse();
        
        if(name.equalsIgnoreCase(reverseSb.toString())) {
        	System.out.println("String is Palindrom");
        }else {
        	System.out.println("String is not an Palindrom");
        }
       
        //way 2 :
        String reverseName = "";
        for(int i = charArray.length-1 ; i>=0; i--) {
        	reverseName+=charArray[i];
        }
        
        if(name.equalsIgnoreCase(reverseName)) {
        	System.out.println("String is Palindrom");
        }else {
        	System.out.println("String is not an Palindrom");
        }
        

	}

}

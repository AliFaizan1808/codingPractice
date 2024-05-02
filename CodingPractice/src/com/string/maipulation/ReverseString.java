package com.string.maipulation;

public class ReverseString {
	
	public static void main(String[] args) {
		
		// Q- How to reverse a String in java?
		
		String name = "Faizan Ali";
		
		//1st way
		StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);
        
        
        //2nd way
        String [] strArray = name.split("");
        String reverseString = "";
        for(int i = strArray.length -1 ; i>=0 ; i--) {
        	reverseString = reverseString + strArray[i];
        }
        System.out.println(reverseString);
        
        
        //3rd way
        char[] c = name.toCharArray();
        String reverse = "";
        for(int i = c.length -1 ; i>=0 ; i--) {
        	reverse = reverse + c[i];
        }
        System.out.println(reverse);
        
        
        //4th way
        String reverseString2 = "";
        for(int i = name.length()-1 ; i>=0 ; i--) {
        	reverseString2 = reverseString2 + name.charAt(i);
        }
        System.out.println(reverseString2);
        
        
	}

}

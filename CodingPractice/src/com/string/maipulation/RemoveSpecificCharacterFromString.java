package com.string.maipulation;

public class RemoveSpecificCharacterFromString {

	/*
	 * If the original string is "Alive is awesome" and the user inputs string to
	 * remove "alwsr" then it should print "ive i eome" as output .
	 */	
	
	public static void main(String[] args) {
		
		String line = "Alive is awesome";
		
	    char[] charToRemove = {'a', 'l' , 'w', 's', 'r'};
	    
	    line = line.toLowerCase();
	    
	    for(char charr : charToRemove) {
	    	if(line.contains(charr+"")) {
	    		line = line.replaceAll(charr+"", "");
	    	}
	    }
	    System.out.println(line);
	}

}

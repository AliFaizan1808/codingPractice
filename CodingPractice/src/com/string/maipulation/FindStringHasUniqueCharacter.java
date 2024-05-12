package com.string.maipulation;

import java.util.HashSet;

public class FindStringHasUniqueCharacter {

	public static void main(String[] args) {
		
		// Question - Write a java program to find out if the given String has all Unique Characters.
		
		String word1 = "Alive swum";
		
		String [] splittedWord = word1.split(" ");
		//this is how to remove all white space.
		String updatedWord = "";
		for(String word : splittedWord) {
			updatedWord = word.trim();
			updatedWord+=updatedWord;
		}
		
		System.err.println(updatedWord);
		
		String word2 = "Faizan ali";
		
		//1st way 
		boolean repeatedChar = false;
		for(int i = 0 ; i<word1.length() ; i++ ) {
			for(int j = i+1 ; j < word1.length() ; j++ ) {
				if(word1.charAt(i) == word1.charAt(j)) {
					repeatedChar = true;
					System.out.println("String does not contain unique chars");
					break;
				}
				
			}
			if(repeatedChar) {
				break;
			}
		}
		
		if(!repeatedChar) {
			System.out.println("String does contain unique chars");
		}

		
		//2nd way 
		HashSet<Character> charSet = new HashSet<>();
		boolean flag = false;
		for(int i = 0 ; i<word1.length() ; i++ ) {
			
			boolean charAdded = charSet.add(word1.charAt(i));
			if(!charAdded) {
				flag = true;
				System.out.println("String does not contain unique chars");
				break;
			}
		}
		
		if(!flag) {
			System.out.println("String does contain unique chars");
		}
		
		
		boolean flag1 = false;
		//3rd way
		for(int i = 0 ; i<word2.length() ; i++ ) {
			
			if(word2.indexOf(word2.charAt(i)) != word2.lastIndexOf(word2.charAt(i))) {
				flag1 = true;
				System.out.println("String does not contain unique chars");
				break;
				
			}
		}
		
		if(!flag1) {
			System.out.println("String does contain unique chars");
		}
		
		
	}

}

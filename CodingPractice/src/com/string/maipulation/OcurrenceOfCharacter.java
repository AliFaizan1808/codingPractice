package com.string.maipulation;

import java.util.HashMap;

public class OcurrenceOfCharacter {

//Write a java program to count occurrences of each character in String in java.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "My name is faizan Ali";
		name = name.toLowerCase();
		
		//way 1:
		char[] charArray = name.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < charArray.length ; i++ ) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			}else {
				map.put(charArray[i], 1);
			}
		}
		
		System.out.println(map);
		
	
	}

}

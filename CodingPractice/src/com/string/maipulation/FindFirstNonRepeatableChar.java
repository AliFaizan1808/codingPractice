package com.string.maipulation;

import java.util.LinkedHashMap;

public class FindFirstNonRepeatableChar {

	public static void main(String[] args) {
        
		String name =  "Ffaizazn Ali";
		name = name.toLowerCase();
		String [] str = name.split("");
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		for(String letter : str) {
			if(letter.trim() != "") {
				if(map.get(letter) == null) {
					map.put(letter, 1);
				}else {
					map.put(letter, map.get(letter) + 1);
				}
			}
		}
		System.out.println(map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey());
	}

}

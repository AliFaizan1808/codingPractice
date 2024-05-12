package com.collection.manipulation.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(22, "faizan");
		map.put(1, "Shifa");
		map.put(33, "Alex");
		
//		Map<Integer, String> sortedMap = map.entrySet().stream().sorted()
//		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		//Above line will give error and the reason is we need to specify we want to sort based on key or 
		//based on the value..so see the below code.
		
		Map<Integer, String> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(x, y) -> y , LinkedHashMap::new));
		
		System.out.println(sortedMap);
		
		Map<Integer, String> sortedMapReversed = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(x, y) -> y , LinkedHashMap::new));
		
		System.out.println(sortedMapReversed);

	}

}

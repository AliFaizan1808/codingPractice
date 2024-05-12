package com.collection.manipulation.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortSet {
	
	public static void main(String[] args) {
		
		Set<Integer> valueSet = new HashSet<>();
		valueSet.add(7);
		valueSet.add(33);
		valueSet.add(5);
		
		//1st way 
		//() -> new LinkedHashSet<>()
		Set<Integer> modifiedValueSet = valueSet.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(modifiedValueSet);
		
		Set<Integer> modifiedValueSetInDesc = valueSet.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(modifiedValueSetInDesc);
		
		
		
		System.out.println("====================================>");
		//2nd way 
		TreeSet<Integer> treeSet = new TreeSet<>(valueSet);
		System.out.println(treeSet);
		
		
		TreeSet<Integer> treeSet1 = new TreeSet<>(Collections.reverseOrder());
		treeSet1.addAll(valueSet);
		System.out.println(treeSet1);
		
		//3rd way 
		//Without java8 u have to basically convert into List and then use Collections.sort
		
	}

}

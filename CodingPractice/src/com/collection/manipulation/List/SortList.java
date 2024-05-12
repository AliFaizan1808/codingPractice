package com.collection.manipulation.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegerToTestAsc = Arrays.asList(3,44,123,34,1);
		List<Integer> listOfIntegerToTestDesc = Arrays.asList(3,44,123,34,1);
		
		//1st way 
		listOfIntegerToTestAsc.sort((x, y) -> x>y ? 1 : x<y ? -1 : 0);
		System.out.println(listOfIntegerToTestAsc);
		
		listOfIntegerToTestDesc.sort((x, y) -> x>y ? -1 : x<y ? 1 : 0);
		System.out.println(listOfIntegerToTestDesc);
		
		System.out.println("==============================>");
		//2nd way 
		List<Integer> listOfIntegerToTestAsc1 = Arrays.asList(3,44,123,34,1);
		Collections.sort(listOfIntegerToTestAsc1);
		System.out.println(listOfIntegerToTestAsc1);
		
		List<Integer> listOfIntegerToTestDesc1 = Arrays.asList(3,44,123,34,1);
		Collections.sort(listOfIntegerToTestDesc1, Collections.reverseOrder());
		System.out.println(listOfIntegerToTestDesc1);
		
		System.out.println("==============================>");
		//3rd way 
		List<Integer> listOfIntegerToTestAsc2 = Arrays.asList(3,44,123,34,1);
		List<Integer> modifiedList = listOfIntegerToTestAsc2.stream().sorted().collect(Collectors.toList());
		System.out.println(modifiedList);
		
		List<Integer> listOfIntegerToTestDesc2 = Arrays.asList(3,44,123,34,1);
		List<Integer> modifiedList2 = listOfIntegerToTestDesc2.stream().sorted((x, y) -> -Integer.compare(x, y))
				.collect(Collectors.toList());
		System.out.println(modifiedList2);
		System.out.println("==============================>");
		
		
	}
}

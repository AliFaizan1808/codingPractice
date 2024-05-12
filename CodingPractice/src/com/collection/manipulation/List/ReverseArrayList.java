package com.collection.manipulation.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> listOfInteger = Arrays.asList(3,44,123,34,1);
		
		//1st way 
		Collections.reverse(listOfInteger);
		System.out.println(listOfInteger);
		
		
		
	}

}

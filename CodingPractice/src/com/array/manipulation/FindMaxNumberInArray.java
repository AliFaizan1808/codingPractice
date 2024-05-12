package com.array.manipulation;

import java.util.Arrays;
import java.util.Collections;

public class FindMaxNumberInArray {
	
	public static void main(String[] args) {
		int [] intArray = {101,1,7,91,12,57, 101};
		
		//way 1
		int maxValue = Integer.MIN_VALUE;
		for(int number : intArray) {
			if(number > maxValue) {
				maxValue = number;
			}
		}
		System.out.println(maxValue);
		
		//way 2
		int maxValue1 = Arrays.stream(intArray).max().getAsInt();
		System.out.println(maxValue1);
		
		
		//way 3
		int maxValue2 = Arrays.stream(intArray).boxed().distinct()
		.sorted(Collections.reverseOrder())
		.findFirst().get();
		System.out.println(maxValue2);
		
	}
}

package com.array.manipulation;

import java.util.Arrays;

public class FindSecondMaxNumberInArray {

	public static void main(String[] args) {
		
		int [] intArray = {5,0,101, 1,7,91,12,57};
		
		//way 1
		int minValue = Integer.MIN_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] > maxValue) {
				maxValue = intArray[i];
			}else if(intArray[i] > minValue) {
				minValue = intArray[i];
			}
		}
		System.out.println("Max value : => " + maxValue);
		System.out.println("Second Max value : => " + minValue);

		
		//way 2
		int secondMax = Arrays.stream(intArray).boxed().sorted((x, y) -> - Integer.compare(x, y)).distinct().skip(1).findFirst().get();
		System.out.println("Second Max value : => " + secondMax);
	}

}

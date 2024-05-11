package com.string.maipulation;

public class IntersectionOfArray {

	/*
	 * Write a java program to find common elements between the two given arrays.
	 * Suppose given two arrays array1= {1,4,7, 9, 2} arrray2 = {1,7,3,4,5} the
	 * answer should be {1,4,7}
	 */

	public static void main(String[] args) {

		int [] array1 = {1,4,7, 9, 2};
		int [] array2 = {1,7,3,4,5};

		for(int i = 0; i<=array1.length-1 ; i++) {
			for(int j = 0; j<=array2.length-1 ; j++) {
				if(array1[i] == array2[j]) {
					System.out.println(array1[i]);
					break;
				}
			}
		}


	}

}

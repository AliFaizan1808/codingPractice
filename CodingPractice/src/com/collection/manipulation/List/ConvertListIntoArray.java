package com.collection.manipulation.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListIntoArray {

	//How to convert ArrayList to String array in java?
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		strList.add("Faizan");
		strList.add("shifa");
		strList.add("aman");
		
		

		//1st way 
		String [] strArray = new String[strList.size()];
		
		int i = 0;
		for(String name : strList) {
			strArray[i] = name;
			i++;
		}
		
		System.out.println(Arrays.toString(strArray));
		
		//2nd way 
		
		String [] strArray1 = strList.toArray(new String [strList.size()]);
		System.out.println(Arrays.toString(strArray1));
		
	}

}

package com.number.manipulation;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*
		 * Write a java program for the Armstrong number . A number is called Armstrong
		 * number if it is equal to the sum of the cube of each digit.for example 371 is
		 * an Armstrong number because 371 = 27+343+1 which is equal to 3^3+7^3+1^3.
		 */
		
		int number = 371;
		
		//way 1
		String strNumber = String.valueOf(number);
		
		int sum = 0;
		
		for(int i = 0 ; i<strNumber.length(); i++) {
			int num = Integer.parseInt(strNumber.charAt(i) + "");
			num = num * num * num;
			sum+=num;
		}
		
		if(number == sum) {
			System.out.println("Number is Armstrong Number");
		}else {
			System.out.println("Number is Not Armstrong Number");
		}

	}

}

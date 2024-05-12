package com.number.manipulation;

public class FactorialOfNumber {

	//Examples: 4! = 4 × 3 × 2 × 1 = 24.
	public static void main(String[] args) {

		int number = 10;

		int resultNumber = 1;

		while(number > 0) {
			resultNumber =  resultNumber * number;
			number --;
		}
		System.out.println("Factorial of the Number is " + resultNumber);
	}
}

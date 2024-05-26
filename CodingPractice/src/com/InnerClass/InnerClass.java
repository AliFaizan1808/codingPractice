package com.InnerClass;

public class InnerClass {

	public static void main(String[] args) {
		
		serviceOuterClass s = new serviceOuterClass();
		s.useInnerClass();
		
	}

}


class serviceOuterClass{
	//Note : You can not instantiate the inner class in static method.
	private int outerField = 10;


	// Inner class definition
	public class InClass {
		public void display() {
			//Note : see here u can access the instance variable of outer class, this thing u cant do in static inner class.
			System.out.println("InnerClass - OuterField: " + outerField);
		}
	}


	// Method to instantiate and use InnerClass
	public void useInnerClass() {
		InClass inner = new InClass(); // Creating instance of InnerClass
		inner.display(); // Accessing display method of InnerClass
	}
	
}

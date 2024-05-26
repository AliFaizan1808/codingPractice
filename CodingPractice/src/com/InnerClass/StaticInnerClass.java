package com.InnerClass;



public class StaticInnerClass {


	public static void main(String[] args) {
		
		ServiceClass.StaticInClass cl = new ServiceClass.StaticInClass();
		cl.display();
	}

}

class ServiceClass{
	private static int outerStaticField = 10;
	private int outerInstanceField = 20;

	// Static inner class definition
	public static class StaticInClass {
		public void display() {
			//Note :: Cannot access outerInstanceField directly, as it is not static
			System.out.println("StaticInnerClass - OuterStaticField: " + outerStaticField);
		}
	}

}

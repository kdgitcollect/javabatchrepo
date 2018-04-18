package main.java.interfaces;

//public class DefaultInterfaceMethod {
//
//}

//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface TestInterface1
{
	// default method
	default void show()
	{
		System.out.println("Default TestInterface1");
	}
	
	// static method
    static void static_show()
    {
        System.out.println("Static Method Executed");
    }
}

interface TestInterface2
{
	// Default method
	default void show()
	{
		System.out.println("Default TestInterface2");
	}
//	public void show();
}

//Implementation class code
class DefaultInterfaceMethod implements TestInterface1, TestInterface2
{
	// Overriding default show method
	public void show()
	{
		
		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();
//		System.out.println("random");

		// use super keyword to call the show
		// method of TestInterface2 interface
		TestInterface2.super.show();
	}

	public static void main(String args[])
	{
		DefaultInterfaceMethod d = new DefaultInterfaceMethod();
		d.show();
		// Static method executed
        TestInterface1.static_show();
	}
}

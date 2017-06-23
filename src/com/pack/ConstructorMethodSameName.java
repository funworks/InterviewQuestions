/**
 * 
 */
package com.pack;

/**
 * Question: Can we write method with same name as Constructor? Will it work?
 * Answer: Yes, it will.
 *
 */
public class ConstructorMethodSameName {
	
	public ConstructorMethodSameName() {
		System.out.println("I am in constructor...");
	}
	
	public int ConstructorMethodSameName() {
		System.out.println("I am in method");
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConstructorMethodSameName a = new ConstructorMethodSameName();
		a.ConstructorMethodSameName();
	}

}

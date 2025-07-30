package com.chaitu.singleton;

public class SingletonClass {

	private final String COUNTRY = "INDIA";

	private static SingletonClass sc;

	// Step 1: Make constructor as private
	private SingletonClass() {
		System.out.println("SingletonClass :: private 0 param Constructor");
	}

	public void showMessage(String name) {
		System.out.println("SingletonClass.showMessage()");
		System.out.println(name + " From " + COUNTRY);
	}

	public static SingletonClass object() {
		System.out.println("SingletonClass.object()");
		if (sc == null) {
			sc = new SingletonClass();
			System.out.println("Object is created");
		}

		else {
			System.out.println("Object is already created");
			// throw new IllegalArgumentException("Sorry, Object is already created");
		}
		return sc;
	}
}

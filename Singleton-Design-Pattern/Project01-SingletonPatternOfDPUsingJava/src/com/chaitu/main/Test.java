package com.chaitu.main;

import com.chaitu.singleton.SingletonClass;

public class Test {

	public static void main(String[] args) {
		SingletonClass object = SingletonClass.object();
		SingletonClass object1 = SingletonClass.object();
		object.showMessage("Chaitu");
		System.out.println(object.hashCode() + "   " + object1.hashCode());
	}
}

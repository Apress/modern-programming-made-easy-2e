package com.github.modernprog;

public class Dragon {

	String name;

	public Dragon() {
		name = "No name";
	}

	public Dragon(String name) {
		this.name = name;
	}

	public void fly() {
		// fly code goes here
		System.out.println(name + " is flying");
	}

	public String toString() {
		return name;
	}

	public static String makeThemFight(Dragon d, Vampire v) {
		// a bunch of code goes here.
		return "";
	}

}

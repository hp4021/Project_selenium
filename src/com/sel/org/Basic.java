package com.sel.org;

public class Basic {
	public static void main(String[] args) {
		Classic c = new Classic();
		c.setAge(21);
		int age = c.getAge();
		System.out.println(age);
		c.setName("hari");
		String name = c.getName();
		System.out.println(name);
	}
	
	
	

}

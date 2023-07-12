package com.slokam.service;

public class Service {

	public int add() {
		
		int a =40;
		int b = 60;
		int c = a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		
		Service service = new Service();
		System.out.println(service.add());
		
		
	}
	
}

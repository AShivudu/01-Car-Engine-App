package com.shiva;

public class Car extends Engine {

	public void drive() {
		int start = super.start();

		if (start >= 1) {
			System.out.println("Journey Started...!!");
		} else {
			System.out.println("Engine Having Some Problem....!!");
		}
	}

}

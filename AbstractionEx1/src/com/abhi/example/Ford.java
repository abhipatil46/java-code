package com.abhi.example;

public class Ford extends Car{

	@Override
	public void startCar() {
		super.status="Car is Moving forword";
		System.out.println(super.status);
	}

	@Override
	public void stopCar() {
		super.status="Car is Stopd Moving";
		System.out.println(super.status);

	}

}

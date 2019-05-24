package com.sushmita.model;

import com.sushmita.context.ATMMachine;

public class OutOfCash implements ATMState {
	
	private ATMMachine atmMachine;
	public OutOfCash(ATMMachine machine) {
		this.atmMachine = machine;
	}

	public void insertCard() {
		System.out.println("Oops Machine is out of cash!");
	}

	public void ejectCard() {
		System.out.println("Oops Machine is out of cash!");

	}

	public void insertPin(int pin) {
		System.out.println("Oops Machine is out of cash!");
	}

	public void withdrawCash(int cashAmount) {
		System.out.println("Oops Machine is out of cash!");

	}

}

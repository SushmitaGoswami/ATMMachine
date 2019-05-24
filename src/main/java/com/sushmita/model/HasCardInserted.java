package com.sushmita.model;

import com.sushmita.context.ATMMachine;

public class HasCardInserted implements ATMState {
	
	private ATMMachine atmMachine;
	public HasCardInserted(ATMMachine machine) {
		this.atmMachine = machine;
	}

	public void insertCard() {
		System.out.println("Already ne card is inserted!");
	}

	public void ejectCard() {
		System.out.println("Card ejected successfully!");
	}

	public void insertPin(int pin) {
		if(pin == 1234) {
			this.atmMachine.setAtmState(this.atmMachine.getHasCorrectPinGiven());
			System.out.println("Pin verified successfully!");
		}
		else {
			System.out.println("Wrong pin insertted");
			this.atmMachine.setAtmState(this.atmMachine.getNoCard());
			System.out.println("Card ejected");
		}
	}

	public void withdrawCash(int cashAmount) {
		System.out.println("Please insert your card first!");
	}

}

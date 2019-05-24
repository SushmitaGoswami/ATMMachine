package com.sushmita.model;

import com.sushmita.context.ATMMachine;

public class NoCard implements ATMState {
	
	private ATMMachine atmMachine;
	
	public NoCard(ATMMachine machine) {
		this.atmMachine = machine;
	}

	public void insertCard() {
		System.out.println("Card inserted successfully!");
		this.atmMachine.setAtmState(this.atmMachine.getHasCardInserted());
	}

	public void ejectCard() {
		System.out.println("No Card Found!");

	}

	public void insertPin(int pin) {
		System.out.println("Please Insert the card first!");

	}

	public void withdrawCash(int cashAmount) {
		System.out.println("Please Insert the card first!");

	}

}

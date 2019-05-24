package com.sushmita.model;

import com.sushmita.context.ATMMachine;

public class HasCorrectPinGiven implements ATMState {
	
	private ATMMachine atmMachine;
	public HasCorrectPinGiven(ATMMachine machine) {
		this.atmMachine = machine;
	}

	public void insertCard() {
		System.out.println("Already has one card inserted!");
	}

	public void ejectCard() {
		this.atmMachine.setAtmState(this.atmMachine.getNoCard());
		System.out.println("Card ejected successfully!");
	}

	public void insertPin(int pin) {
		System.out.println("Already has correct pin inserted!");
	}

	public void withdrawCash(int cashAmount) {
		if(this.atmMachine.getCashInMachine() < cashAmount) {
			this.atmMachine.setCashInMachine(this.atmMachine.getCashInMachine() - cashAmount);
			System.out.println("Please collect the cash!");
			this.atmMachine.setAtmState(this.atmMachine.getNoCard());
			System.out.println("Card ejected successfully!");
		}
		else
		{
			System.out.println("Not sufficient cash is there!");
			this.atmMachine.setAtmState(this.atmMachine.getNoCard());
			System.out.println("Card ejected successfully!");
			
		}
		
		if(this.atmMachine.getCashInMachine() <=0)
		{
			this.atmMachine.setCashInMachine(0);
			this.atmMachine.setAtmState(this.atmMachine.getMachineOutOfCash());
		}
	}

}

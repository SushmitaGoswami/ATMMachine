package com.sushmita.context;

import com.sushmita.model.*;

public class ATMMachine {

	private ATMState noCard;
	private ATMState hasCardInserted;
	private ATMState hasCorrectPinGiven;
	private ATMState machineOutOfCash;
	
	private ATMState atmState;
	private int cashInMachine;
	
	public ATMMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
		this.noCard = new NoCard(this);
		this.hasCardInserted = new HasCardInserted(this);
		this.hasCorrectPinGiven = new HasCorrectPinGiven(this);
		this.machineOutOfCash = new OutOfCash(this);
		this.atmState = this.noCard;
		
	}

	public ATMState getNoCard() {
		return noCard;
	}

	public ATMState getHasCardInserted() {
		return hasCardInserted;
	}

	public ATMState getHasCorrectPinGiven() {
		return hasCorrectPinGiven;
	}

	public ATMState getMachineOutOfCash() {
		return machineOutOfCash;
	}

	public ATMState getAtmState() {
		return atmState;
	}

	public int getCashInMachine() {
		return cashInMachine;
	}

	public void setAtmState(ATMState atmState) {
		this.atmState = atmState;
	}

	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}
	
	public void insertCard() {
		this.atmState.insertCard();
	}
	
	public void ejectCard() {
		this.atmState.ejectCard();
	}
	
	public void insertPin(int pin) {
		this.atmState.insertPin(pin);
	}
	
	public void withdramCash(int cash) {
		this.atmState.withdrawCash(cash);
	}
}

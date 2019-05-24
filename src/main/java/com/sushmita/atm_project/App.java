package com.sushmita.atm_project;

import java.util.Scanner;

import com.sushmita.context.ATMMachine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	ATMMachine atmMachine = new ATMMachine(2000);
        System.out.println("ATM Machine is active!");
        System.out.println("Press 1/0 to login as Admin/ustomer respectively!");
        int loginAs = scanner.nextInt();
        while(true) {
        	System.out.println("Please give ur choice");
        	System.out.println("1. Insert your card!");
        	System.out.println("2. Give your pincode!");
        	System.out.println("3. Withdraw cash!");
        	System.out.println("4. Eject your card!");
        	if(loginAs == 1) {
        		System.out.println("5. Load cash into atm!");
        	}
        	
        	int choice = scanner.nextInt();
        	switch(choice) {
        	case 1: atmMachine.insertCard();
        			break;
        	case 2: System.out.println("Please give ur pin!");
        			int pin = scanner.nextInt();
        			atmMachine.insertPin(pin);
        			break;
        	case 3: System.out.println("Please give the amount to be withdrawn!");
        			int cash = scanner.nextInt();
        			atmMachine.withdramCash(cash);
        			break;
        	case 4: atmMachine.ejectCard();
        			break;
        	case 5:
        			if(loginAs == 1) {
        				System.out.println("Please give the amount to load");
        				int amount = scanner.nextInt();
        				atmMachine.setCashInMachine(amount);
        				break;
        			}
        			else {
        				
        			}
        	default:System.out.println("Please give a valid input");
        	}
        	
        }
    }
}

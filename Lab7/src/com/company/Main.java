package com.company;

import java.util.HashMap;

public class Main {
    private HashMap<Integer, String> pinMap;
    private String name;
    private int accountNum;
    private int[][] currentBal;
    private int arrayPos;

    public Main() {
	    pinMap = new HashMap<Integer, String>();
        fillCurrentBal();
        enterInfo("MIKE", 1234);
    }

    public void fillCurrentBal() {
        final int startingBalance = 1000;
        currentBal[0][0] = startingBalance;
        currentBal[1][0] = startingBalance;
    }

    public void enterInfo(String name, int pinx) {
        for (PinEnum pin : PinEnum.values()) {
            if (pinx == pin.getPin()) {
                System.out.println(pin + "=" + pin.getPin());
                if (name.equals(pin)) {
                    System.out.println("Success.");
                    mainMenu(name, 4);
                }
            }
        }
    }

    public void mainMenu(String name, int optionNum) {
        if (name == "MIKE") {
            arrayPos = 0;
        } else {
            arrayPos = 1;
        }
        System.out.println("Welcome to the ATM " + name + "\n");
        System.out.println("Please select an option: \n");
        System.out.println("1. Withdraw     2. Deposit     3. Current Balance     4. Quit");
        if (optionNum == 1) {
            withdraw();
        } else if (optionNum == 2) {
            deposit();
        } else if (optionNum == 3) {
            System.out.println(currentBal[arrayPos][0]);
        } else {
            System.out.println("Bye");
        }
    }

    public void withdraw(int withdrawAmt) {
        currentBal[arrayPos][0] = withdrawAmt--;
    }

    public void deposit(int deposit) {
        currentBal[arrayPos][0] = deposit++;
    }

    public static void main(String[] args) {
        new Main();
    }

}
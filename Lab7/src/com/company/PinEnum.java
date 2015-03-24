package com.company;

/**
 * Created by mbila on 3/23/15.
 */
public enum PinEnum {
    MIKE(1234), JOHN(4321);
    private int pin;

    private PinEnum(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}
package com.company;

/**
 * Created by mbila on 3/22/15.
 */

public enum Enum {
    X(1), O(2), EMPTY(0);
    private int value;

    private Enum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
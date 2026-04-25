package com.una.models;

import com.una.interfaces.SuspensionInterface;

public class Suspension implements SuspensionInterface {

    @Override
    public void suspensionType(String type) {
        System.out.println("the suspension type is: " + type);
    }
}

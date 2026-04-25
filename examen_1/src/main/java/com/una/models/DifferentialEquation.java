package com.una.models;

import com.una.interfaces.DifferentialEquationsInterface;

public class DifferentialEquation implements DifferentialEquationsInterface {

    @Override
    public void differentialEquationsType(String type) {
        System.out.println("The differential equation type is: " + type);
    }

}

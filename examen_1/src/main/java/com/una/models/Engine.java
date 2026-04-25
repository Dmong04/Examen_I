package com.una.models;

import com.una.interfaces.EngineInterface;

public class Engine implements EngineInterface {

    @Override
    public void engineType(String type) {
        System.out.println("The engine type is: " + type);
    }
}

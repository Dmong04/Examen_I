package com.una.models;

public class DieselCar extends Car {

    private final Engine engine;
    private final Suspension suspension;
    private final DifferentialEquation differentialEquation;

    public DieselCar(Engine engine, Suspension suspension, DifferentialEquation differentialEquation) {
        this.engine = engine;
        this.suspension = suspension;
        this.differentialEquation = differentialEquation;
    }

    @Override
    public void typeCarOffRoad(String engineType, String suspensionType, String differentialEquationType) {
        System.out.println("Diesel Car");
        engine.engineType(engineType);
        suspension.suspensionType(suspensionType);
        differentialEquation.differentialEquationsType(differentialEquationType);
        System.out.println("\n");
    }
}

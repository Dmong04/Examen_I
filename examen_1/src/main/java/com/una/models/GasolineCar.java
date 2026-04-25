package com.una.models;

public class GasolineCar extends Car {

    private final Engine engine;
    private final Suspension suspension;
    private final DifferentialEquation differentialEquation;

    public GasolineCar(Engine engine, Suspension suspension, DifferentialEquation differentialEquation) {
        this.engine = engine;
        this.suspension = suspension;
        this.differentialEquation = differentialEquation;
    }

    @Override
    public void typeCarOffRoad(String engineType, String suspensionType, String differentialEquationType) {
        System.out.println("Gasoline Car");
        engine.engineType(engineType);
        suspension.suspensionType(suspensionType);
        differentialEquation.differentialEquationsType(differentialEquationType);
        System.out.println("\n");
    }
}

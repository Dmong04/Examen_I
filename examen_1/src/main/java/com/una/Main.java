package com.una;

import com.una.models.Car;
import com.una.models.DieselCar;
import com.una.models.DifferentialEquation;
import com.una.models.Engine;
import com.una.models.GasolineCar;
import com.una.models.Suspension;

public class Main {
    
    public static void assembleCars() {
        String[] engines = {"5000 cc", "6000 cc"};
        String[] suspensions = {"ARB 2.5 inches", "TJM 3.5 inches"};
        String[] differentialEquations = {"4.7", "4.9"};

        int count = 1;
        for (String e  : engines) {
            for (String s : suspensions) {
                for (String d : differentialEquations) {
                    System.out.println("Car combinations number: " + count);

                    Car gasolineCar = new GasolineCar(new Engine(), new Suspension(), new DifferentialEquation());
                    Car dieselCar = new DieselCar(new Engine(), new Suspension(), new DifferentialEquation());

                    gasolineCar.typeCarOffRoad(e, s, d);
                    dieselCar.typeCarOffRoad(e, s, d);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        assembleCars();
    }
}

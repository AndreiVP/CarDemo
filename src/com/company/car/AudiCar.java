package com.company.car;

public class AudiCar extends Car{


    public AudiCar(CarType carType, String carColour) {
        super(carType, carColour);
    }

    @Override
    public void mount_engine() {
        System.out.println("Audi mount engine");
        engine = "Audi engine";
    }

    @Override
    public void mount_wheels() {
        System.out.println("Audi mount wheels");
        wheels = "Audi wheels";
    }

    @Override
    public void mount_body() {
        System.out.println("Audi mount body");
        engine = "Audi body";
    }
}

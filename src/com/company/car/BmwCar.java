package com.company.car;

public class BmwCar extends Car {

    public BmwCar(CarType carType, String carColour) {
        super(carType, carColour);
    }

    @Override
    public void mount_engine() {
        System.out.println("BMW mount engine");
        engine = "BMW engine";
    }

    @Override
    public void mount_wheels() {
        System.out.println("BMW mount wheels");
        wheels = "BMW body";
    }

    @Override
    public void mount_body() {
        System.out.println("BMW mount body");
        body = "BMW body";
    }
}

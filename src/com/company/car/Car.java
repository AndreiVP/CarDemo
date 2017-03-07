package com.company.car;

public abstract class Car {

    private CarType carType;
    private String carColour;

    protected String engine;
    protected String wheels;
    protected String body;

    public Car(CarType carType, String carColour){
        this.carType = carType;
        this.carColour = carColour;
    }

    public abstract void mount_engine();

    public abstract void mount_wheels();

    public abstract void mount_body();
}

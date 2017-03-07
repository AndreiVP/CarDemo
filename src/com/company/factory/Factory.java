package com.company.factory;

import com.company.car.AudiCar;
import com.company.car.BmwCar;
import com.company.car.Car;
import com.company.car.CarType;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public Car buildCar (CarType carType){
        Car car = null;
        if(carType == CarType.AUDI){
            car = new AudiCar(carType.AUDI, "Red");
        } else {
            car = new BmwCar(carType.BMW, "Blue");
        }

        return car;
    }

    public List <Car> buildCar(CarType carType, int numberOfCars){
        List<Car> carList = new ArrayList<>();
        for(int i = 0; i<numberOfCars; i++){
            buildCar(carType);

            Car car = buildCar(carType);
            carList.add(car);
        }
        return carList;
    }
}

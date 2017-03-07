package com.company;

import com.company.car.AudiCar;
import com.company.car.BmwCar;
import com.company.car.CarType;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BmwCar carBmw = new BmwCar(CarType.BMW, "Blue");
        carBmw.mount_engine();
        carBmw.mount_wheels();
        carBmw.mount_body();

        AudiCar carAudi = new AudiCar(CarType.BMW, "Red");
        carAudi.mount_engine();
        carAudi.mount_wheels();
        carAudi.mount_body();

    }
}

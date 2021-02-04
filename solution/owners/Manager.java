package com.owners;

import com.company.Car;

public class Manager {

    public Car myCar;
    public Manager(Car _myCar) {
        myCar = _myCar;
    }

    int age;
    public Manager(int _age) {
        age = _age;
    }

    public void buyCar()
    {
        Car tesla = new Car("lamburgini Testa Rossa", "99-888-77",
                100000, "Bill Gates");
        System.out.println(tesla.model);
        //tesla.GetCarRides("Km");
    }
}

package com.company;

public class Car {
    public String model;
    public String licenseNumber; // "82-794-32"
    private double km;
    private String owner_name;

    private static int carsCounter = 0; // --> increase by 1 in every new car

    public Car(String model, String licenseNumber, float km, String owner_name) {
        this.model = model;
        this.licenseNumber = licenseNumber;
        this.km = km;
        this.owner_name = owner_name;
        carsCounter++;
    }

    private double GetCarRides(String mesaureType)
    {
        if (mesaureType.equals("Km"))
        {
            return km;
        }
        else {
            return km / 1.6;
        }
    }

    public void carGo(float ride, String mesaureType)
    {
        if (mesaureType.equals("Km"))
        {
            km += ride;
        }
        else {
            km += ride * 1.6;
        }

    }

    public String getcarOwnerName()
    {
        return owner_name;
    }
    public static int getNumberOfCreatedCars()
    {
        return carsCounter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", km=" + km +
                ", owner_name='" + owner_name + '\'' +
                '}';
    }
}

package com.company;

import com.owners.Manager;

import java.util.Date;
import java.util.Random;

public class Main
{
    static Random r2 = new Random();

    public static void main(String[] args)  {
        int x = 5;
        Random r = new Random();

        // Car
        // public String model
        // public String licenseNumber "82-794-32"
        // private float km
        // private String owner_name
        // private static carsCounter --> increase by 1 in every new car
        // public String getcarOwnerName()
        // public int getNumberOfCreatedCars()

        Car lamburgini = new Car("lamburgini Testa Rossa", "99-888-77",
                100000, "Bill Gates");
        //lamburgini.km = 0;
        lamburgini.carGo(500, "Km");
        //System.out.println(lamburgini.GetCarRides("Km"));
        //System.out.println(lamburgini.GetCarRides("Ml"));
        System.out.println(lamburgini.model);

        Manager man1 = new Manager(lamburgini);
        lamburgini.model = "ferrari";
        Car ferrari = new Car("Ferrari", "33-884-11",
                100000, "Mark Tzu");
        Manager man2 = new Manager(ferrari);
        ferrari.carGo(100000, "Km");
        man2.myCar.model = "Mitsubishi";

        Manager man3 = new Manager(new Car("Ferrari", "33-884-11",
                100000, "Mark Tzu"));
        // no!
        man3.myCar.carGo(100, "Km");

        // package 1 -- Hardware
        // class Engine
        // public String name
        // public int size
        // private double miles
        // private int model_number
        // [default] int number_of_cyl
        // public void runEngine( double more_miles ) --> miles += more_miles
        // [default] bool doesEngineneedsRestart
        //          miles > miles_per_restart
        // private static final double miles_per_restart =....

        // package 2 -- Arkia
        // class Boing747
        //  private Engine engine
        //  public fly ( double miles ) --> call runEngine

        // main
        // create Boing747
        // fly
        // *Etgar: Boing747 will contains Engine[] with 2 engines
        //         fly --> will add miles o both engines







    }

    public static void SayHello(Person p)
    {

    }
}

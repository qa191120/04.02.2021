package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Engine {
    public String name;
    public int size;
    private double miles;
    private int model_number;
    int number_of_cyl;
    private static final double miles_per_restart = 1_000_000;

    public void runEngine( double more_miles )
    {
        miles += more_miles;
    }
    boolean doesEngineneedsRestart()
    {
        return miles > miles_per_restart;
    }

}

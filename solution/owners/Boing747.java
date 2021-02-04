package com.owners;

import com.company.Engine;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Boing747 {

    private Engine engine;
    public void fly ( double miles )
    {
        engine.runEngine(miles);
    }

}

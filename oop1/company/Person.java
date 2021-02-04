package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Random;

@AllArgsConstructor
public class Person {

    static Random r = new Random();
    // access modifier
    // public private protected default(package-private)
    public static int personCounter = 0;
     String fname; // default -- in the same package
    public String lname;
     String atmCode;
    // what happens with no modifier
    private int age;

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.atmCode = String.format("%s", r.nextInt(9999- 1000 ) + 1);
        this.age = age;
        personCounter++;
    }

    private void GoToBank ()
    {
        // 1000 - 9999
        atmCode = String.format("%s", r.nextInt(9999 - 1000 ) + 1000);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", atmCode='" + atmCode + '\'' +
                ", age=" + age +
                '}';
    }
}

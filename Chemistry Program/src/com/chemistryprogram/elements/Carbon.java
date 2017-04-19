package com.chemistryprogram.elements;

/**
 * Created by Faraan on 1/11/2017.
 */
public class Carbon extends Elements {
    public Carbon() {
        super(6, 12.0107, "Carbon");
    }


    @Override
    public double gramsToMoles() {
        System.out.println("You have " + super.gramsToMoles() + " moles of " + getName());
        return 2;
    }
}

package com.chemistryprogram.elements;

/**
 * Created by Faraan on 1/11/2017.
 */
public class Oxygen extends Elements{
    public Oxygen() {
        super(8, 15.9994, "Oxygen");
    }

    @Override
    public double molesToGrams() {
        System.out.println("You have " + super.molesToGrams() + " grams of " + getName());
        return 1;
    }

    @Override
    public double gramsToMoles() {
        System.out.println("You have " + super.gramsToMoles() + " moles of " + getName());
        return 2;
    }

}

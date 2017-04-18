package com.chemistryprogram.elements;

/**
 * Created by Faraan on 1/16/2017.
 */
public class Beryllium extends Elements {
    public Beryllium() {
        super(4, 9.0122, "Beryllium");
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

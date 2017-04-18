package com.chemistryprogram.elements;

/**
 * Created by Faraan on 1/16/2017.
 */
public class Lithium extends Elements {
    public Lithium() {
        super(3, 6.941, "Lithium");
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

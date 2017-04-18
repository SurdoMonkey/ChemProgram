package com.chemistryprogram.elements;

/**
 * Created by Faraan on 1/16/2017.
 */
public class Fluorine extends Elements {
    public Fluorine() {
        super(9, 18.9984, "Fluorine");
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

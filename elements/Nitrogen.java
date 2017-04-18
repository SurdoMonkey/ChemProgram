package com.chemistryprogram.elements;

/**
 * Created by Faraan on 1/11/2017.
 */
public class Nitrogen extends Elements{
    public Nitrogen() {
        super(7, 14.0067, "Nitrogen");
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

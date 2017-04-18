package com.chemistryprogram.elements;

/**
 * Created by Faraan on 1/11/2017.
 */
public class Iron extends Elements {
    public Iron() {
        super(26, 55.845, "Iron");
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

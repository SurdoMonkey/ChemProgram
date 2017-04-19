package com.chemistryprogram.elements;

/**
 * Created by Faraan on 2/21/2017.
 */
public class Element0 extends Elements {
    public Element0() {
        super(0, 0, "Element0");
    }

    @Override
    public double molesToGrams() {
        nonExistent();
        return -1;
    }

    @Override
    public double gramsToMoles() {
        nonExistent();
        return -1;
    }

    public void nonExistent() {
        System.out.println("This element does not exist");
    }
}

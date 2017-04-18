package com.chemistryprogram.elements;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Faraan on 1/11/2017.
 */
public class Elements {

    private int proton;
    private double atomicWeight;
    private String name;

    private ArrayList<Elements> elements;

    public ArrayList<Elements> getElements() {
        return elements;
    }

    public void setElements() {
        elements=new ArrayList<Elements>();
        Element0 element0 = new Element0();
        Hydrogen hydrogen = new Hydrogen();
        Helium helium = new Helium();
        Lithium lithium = new Lithium();
        Beryllium beryllium = new Beryllium();
        Boron boron = new Boron();
        Carbon carbon = new Carbon();
        Nitrogen nitrogen = new Nitrogen();
        Oxygen oxygen = new Oxygen();
        Fluorine fluorine = new Fluorine();
        Neon neon = new Neon();
//        Iron iron = new Iron();
//        Uranium uranium = new Uranium();
        elements.add(0, element0);
        elements.add(1, hydrogen);
        elements.add(2, helium);
        elements.add(3, lithium);
        elements.add(4, beryllium);
        elements.add(5, boron);
        elements.add(6, carbon);
        elements.add(7, nitrogen);
        elements.add(8, oxygen);
        elements.add(9, fluorine);
        elements.add(10, neon);
//        elements.add(26, iron);
//        elements.add(92, uranium);
    }


    public Elements(){
        setElements();
    }

    public Elements(int proton, double atomicWeight, String name) {
        this.proton = proton;
        this.atomicWeight = atomicWeight;
        this.name = name;
        this.elements=new ArrayList<>();
    }


    public int getProton() {
        return proton;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public String getName() {
        return name;
    }

    public double molesToGrams() throws InputMismatchException {

            Scanner testing = new Scanner(System.in);
            double mole;
            double grams = 0;
            System.out.println("How many moles?");
            mole = testing.nextDouble();
            if (mole >= 0) {
                grams = (mole * getAtomicWeight());
                System.out.println("You have " + grams + " grams of " + getName());
            } else {
                System.out.println("Cannot process negative moles.");
            }
            return grams;
    }

    public double gramsToMoles() {
        Scanner testing = new Scanner (System.in);
        double grams;
        System.out.println("How many grams?");
        grams = testing.nextDouble();
        double moles = 0;
        if (grams >= 0) {
            moles = (grams/getAtomicWeight());
        } else {
            System.out.println("Cannot process negative grams.");
        }

        return moles;
    }


}

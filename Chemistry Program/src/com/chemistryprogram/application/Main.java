package com.chemistryprogram.application;

import com.chemistryprogram.Assessment.MultipleChoiceTestAssessment;
import com.chemistryprogram.elements.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Faraan on 1/11/2017 & fudged by Yemeni thereafter.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in); //A2MA: got rid of local assignments to the field

    public static void main(String[] args) throws IOException {

        Elements elementsInstance = new Elements();
        ArrayList<Elements> elements = elementsInstance.getElements();

//        System.out.println(elementsInstance.getElements().get(1));

        boolean quit = false;
        int elementChoice;
        String filename;
        System.out.println("Welcome to the Chemistry Program.");
        while (!quit) {
            printMainMenu();
            System.out.println("Make selection:");
            int selection = 99;
            try {
                selection = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please select a number.");
            } catch (Exception g) {
                System.out.println("Exception Error");
            }
            switch (selection) {
                case 0:
                    System.out.println("Ending program");
                    quit = true;
                    break;
                case 1:
//                  Convert moles to grams
                    boolean quit1 = false;
                    while (!quit1) {
                        System.out.println("Which element? (Atomic Number)");
//                        A2MA: trying to show user available elements
//                        System.out.println("Available Elements:");
//                        for(int i = 0; i < elements.size(); i++){
//                            System.out.println(elements.get(i));
//                        }
                        try {
                            elementChoice = scanner.nextInt();
                            quit1 = true;
                            boolean quit2 = false;
                            while (!quit2) {
                                try {
                                    if (elementChoice <= elements.size() && elementChoice >= 0) {
                                        elements.get(elementChoice).molesToGrams();
                                        quit2 = true;
                                    } else {
                                        System.out.println("Element does not exist");
                                        quit2 = true;
                                        quit1 = false;
                                    }
                                } catch (InputMismatchException f) {
                                    System.out.println("Invalid input type. Please try again with an available choice.");
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    System.out.println("Invalid input type wrong message" + "\n");
                                }
                            }
                        } catch (InputMismatchException f) {
                            System.out.println("Invalid element input type");
                        } catch (Exception f) {
                            System.out.println("Some other type of error");
                        }
                    }
                    break;
                case 2:
//                  Convert grams to moles
                    boolean quit2 = false;
                    while (!quit2) {
                        System.out.println("Which element? (Atomic Number)");
                        try {
                            elementChoice = scanner.nextInt();
                            quit2 = true;
                            boolean quit3 = false;
                            while (!quit3) {
                                try {
                                    if (elementChoice <= elements.size() && elementChoice >= 0) {
                                        elements.get(elementChoice).gramstoMoles();
                                        quit3 = true;
                                    } else {
                                        System.out.println("Element does not exist");
                                        quit3 = true;
                                        quit2 = false;
                                    }
                                } catch (InputMismatchException f) {
                                    System.out.println("Invalid input type");
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    System.out.println("Invalid input type wrong message" + "\n");
                                }
                            }
                        } catch (InputMismatchException f) {
                            System.out.println("Invalid element input type");
                        } catch (Exception f) {
                            System.out.println("Some other type of error");
                        }
                    }
                    break;
                case 3:
                    boolean quit3 = false;
                    while (!quit3) {
                        System.out.print("Enter file name:");
                        filename = scanner.nextLine();
                        try {
                            MultipleChoiceTestAssessment multipleChoiceTestAssessment = new MultipleChoiceTestAssessment(filename + ".txt");
                            quit3 = true; //for a future invalid submission checking for the test assessment
                            boolean quit4 = false;
                            while (!quit4) {
                                try {
                                    printAssessmentMenu();
                                    System.out.println("Make selection:");
                                    selection = scanner.nextInt();
                                    switch (selection) {
                                        case 0:
                                            quit4 = true;
                                            quit3 = true;
                                            break;
                                        case 1:
                                            multipleChoiceTestAssessment.gradeTest();
                                            quit4 = true;
                                            break;
                                        case 2:
                                            multipleChoiceTestAssessment.printTest();
                                            quit4 = true;
                                        default:
                                            System.out.println("Not an option");
                                            quit3 = false;
                                            quit4 = true;
                                            break;
                                    }
                                } catch (InputMismatchException f) {
                                    System.out.println("Invalid input type");
                                    quit4 = true;
                                    quit3 = false;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    System.out.println("Invalid input type wrong message" + "\n");
                                    quit4 = true;
                                    quit3 = false;
                                }
                            }

                        } catch (InputMismatchException f) {
                            System.out.println("Invalid element input type");
                        } catch (Exception f) {
                            System.out.println("Some other type of error");
                        }

                   }
                    break;
            }
        }

    }

    private static void printMainMenu() { //made access private -- suggested by intelliJ
        System.out.println("0 - End program");
        System.out.println("1 - Convert moles to grams");
        System.out.println("2 - Convert grams to moles");
        System.out.println("3 - Assessment");
    }

    private static void printAssessmentMenu() { //made access private
        System.out.println("0 - Grade Test");
        System.out.println("1 - Print Test");
    }

}

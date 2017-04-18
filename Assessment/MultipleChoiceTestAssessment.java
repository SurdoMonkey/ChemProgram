package com.chemistryprogram.Assessment;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Faraan on 4/2/2017.
 */
public class MultipleChoiceTestAssessment {
    private ArrayList<String> answerKey = new ArrayList<>();
    private String fileName;

    public MultipleChoiceTestAssessment(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<String> getAnswerKey() {
        answerKey.add("Student"); answerKey.add("ID Number"); answerKey.add("A"); answerKey.add("B"); answerKey.add("C"); answerKey.add("D");
        return this.answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public String getFileName() {
        return fileName;
    }
    public ArrayList<String> processTest() throws IOException {
        String line;

        ArrayList<String> submission = new ArrayList<>();

        FileReader fileReader = new FileReader(getFileName());

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("Name:")) {
                String[] parts = line.split(" ");
                submission.add(parts[1]);
            }

            if (line.contains("Student ID")) {
                String[] parts = line.split(": ");
                submission.add(parts[1]);
            }

            if (line.contains("Answer:")) {
                String[] parts = line.split(" ");
                submission.add(parts[1]);
            }
        }
        return submission;
    }

    public void printTest() throws IOException {
//        String line = null;
//        ArrayList<String> submission = new ArrayList<>();
//        FileReader fileReader = new FileReader(getFileName());
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }

        List<String> lines = Files.readAllLines(Paths.get(getFileName()));

        for(String line: lines)
            System.out.println(line);
    }

    public void gradeTest () throws IOException {

        int correctNumber = 0;
        for (int i = 2; i < processTest().size(); i++) {
            if (processTest().get(i).compareTo(getAnswerKey().get(i)) == 0) {
                correctNumber++;
            }
        }

        char letterGrade;
        double percentageCorrect = ((double)correctNumber/(double)(processTest().size() - 2));
        if (percentageCorrect > .9) {
            letterGrade = 'A';
        } else if (percentageCorrect > .8) {
            letterGrade = 'B';
        } else if (percentageCorrect > .7) {
            letterGrade = 'C';
        } else if (percentageCorrect > .6) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }


        System.out.println("You got " + correctNumber + " out of 4 correct.");
        System.out.println("Your letter grade is " + letterGrade);
    }

}

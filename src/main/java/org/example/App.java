package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;

public class App
{
    public static double BMICalculator(double height, double pounds) {
        double b= pounds/(height*height);
        return b*703;
    }

    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your height in inches? ");
        String str = input.nextLine();
        double height;
        try {
            height = Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is your weight in pounds? ");
        String str2 = input2.nextLine();
        double pounds;
        try {
            pounds = Integer.valueOf(str2);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        double BMI;
        BMI= BMICalculator (height, pounds);
        System.out.print("Your BMI is " + BMI + "\n");

        if (BMI>25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else if (BMI<18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }
        else{
            System.out.print("You are within the ideal weight range.");
        }
    }
}

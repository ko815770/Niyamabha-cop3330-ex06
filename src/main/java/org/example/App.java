package org.example;
import java.util.Calendar;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        int year, age, retireage, yearleft;
        System.out.println("What is your age?");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("At what age would you like to retire?");
        retireage = input.nextInt();
        yearleft = retireage - age;
        System.out.println("You have " + yearleft + " years left until you can retire.");
        System.out.println("It is " + year + ", so you can retire in " + (year + yearleft) + ".");
    }
}

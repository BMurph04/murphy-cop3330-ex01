/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        System.out.println( "What is your name?");

        Scanner input = new Scanner(System.in);
        String nameInput = input.next();
        String greetingOutput = "Hello " + nameInput + ", nice to meet you!";
        System.out.println(greetingOutput);
    }
}

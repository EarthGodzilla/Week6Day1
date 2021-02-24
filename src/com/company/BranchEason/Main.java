package com.company.BranchEason;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner inputNumberOne=new Scanner(System.in);
    try {
        System.out.println("Please enter the first number");
        int number = inputNumberOne.nextInt();

        System.out.println("PLease enter the second number");
        int number2 = inputNumberOne.nextInt();

        add(number, number2);
        divide(number, number2);
    }
    catch(ArithmeticException e){
        System.out.println("sorry I cant Divide by zero");
    }

    catch(InputMismatchException e){
        System.out.println("I am sorry But that is the incorrect data type "+ e.getMessage());
    }

    catch(Exception e){
        System.out.println("Something went wrong");
        }
    }


    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void divide(int a,int b){
        System.out.println(a/b);
    }











}

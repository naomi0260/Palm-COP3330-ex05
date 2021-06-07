package ex05;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */

import javax.swing.*;
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        App newApp = new App();

        System.out.print("What is the first number?: ");
        String firstStr = input.nextLine();

        System.out.print("What is the second number?: ");
        String secondStr = input.nextLine();

        int firstNum = Integer.parseInt(firstStr);
        int secondNum = Integer.parseInt(secondStr);

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum / secondNum;

        String outPut = newApp.outPut(sum, difference, product, quotient, firstNum, secondNum);

        System.out.println(outPut);


    }

    private String outPut(int sum, int difference, int product, int quotient, int num1, int num2){
        return "" + num1 + " + " + num2 + " = " + sum + "\n"  + num1 + " - " + num2 + " = " + difference + "\n" + num1 + " * " + num2 + " = " + product + "\n"  + num1 + " / " + num2 + " = " + quotient + "\n";

    }

}

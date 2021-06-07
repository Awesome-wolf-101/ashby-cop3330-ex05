/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Scanner;

public class APP {

    public static void main(String[] args){
        System.out.println("What is the first number?");
        Scanner sc = new Scanner(System.in);
        String NumberOne = sc.nextLine();
        System.out.println("What is the second number?");
        String NumberTwo = sc.nextLine();
        int FirstNumber = Integer.parseInt(NumberOne);
        int SecondNumber = Integer.parseInt(NumberTwo);
        int AdditionResult = SecondNumber + FirstNumber;
        int SubtractionResult = FirstNumber - SecondNumber;
        int MultiplicationResult = FirstNumber * SecondNumber;
        int DivisionResult = FirstNumber / SecondNumber;

        System.out.println(NumberOne + " + " + NumberTwo + " = " + AdditionResult + "\n" + NumberOne + " - " + NumberTwo + " = " + SubtractionResult + "\n" + NumberOne + " * " + NumberTwo + " = " + MultiplicationResult + "\n" + NumberOne + " / " + NumberTwo + " = " + DivisionResult);



    }
}

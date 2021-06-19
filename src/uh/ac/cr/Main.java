package uh.ac.cr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IterativeControl call = new IterativeControl();

        System.out.println("Hello user this is a program to print Hello World many time as you want");

        Scanner entry = new Scanner(System.in);

        System.out.println("Please enter how many times you want to print Hello World");
        int cant = entry.nextInt();
        call.Hello(cant);

        //commit date: 06/18/21
    }
}

//TODO- Create a new class and call it IterativeControl.

//Do the next operation on the new class created.

//1- Todo. Ask user how many time he wants to print hello world on screen.
//1.1- Todo. Print Hello world as many times as user defined. Use a while structure.
//1.2- Todo. Print Hello world as many times as user defined. Use a for structure.

//2- Todo Print hello world and ask the user if he wants to print hello again using a Do while structure.

//3- Todo ask the user if he wants to print hello using a while structure to keep printing until user wants to stop.

//Do all the code needed for the previous items on the class created. Use main just to call the methods.

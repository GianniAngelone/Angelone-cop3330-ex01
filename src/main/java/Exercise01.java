/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;
class Exercise1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine(); //Reads the next line (NAME) input.
        System.out.println(String.format("Hello, %s, nice to meet you!",name));
    }
}


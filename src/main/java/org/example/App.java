package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.print("What is the quote? ");
        Scanner scan = new Scanner(System.in);
        String quote = scan.nextLine();
        System.out.print("Who said it? ");
        String author = scan.nextLine();

        System.out.printf(author + " says, \"%s\" ", quote);


    }
}

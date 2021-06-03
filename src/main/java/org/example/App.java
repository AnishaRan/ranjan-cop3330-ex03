package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.printf("What is the quote? ");
        Scanner scan = new Scanner(System.in);
        String quote = scan.nextLine();
        System.out.printf("Who said it? ");
        String author = scan.nextLine();

        System.out.printf(author + " says, \"%s\" ", quote);


    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String quote = getQuote();
        String person = getPerson();
        String output = concatQuote(person, quote);
        printQuote(output);
    }
    public static String getQuote()
    {
        System.out.println( "What is the quote?" );
        String quote = in.nextLine();
        return quote;
    }

    public static String getPerson()
    {
        System.out.println( "Who said it?" );
        String person = in.nextLine();
        return person;
    }

    public static String concatQuote(String person, String quote)
    {
        return person + " says, \"" + quote + "\"";
    }

    public static void printQuote(String output)
    {
        System.out.print( output );
    }
}
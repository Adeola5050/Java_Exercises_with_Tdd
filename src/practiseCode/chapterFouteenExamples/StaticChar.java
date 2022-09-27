package practiseCode.chapterFouteenExamples;

import java.util.Scanner;

public class StaticChar {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any character of your choice: ");
        String input= scan.next();
        char g= input.charAt(0);
        System.out.printf("is defined: %b%n", Character.isDefined(g));
        System.out.printf("is digit: %b%n", Character.isDigit(g));
        System.out.printf("is first character in a java identifier: %b%n", Character.isJavaIdentifierStart(g));
        System.out.printf("is part of a java identifier: %b%n", Character.isJavaIdentifierPart(g));
        System.out.printf("is letter: %b%n", Character.isLetter(g));
        System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(g));
        System.out.printf("is lower case: %b%n", Character.isLowerCase(g));
        System.out.printf("is upper case: %b%n", Character.isUpperCase(g));
        System.out.printf("to lower case: %s%n", Character.toLowerCase(g));
        System.out.printf("to upper case: %s%n", Character.toUpperCase(g));








    }
}

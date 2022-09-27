package practiseCode.chapterFouteenExamples;

import java.util.Scanner;

public class StaticCharMethod {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Radix: ");

        int radix= scan.nextInt();

        System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n","Convert digit to character", "Covert character to digit");
        int choice= scan.nextInt();

        switch (choice){
            case  1:
                System.out.println("Enter a digit: ");
                int digit = scan.nextInt();
                System.out.printf("Convert digit to character: %s%n",
                        Character.forDigit(digit,radix));
                break;
            case 2:
                System.out.println("Enter a character");
                char character= scan.next().charAt(0);
                System.out.printf("Convert character to digit: %s%n",
                        Character.digit(character
                        ,radix));
                break;
        }
    }
}

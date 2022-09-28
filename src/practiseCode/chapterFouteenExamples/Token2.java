package practiseCode.chapterFouteenExamples;

import java.util.Scanner;

public class Token2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of your choice and press enter: ");
        String sentence= scanner.nextLine();

        String [] tokens= sentence.split(" ");

        System.out.printf("Number of elements: %d%nThe tokens are: %n", tokens.length);

        for (String token: tokens){
            System.out.println(token);
        }

    }
}

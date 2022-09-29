package chapterFourteen;

import java.util.Scanner;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the phone number");

        String phoneNumber= scanner.nextLine();
        String tokens=phoneNumber.replaceFirst(" ","-");
//        for (String token:tokens){
            System.out.println(tokens);
//        }
    }
}

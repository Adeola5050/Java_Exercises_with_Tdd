package chapterFourteen;

//14.3

public class Palindrome {

    public static void main(String[] args) {

        String word ="madam";
        String string= "balloon";

        System.out.println(word);
        System.out.printf("The reversed word of madam= %s%n", word);
        for (int count = word.length()-1; count >=0; count--) {
            System.out.printf("%c :", word.charAt(count));

        }
        System.out.println();
            System.out.println(string);
            System.out.printf("The reversed word of balloon= %s%n", word);
            for (int count = string.length()-1; count >=0; count--) {
                System.out.printf("%c :", string.charAt(count));

            }
    }
}

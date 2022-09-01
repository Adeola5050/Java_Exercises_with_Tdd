package practiseCode.chapterFouteenExamples;

public class ReversedString {
    public static void main(String[] args) {
        String word= "Hello There";

        char[] charArray= new char[5];

        System.out.printf(" word: %s", word);
        System.out.printf("%nThe length of word is: %d", word.length());

//        reversed word
        System.out.printf("%nThe reversed word is: ");
        for (int count = word.length()-1; count >= 0 ; count--) {
            System.out.printf("%c", word.charAt(count));

        }
        word.getChars(0,5, charArray,0);
        System.out.printf("%nThe character of the array is : ");

          for (char character: charArray){
            System.out.print(character);
        }
        System.out.println();
    }
}

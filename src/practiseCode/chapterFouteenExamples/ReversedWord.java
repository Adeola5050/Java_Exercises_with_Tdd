package practiseCode.chapterFouteenExamples;

public class ReversedWord {

    public static void main(String[] args) {

        String word= "Good morning";
        char[] charArray= new char[4];

        System.out.printf("word: %s", word);
        System.out.printf("%nLength of word is: %d", word.length());


//        for reversed word;
        System.out.printf("%nThe Word reversed is: ");

        for (int count = word.length()-1; count >=0 ; count--) {
            System.out.printf("%c: ", word.charAt(count));
        }
            word.getChars(0,4,charArray,0);
            System.out.printf("%nThe character array is: ");

            for (char character: charArray){
                System.out.println(character);
            }
             System.out.println();

        }



    }

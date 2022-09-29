package chapterFourteen;

public class WordsReversed {
    public static void main(String[] args) {
        String words= "Hallow be thy name";
        System.out.printf("The original words is %s%n",words);
        String [] tokens=words.split(" ");

        for (String token: tokens){
        System.out.println(token);
    }

        for (int count = words.length()-1; count >=0 ; count--) {
            System.out.printf("%c: ", words.charAt(count));

        }
    }
}

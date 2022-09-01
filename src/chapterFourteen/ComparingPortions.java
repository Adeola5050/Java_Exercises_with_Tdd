package chapterFourteen;

//14.4
public class ComparingPortions {
    public static void main(String[] args) {

        String word = "";
        String word1 = "great";
        String word2 = "GREAT";

        System.out.printf("word=  %s%nword1=  %s%nword2=  %s%n%n", word, word1, word2);


        if (word1.regionMatches(0, word2, 0, 5)) {
            System.out.println("The five characters of word1 and word2 matches");
        } else {
            System.out.println("The five characters of word1 and word2 does not match");
        }
        System.out.println("======================================================");
        if (word1.regionMatches(true, 0, word2, 0, 5)) {
            System.out.println("The five characters of word1 and word2 matches with case ignored");
        } else {
            System.out.println("The five characters of word1 and word2 does not matches with case ignored");
        }

        System.out.println("====================================================");

        if (word1.equalsIgnoreCase(word2)) {
            System.out.printf("%s equals %s with case ignored%n", word1, word2);
        } else {
            System.out.println("s3 does not equal s4");
        }
        System.out.printf("%nword.compareTo(word1) is %d", word.compareTo(word1));
        System.out.printf("%nword1.compareTo(word2) is %d", word1.compareTo(word2));
        System.out.printf("%nword.compareTo(word) is %d", word.compareTo(word));
        System.out.printf("%nword.compareTo(word2) is %d", word.compareTo(word2));
    }
}
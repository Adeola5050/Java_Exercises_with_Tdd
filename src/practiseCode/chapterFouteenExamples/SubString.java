package practiseCode.chapterFouteenExamples;

public class SubString {
    public static void main(String[] args) {

        String letters="lifeimprisonmentoflaying";

        System.out.printf("Substring fom index 16 to end is \"%s\"%n", letters.substring(16));
        System.out.printf("%s\"%s\"%n"," SubString from index 6 but not including, 12  is", letters.substring(6,12));
    }
}

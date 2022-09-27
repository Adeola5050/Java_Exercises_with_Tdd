package practiseCode.chapterFouteenExamples;

public class StringIndexMethods {

    public static void main(String[] args) {

        String letters= "abcdefghiabcdefghiabcdefghijklm";
        System.out.println(letters.indexOf('c'));
        System.out.println(letters.indexOf('a',1));


        System.out.println(letters.indexOf('$'));
        System.out.println(letters.indexOf('a',25));

        System.out.printf("The last \"def\" is located at index %d%n", letters.indexOf("def"));

    }
}

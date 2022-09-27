package practiseCode.chapterFouteenExamples;

public class StringBuilderAppend2 {

    public static void main(String[] args) {
        String s1= "Baffle";
        String s2= "Mighty";
        int c= 568;

        String buffer= new StringBuilder()
                .append("Baffle")
                .append("Mighty")
                .append(568).toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c);


        System.out.printf("The word concatenated is = %s%n%n", buffer);
    }
}

package practiseCode.chapterFouteenExamples;

public class CharMethod {

    public static void main(String[] args) {
        Character c1='R';
        Character c2= 'r';
        System.out.printf("c1= %s%nc2 =%s%n%n", c1.charValue(),c2.toString());

        if(c1.equals(c2)){
            System.out.println("c1 and c2 are equal");
        }
        else {
            System.out.println("c1 and c2 are not equal");
        }
    }
}

package practiseCode.chapterFouteenExamples;

public class StringValueOf {

    public static void main(String[] args) {
        char[] charArray= {'a', 'b','c', 'd', 'e', 'f'};
        boolean booleanValue= true;
        char characterValue='Z';
        int integerValue= 9;
        long longValue= 20000000000L;
        float floatValue=3.6F;
        double doubleValue=33.333;
        Object objectRef="Daytime";

        System.out.printf("CharArray is = %s%n",String.valueOf(charArray));
        System.out.printf("part of charArray is = %s%n", String.valueOf(charArray,3,3));

        System.out.printf("Boolean value is = %s%n", String.valueOf(booleanValue));

        System.out.printf("The value of character is = %s%n", String.valueOf(characterValue));

        System.out.printf("The value of integer is = %s%n", String.valueOf(integerValue));
        System.out.printf("The value of long is = %s%n", String.valueOf(longValue));

        System.out.printf("The value of float is = %s%n", String.valueOf(floatValue));
        System.out.printf("The value of double is = %s%n", String.valueOf(doubleValue));
        System.out.printf("The object value is = %s%n ", String.valueOf(objectRef));

    }
}

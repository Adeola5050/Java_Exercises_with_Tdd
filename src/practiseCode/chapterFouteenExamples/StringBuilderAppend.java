package practiseCode.chapterFouteenExamples;


public class StringBuilderAppend {
    public static void main(String[] args) {
        Object objectRef = "Daytime";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 9;
        long longValue = 20000000000L;
        float floatValue = 3.6F;
        double doubleValue = 33.333;

        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();

        buffer.append(objectRef)
                .append(System.getProperty("line.separator"))
                .append(string)
                .append(System.getProperty("line.separator"))
                .append(charArray,0,3)
                .append(System.getProperty("line.separator"))
                .append(booleanValue)
                .append(System.getProperty("line.separator"))
                .append(characterValue)
                .append(System.getProperty("line.separator"))
                .append(integerValue)
                .append(System.getProperty("line.separator"))
                .append(longValue)
                .append(System.getProperty("line.separator"))
                .append(floatValue)
                .append(System.getProperty("line.separator"))
                .append(doubleValue)
                .append(System.getProperty("line.separator"))
                .append(lastBuffer);

        System.out.printf("buffer contains%n%s%n", buffer.toString());

    }
}

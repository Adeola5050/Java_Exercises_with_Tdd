package practiseCode.chapterFouteenExamples;

public class StringBuilderCapLen {

    public static void main(String[] args) {

        StringBuilder buffer= new StringBuilder("Way to, forward the success ");

        System.out.printf("buffer = %s%nlength= %d%ncapacity= %d%n%n",
                buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(80);
        System.out.printf("New Capacity = %d%n%n", buffer.capacity());

        buffer.setLength(20);
        System.out.printf("New length= %d%nbuffer =%s%n",
                buffer.length(), buffer.toString());
    }

}

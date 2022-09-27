package practiseCode.chapterFouteenExamples;

public class StringBuildersChars {

    public static void main(String[] args) {

//        constructor

        StringBuilder buffer= new StringBuilder("great nation");
//        execution of the words

        System.out.printf("buffer= %s%n", buffer.toString());

//        charAt to print particular index

        System.out.printf("Character at 0: %s%nChaacter at 4: %s%n%n",
                buffer.charAt(0), buffer.charAt(4));

//        to get the length of the characters
        char[] charArray= new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray,0);
        System.out.printf("The characters are: ");
//    looping

        for(char character: charArray){
            System.out.print(character);
        }

        buffer.setCharAt(0,'G');
        buffer.setCharAt(6,'N');
        System.out.printf("%n%nbuffer =%s",buffer.toString());

        buffer.reverse();
        System.out.printf("%n%nbuffer = %s%n",buffer.toString());
    }
}

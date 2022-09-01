package practiseCode.chapterFouteenExamples;

public class StringStartEnd {

    public static void main(String[] args) {

        String[] strings= {"started","Starting", "ended", "ending"};

//                test method to start with
               for (String string: strings){
                   if (string.startsWith("st")){
                       System.out.printf("\"%s\",starts with\"st\"%n", string);
                   }
               }
//      test method to start with and a position

            for(String string: strings){
                if(string.startsWith("art",2)){
                    System.out.printf("\"%s\", start with\"art\" at position 2 %n", string);
                }
            }

            for (String string: strings){
                if(string.endsWith("ed")){
                    System.out.printf("\"%s\", ends with \"ed\" %n", string);
                }
            }
    }
}

package practiseCode.chapterFouteenExamples;

public class WordStartEnd {

    public static void main(String[] args) {
         String [] words= {"layer", "layered", "loyal", "royal"};


         for (String word: words){
             if(word.startsWith("la")){
                 System.out.printf("\"%s\" starts with \"la\" %n", word);
             }
         }
           for (String word: words){
               if(word.startsWith("ye",2)){
                System.out.printf("\"%s\" starts with \"ye\" at position 2%n", word);
            }
        }
        for (String word: words){
            if(word.endsWith("yal")){
                System.out.printf("\"%s\" ends with \"yal\" %n", word);
            }
        }


    }
}

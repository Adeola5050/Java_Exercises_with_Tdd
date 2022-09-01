package practiseCode.chapterFouteenExamples;

public class StringVarieties {

    public static void main(String[] args) {

        String greeting= "hello";
        String name= "james";
        String skill= "  Java developer";


        System.out.printf("greeting=  %s%nname = %s%nskill= %s%n%n", greeting,name,skill);

        System.out.println(greeting.replace("h", "H"));
        System.out.println(name.replace("j","J"));
        System.out.println(skill.replace("d", "D"));
        System.out.println();


        System.out.printf("greeting.toLowerCase()= %s%n",greeting.toLowerCase());
        System.out.printf("name.toUpperCase()= %s%n",name.toUpperCase());
        System.out.printf("skill.toUpperCase()=  %s%n",skill.toUpperCase());

        System.out.printf("skill is trim as = %s%n",skill.trim());


        char [] charArray= skill.toCharArray();
        System.out.print("skill as a character array = ");

        for (char character: charArray){
            System.out.print(character);
        }
        System.out.println();
         System.out.print(greeting +" ".concat(name));
        System.out.println();
    }
}

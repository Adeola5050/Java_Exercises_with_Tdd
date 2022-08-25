package chapterSeven;

public class SumUsingEnhancedForLoop {

    public static void main(String[] args) {

        int [] numbers={5,4,5,6,8,1,2,3};
        int sum=0;

        for (int number: numbers){
            sum +=number;
        }
        System.out.println("Sum = " +sum);
    }
}

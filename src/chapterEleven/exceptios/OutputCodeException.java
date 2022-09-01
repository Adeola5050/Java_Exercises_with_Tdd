package chapterEleven.exceptios;

public class OutputCodeException {

    public static void main(String[] args) {

        try {
            String name=null;
            System.out.printf("The length of the string is -%d", name.length());
        } catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        } catch (RuntimeException e){
            System.out.printf("Runtime Exception");
        }
    }
}

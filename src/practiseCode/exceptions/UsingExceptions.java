package practiseCode.exceptions;

public class UsingExceptions {

    public static void main(String[] args) {
        try{
            throwException();
        }
        catch (Exception exception){
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }

    public static void throwException() throws Exception {
        try{
            System.out.println("Method throwException");
            throw new Exception();
        }
        catch (Exception exception){
            System.err.println("Exception Handled in Method ThrowException");
            throw exception;
        }

        finally {
            System.err.println("Finally executed in throwException");
        }
    }
    public static void doesNotThrowException(){
        try {
            System.out.println("Method doesNotThrowException");
        }
        catch (Exception exception){
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }

}

package practiseCode;

public class TwoDimensional {

    private static int[][] table;

    public static void main(String[] args) {
        int[][] array= new int[5][6];


        System.out.println("Initialised Two dimensional Array");

        for (int col = 0; col < 6; col++) {
            for (int row = 0; row < 5; row++) {
               table[row][col]=1;

                System.out.println(array);

                System.out.println(table);
            }
            System.out.println();
            
        }
    }



}

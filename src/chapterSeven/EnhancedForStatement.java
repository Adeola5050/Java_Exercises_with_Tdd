package chapterSeven;

public class EnhancedForStatement {

    private int number;

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8, 9, 0,6, 9, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void setNumber() {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
}


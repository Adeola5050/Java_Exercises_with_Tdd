package chapterFive;

public class Extreme {
    private int number;
    private int minimum;
    private int maximum;

    public void setNumber(int number) {
        this.number=number;
    }

    public int calculateMinimum() {
       return number/minimum;
    }

    public int getNumber() {
        return number;
    }

    public void setMinimum(int minimum) {
        this.minimum=minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum= maximum;
    }

    public int calculateMaximum() {
       return number/maximum;
    }
}

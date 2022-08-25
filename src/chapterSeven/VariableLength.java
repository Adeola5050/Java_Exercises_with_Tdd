package chapterSeven;

public class VariableLength {

    private int argumentList;
    private int average;
    public void setArgumentList(int argumentList) {

        this.argumentList=argumentList;
    }

    public void setAverage(int average) {
        this.average=average;
    }

    public int calculateAverage() {
        return argumentList/ average;
    }

    public int getArgumentList() {
        return argumentList;
    }

    public int getAverage() {
        return average;
    }
}

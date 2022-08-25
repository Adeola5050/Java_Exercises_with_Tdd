package chapterFour;

public class Comparator {

    private int firstInteger;
    private int secondInteger;
    int largest= 1;
    public void setFirstInteger() {
    }

    public void setSecondInteger() {
    }

    public int getFirstInteger() {
        return firstInteger;
    }

    public int getSecondInteger() {
        return secondInteger;
    }

    public void setFirstInteger(int firstInteger) {
        this.firstInteger=firstInteger;
    }

    public void setSecondInteger(int secondInteger) {
        this.secondInteger=secondInteger;
    }

    public int getLargestInteger() {
        if(firstInteger % secondInteger !=0){
            return largest;
        }
        return largest;
    }

}

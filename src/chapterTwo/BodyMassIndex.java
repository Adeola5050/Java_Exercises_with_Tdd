package chapterTwo;

public class BodyMassIndex {
    private int weight;
    private int height;

    public void setWeight(int weight) {
        this.weight=weight;
    }

    public int calculateWeight() {
        return 20;
    }

    public void setHeight(int height) {
        this.height= height;

    }

    public int calculateHeight() {
        return 5;
    }

    public int calculateBodyMassIndex() {

        return weight / (height *height);
    }

}

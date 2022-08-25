package chapterNine.fruits;

// 9.10

public class Fruit {
    private String shape;
    private String color;
    private int calories;
    public Fruit(String shape, String color, int calories) {
        this.shape = shape;
        this.color = color;
        this.calories=calories;
    }


    public void setShape(String shape) {
        this.shape=shape;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void setCalories(int calories) {
        this.calories=calories;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public int getCalories() {
        return calories;
    }
}

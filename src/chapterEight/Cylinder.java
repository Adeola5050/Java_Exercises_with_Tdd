package chapterEight;

public class Cylinder {

    private double radius;
    private int height;


    public void setRadius(int radius) {
        if(radius < 1) throw new ArithmeticException("Radius cannot be less Than 1");
        this.radius = radius;
    }

    public void setHeight(int height) {
        if(height < 1) throw new ArithmeticException("Height cannot be less than 1");
        this.height = height;
    }

    public double calculateVolume() {
        return 3.142 * Math.pow(radius,2)* 2;     }

    public double getRadius() {
        return radius;
    }

    public int getHeight() {

        return height;
    }
}



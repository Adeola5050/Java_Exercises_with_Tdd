package chapterTwo;

public class CircleComputation {
    private double radius;

    public void setRadius(int radius) {
        if (radius < 1) throw new ArithmeticException("Radius cannot be less than 1");
        this.radius = radius;
    }

    public double calculateArea() {
        //#r2
        return 3.142 * Math.pow(radius, 2);
    }

    public double calculateDiameter() {

        //#2r
        return 2 * radius;
    }

    public double calculateCircumference() {
        //2#r
        return 2* 3.142 * radius;
    }
}

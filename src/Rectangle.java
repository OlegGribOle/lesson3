import static java.lang.Math.pow;

public class Rectangle {
    public static String fillColor = "Blue";
    public static String borderColor = "Black";
    public static double sideA = 10;
    public static double sideB = 5;
    public Rectangle(){};

    public String fillColor() {
        return fillColor;
    }

    public String borderColor() {
        return borderColor;
    }

    public double perimeter() {
        double perimeterRectangle=2*(sideA*sideB);
        return perimeterRectangle;
    }

    public double area() {
        double areaRectangle=sideA*sideB;
        return areaRectangle;
    }
}

import static java.lang.Math.pow;

public class Circle implements Task2{
    public static String fillColor = "Green";
    public static String borderColor = "Red";
    public static double radius = 10;
    public Circle(){

    };

    public String fillColor() {
        return fillColor;
    }

    public String borderColor() {
        return borderColor;
    }

    public double perimeter() {
        double perimeterCircle=2*Math.PI*radius;
        return perimeterCircle;
    }

    public double area() {
        double areaCircle=2*Math.PI*pow(radius,2);
        return areaCircle;
    }

}

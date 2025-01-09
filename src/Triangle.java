public class Triangle implements Task2 {
    public static String fillColor = "Brown";
    public static String borderColor = "Gray";
    public static double sideA = 3;
    public static double sideB = 4;
    public static double sideC = 5;
    public static double heightA = 5;
    public Triangle(){};

    public String fillColor() {
        return fillColor;
    }

    public String borderColor() {
        return borderColor;
    }

    public double perimeter() {
        double perimeterTriangle=sideA+sideB+sideC;
        return perimeterTriangle;
    }

    public double area() {
        double areaTriangle=sideA*heightA/2;
        return areaTriangle;
    }
}

public interface Task2 {

    default public String fillColor(String fillColor){
        return fillColor;
    }

    default public String borderColor(String borderColor){
        return borderColor;
    }
    default public double perimeter(double sideA, double sideB){
        double perimeter=2*(sideA*sideB);
        return perimeter;
    }
    default public double area(double sideA, double sideB){
        double area=sideA*sideB;
        return area;

    }

}

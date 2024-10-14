import java.util.Scanner;

public class circle {

    // calculate the area nad circumference of a circle for a given radius using Math.PI
    double radiusInMm;

     circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return 2 * radiusInMm * Math.PI;
    }

    double getArea(){
        return  Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle properties:  Radius in mm: " + radiusInMm + " ,Circumference in mm: " + getCircumference() +
                " ,Area in mm2: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle");
        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();

        circle circle = new circle(radius);
        System.out.println(circle);
    }
}

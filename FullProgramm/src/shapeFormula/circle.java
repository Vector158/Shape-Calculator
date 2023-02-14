package shapeFormula;

import java.util.Scanner;

public class circle {
    private double radius;
    static double pi = 3.14;

    public circle(double radius) {this.radius = radius;}

    public double getPerimeter() {
        double result = 2 * radius * pi;
        return result;
    }

    public double getArea() {
        double area = pi*(radius*radius);
        return area;
    }

    public static void circleMenu(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the radius of this circle: ");
        double radius = userInput.nextDouble();

        circle circle = new circle(radius);
        double perimeter = circle.getPerimeter();
        double area = circle.getArea();

        System.out.println("The perimeter of this circle is " +perimeter +" and the area of this circle is " +area);

    }




    // all getters will be generated here.


    public double getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }
}
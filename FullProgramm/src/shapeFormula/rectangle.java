package shapeFormula;

import java.util.Scanner;

public class rectangle {

    double length,width;

    public rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }

    public static void rectangleMenu(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = userInput.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        double width = userInput.nextDouble();

        rectangle rectangle = new rectangle(length,width);
        double perimeter = rectangle.getPerimeter();
        double area = rectangle.getArea();

        System.out.println("The perimeter of this rectangle is " +perimeter +" and area of this rectangle is " +area);
    }




    //all getters are below this


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

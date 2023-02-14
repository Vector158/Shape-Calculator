    package shapeFormula;

    import listOfShapes.ShapesList;

    import java.util.ArrayList;
    import java.util.Scanner;
    import static java.lang.Math.sqrt;

    public class triangle {
        private double side;

        public triangle(double side){
            this.side = side;
        }
        public double getPerimeter(){
            double perimeter = side * 3;
            return perimeter;
        }

        public double getArea(){
            double area = (sqrt(3)/4) * (side * side);
            return area;
        }


        public static void triangleMenu() {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter the length of one side of a 60° triangle: ");
            double side = userInput.nextDouble();

            triangle triangle = new triangle(side);
            double perimeter = triangle.getPerimeter();
            double area = triangle.getArea();
            System.out.println("The perimeter of this triangle is " +perimeter +" and the area is " +area);




        }





        // all getters are below this


        public double getSide() {
            return side;
        }
    }

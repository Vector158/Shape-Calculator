package UserInterfaceMenu;

import shapeFormula.circle;
import shapeFormula.rectangle;
import shapeFormula.triangle;

import java.util.Scanner;

public class addShapeMenu {
    public static void showAddShapeMenu() {
        Scanner userInput = new Scanner(System.in);
        int choice;

        do {

            System.out.println("-----Add shape-----");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.print("Enter your choice: ");

            choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    triangle.triangleMenu();
                    break;
                case 2:
                    rectangle.rectangleMenu();
                    break;
                case 3:
                    circle.circleMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again: ");
            }
        } while (choice != 0);
        userInput.close();
    }
}
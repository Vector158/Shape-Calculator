package UserInterfaceMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class mainMenu {

    public static void userMenu() {
        Scanner userInput = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- Menu ------");
            System.out.println("1. Add shape");
            System.out.println("2. See all shapes, there perimeters and volumes.");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = userInput.nextInt();

            switch (choice){
                case 1:
                    addShapeMenu.showAddShapeMenu();
                    break;
                case 2:
                    System.out.println("See all shapes, perimeters and volumes.");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again: ");
            }
        }while(choice != 0);
        userInput.close();
    }
}

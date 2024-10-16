package Task;

import java.util.Scanner;

public class Task014_23Sep_type2 {
    public static void main(String[] args) {
        // Create a simple calculator that performs addition, subtraction,
        // multiplication, and division, modus based on user input using switch statements.
        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.

        int operation = 1;
        int Num1;
        int Num2;


        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the Option 1: Addtion, 2:Substraction, 3:Multiplication, 4:Division ");
        operation = SC.nextInt();

        System.out.println("Enter the Number 1");
        Num1 = SC.nextInt();

        System.out.println("Enter the Number 2");
        Num2 = SC.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Addition of num 1 + num 2 is:" + (Num1 + Num2));
                break;
            case 2:
                System.out.println("Subtraction of num 1 - num 2 is:" + (Num1 - Num2));
                break;
            case 3:
                System.out.println("Multiplication of num 1 * num 2 is:" + (Num1 * Num2));
                break;
            case 4:
                System.out.println("Division of num 1 / num 2 is:" + (Num1 / Num2));
                break;
            case 5:
                System.out.println("Modulus of num 1 % num 2 is:" + (Num1 % Num2));
                break;
            default:
                System.out.println("Nothing wrong entry");
        }

    }
}

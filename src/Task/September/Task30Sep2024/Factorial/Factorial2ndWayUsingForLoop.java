package Task.September.Task30Sep2024.Factorial;

import java.util.Scanner;

public class Factorial2ndWayUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        //Declare and Initialize the variable
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of the number: " + fact);
    }
}

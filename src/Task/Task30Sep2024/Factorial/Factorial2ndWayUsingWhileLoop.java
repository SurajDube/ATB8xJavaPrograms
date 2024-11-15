package Task.Task30Sep2024.Factorial;

import java.util.Scanner;

public class Factorial2ndWayUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        //Declare and Initialize the variable
        int num = sc.nextInt();
        int i = 1, fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the number: " + fact);
    }
}

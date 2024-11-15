package Task.Task30Sep2024.PrimeNumber;

import java.util.Scanner;

public class usingForLoop {
    // Program to find prime number in Java using recursion

    static int i = 2;

    public static void main(String[] args) {
        //Take input from the user
        //Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (checkPrime(num)) {
            System.out.print(num + " is a prime number ");
        } else {
            System.out.println(num + " is not a prime number ");
        }
    }
    static boolean checkPrime(int num) {
        // Corner cases
        if (num == 0 || num == 1) {
            return false;
        }
        // Checking Prime
        if (num == i)
            return true;
        // Base cases
        if (num % i == 0) {
            return false;
        }
        i++;
        return checkPrime(num);
    }
}
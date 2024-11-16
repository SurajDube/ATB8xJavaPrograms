package Task.September.Task30Sep2024.PrimeNumber;

import java.util.Scanner;

public class usingIfElse {
    public static void main(String[] args) {
        // 1st step is taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int num = sc.nextInt();
        int temp = num / 2, flag = 0;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i <= temp; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " is a prime number");
            }
        }

    }
}

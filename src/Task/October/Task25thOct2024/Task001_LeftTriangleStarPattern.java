package Task.October.Task25thOct2024;

import java.util.Scanner;

public class Task001_LeftTriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number : ");
        int n = sc.nextInt();
        for (int i = n; i > 0 ; i--) {  //printing rows
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

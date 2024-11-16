package Task.October.Task18thOct2024;

import java.util.Scanner;

public class Task001_Length_String {
    public static void main(String[] args) {
        //String str = "Hello world";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string for counting the length: ");
        String st = sc.next();
        int length = 0;

        for (char c : st.toCharArray()) {
            length++;
        }
        System.out.println("Length of string " + st + " is:" + length);
    }
}

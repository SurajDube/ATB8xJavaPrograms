package Task;

public class Task017_25Sep_usingFormatting {
    public static void main(String[] args) {
        // Table of number n = 10, print table with For or while.

        /*int n = 10, result;

        for (int i = 1; i <= 10; i++) {   //using for loop
            result = i * n;
            System.out.println(result);
        }*/

//while  loop
        int i = 1,n=10;
        while (i<=10){
            System.out.println(n*i);
            i++;
        }
    }
}
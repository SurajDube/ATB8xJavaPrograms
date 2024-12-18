package Task.September.Task30Sep2024.Factorial;

public class FactorialUsingFunctionCall {
    static int factorial(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // calling recursive function
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of the number 5 is: " + factorial(5));
    }
}

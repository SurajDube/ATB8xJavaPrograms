package ex_23Oct2024_ExceptionHandling;

public class Lab154_Arithmetic_finally {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = 10/num;
            System.out.println(num);
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println(e.getMessage()); //  output: / by zero
        } finally {
            System.out.println("I will be always executed.");
        }
    }
}

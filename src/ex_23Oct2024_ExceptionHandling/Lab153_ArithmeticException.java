package ex_23Oct2024_ExceptionHandling;

public class Lab153_ArithmeticException {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = 10/num;
            System.out.println(num);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}

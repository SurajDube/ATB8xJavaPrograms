package ex_23Oct2024_ExceptionHandling;

public class Lab157_Exception {
    public static void main(String[] args) {
      final double pi = 3.14;
      int a = 0;
      try {
          int x = 10 / a ;  //error arithmetic
      } catch (Exception e){
          System.out.println(e.getMessage());
          System.out.println("div by zero");
      }finally {
          System.out.println("always executed.");
      }
    }
}


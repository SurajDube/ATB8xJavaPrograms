package ex_27092024_ControlStatement;

public class Lab113 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0) {     //in while and for loop first check condition
            System.out.println(a);  // in do while first execution then check condition
            a++;
        }
    }
}

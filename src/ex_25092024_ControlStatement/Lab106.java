package ex_25092024_ControlStatement;

public class Lab106 {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if (i == 00000) {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}

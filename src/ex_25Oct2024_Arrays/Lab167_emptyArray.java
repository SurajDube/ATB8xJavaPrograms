package ex_25Oct2024_Arrays;

public class Lab167_emptyArray {
    public static void main(String[] args) {
        int[] empty = {};
        for (int i = 0; i < empty.length ; i++) {
            System.out.println(empty[0]);   // nothing print
            System.out.println(empty.length);   // nothing print
        }
    }
}

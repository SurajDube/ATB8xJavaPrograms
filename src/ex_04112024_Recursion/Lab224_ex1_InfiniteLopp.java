package ex_04112024_Recursion;

public class Lab224_ex1_InfiniteLopp {
    static void print() {
        System.out.println("print");// infinite loop
        print();

    }

    public static void main(String[] args) {
        print();
    }
}
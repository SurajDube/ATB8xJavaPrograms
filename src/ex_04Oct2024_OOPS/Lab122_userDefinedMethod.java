package ex_04Oct2024_OOPS;

public class Lab122_userDefinedMethod {
    public static void main(String[] args)
    {
        int a = 19;
        int b = 5;
//method calling
        int c = add(a, b);   //a and b are actual parameters
        System.out.println("The sum of a and b is= " + c);
    }
    //user defined method
    //he static keyword in Java is used to share the same variable or method of a given class.
    public static int add(int n1, int n2)   //n1 and n2 are formal parameters
    {
        int s;
        s=n1+n2;
        return s; //returning the sum
    }
}

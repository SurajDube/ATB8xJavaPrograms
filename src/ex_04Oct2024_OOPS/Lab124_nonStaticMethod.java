package ex_04Oct2024_OOPS;

public class Lab124_nonStaticMethod
{
    public static void main (String[] args) {

        // Creating object of the class
        Lab124_nonStaticMethod obj = new Lab124_nonStaticMethod();

        // Calling instance method
        obj.disp();

        System.out.println("GFG!");
    }

    // Instance method
    void disp()
    {
        // Local variable
        int a = 20;
        System.out.println(a);
    } }
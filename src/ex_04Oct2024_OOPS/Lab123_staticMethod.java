package ex_04Oct2024_OOPS;

public class Lab123_staticMethod {
    public static void main(String[] args)
    {
        show1();
        Lab123_staticMethod nm = new Lab123_staticMethod();
        nm.show2();

    }
    public static void show1()
    {
        System.out.println("It is an example of static method.");
    }
    public void show2()
    {
        System.out.println("It is an example of non static method.");
    }
}

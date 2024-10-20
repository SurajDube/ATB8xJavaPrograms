package ex_09Oct2024_Inheritance.heirarchicalInheritance.ex3;

public class Lab137 {
    public static void main(String args[])
    {
        ChildClass1 C1 = new ChildClass1();
        ChildClass2 C2 = new ChildClass2();
        ChildClass3 C3 = new ChildClass3();

        System.out.println("PAge * CAge1 = " + C1.PAge * C1.CAge1);
        System.out.println("PAge * CAge2 = " + C2.PAge * C2.CAge2);
        System.out.println("PAge * CAge3 = " + C3.PAge * C3.CAge3);
    }
}

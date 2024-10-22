package ex_09Sep2024_Polymorphism.Upcasting.ex2;
//Creating a child class for parent 'MobileOS'
public class ios extends MobileOS{
    //overriding display method
    void display()
    {
        System.out.println("iOS is a MobileOS.");
    }
}

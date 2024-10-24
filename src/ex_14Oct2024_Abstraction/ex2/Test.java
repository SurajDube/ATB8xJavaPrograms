package ex_14Oct2024_Abstraction.ex2;

public class Test {
    public static void main(String[] arg)
    {
        Calculator add = new Add();
        add.display();

        Calculator sub = new Substraction();
        sub.display();
    }
}

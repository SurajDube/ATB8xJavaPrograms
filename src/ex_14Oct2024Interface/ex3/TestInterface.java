package ex_14Oct2024Interface.ex3;

public class TestInterface {
    public static void main(String[] args){
        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}

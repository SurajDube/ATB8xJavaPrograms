package ex_11Oct2024_Encapsulation.ex2;

public class Test {
    public static void main(String[] args) {

        ATB obj = new ATB();

        // setting values of the variables
        obj.setATBName("Harsh");
        obj.setATBAge(19);
        obj.setATBRoll(51);

        // Displaying values of the variables
        System.out.println("ATB name: " + obj.getATBName());
        System.out.println("ATB age: " + obj.getATBAge());
        System.out.println("ATB roll: " + obj.getATBRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
    }


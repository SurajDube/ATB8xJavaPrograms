package Task.September;

public class Task018_25Sep {
    public static void main(String[] args) {
        //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        //        // n = 1 ->  Fact = 1*1 -> 1
        //        // n = 3 -> Fact = 3*2*1 -> 6

        int fact = 1;
        for (int i = fact; i <= 5; i++) {
            fact = fact * i;

        }System.out.println(fact);

    }
}


package Task;

public class Task023_27Sep {
    public static void main(String[] args) {
        //sum of number from 1 to 100 using a while loop.
        int i = 1, sum = 0;
        /*using while loop
        while(i<=100)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("sum of numbers from 1 to 100 => "+sum);*/

        for (; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

package Task;

import java.util.Scanner;

public class Task019_25Sep {
    public static void main(String[] args) {
        // Prime Number from 1 to 100. (for loop) 0 and 1 is not prime number
        int i,m=0,flag=0;
        Scanner sc = new Scanner(System.in); // define only one time
        System.out.println("Enter n value for check prime or not:");
        int n = sc.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }
        else    {
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    break;
                }
            }   //end of for loop

            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
}

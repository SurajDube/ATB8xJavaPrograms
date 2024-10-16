package Task;

public class Task013_GradeSystem_20Sep {
    public static void main(String[] args) {
        int score = 1050;

        if (score>=95 && score<=100){
            System.out.println("A+");
        }
        else if (score>=90 && score<=94) {
            System.out.println("Grade A");
        }
        else if (score>=85 && score<=89) {
            System.out.println("Grade B+");
        }
        else if (score>=80 && score<=84) {
            System.out.println("Grade B+");
        }
        else if (score>=75 && score<=79) {
            System.out.println("Grade C+");
        }
        else if (score>=70 && score<=74) {
            System.out.println("Grade C");
        }
        else if (score>=65 && score<=69) {
            System.out.println("Grade D+");
        }
        else if (score>=60 && score<=64) {
            System.out.println("Grade D");
        }
        else if (score>=0 && score<=59) {
            System.out.println("Grade F");
        }
        else {
            System.out.println("Please enter valid input");
        }


    }
}

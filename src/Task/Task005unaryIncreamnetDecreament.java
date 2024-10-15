package Task;

public class Task005unaryIncreamnetDecreament {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a--);    //28    9 + 10 + 9
        System.out.println(a);  //9 latest value of a
    }
}

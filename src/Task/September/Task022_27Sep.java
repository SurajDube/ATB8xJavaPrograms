package Task.September;

public class Task022_27Sep {
    public static void main(String[] args) {
        /*for(int i=1;i<=10;i++){
            if(i%2==0){ // using for loop
                System.out.println("even num are " + i);
            }
        }*/

        int i=1;
        do{
            i++;
            if(i%2==0){
                System.out.println(i);
            }
        }while(i<=10);
    }
}

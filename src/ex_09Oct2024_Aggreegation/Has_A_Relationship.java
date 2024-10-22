package ex_09Oct2024_Aggreegation;

public class Has_A_Relationship {

        int square(int n){
            return n*n;
        }
    }

    class Circle{
        Has_A_Relationship op;//aggregation
        double pi=3.14;

        double area(int radius){
            op=new Has_A_Relationship();
            int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).
            return pi*rsquare;
        }

        public static void main(String[] args){
            Circle c=new Circle();
            double result=c.area(5);
            System.out.println(result);
        }
    }
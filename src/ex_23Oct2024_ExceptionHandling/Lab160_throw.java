package ex_23Oct2024_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab160_throw {
    public static void main(String[] args) throws Exception {

        extracted();
    }
    //way 1
    /*private static void extracted() {
        try {
            FileInputStream fi = new FileInputStream("C://ds.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        //way2
        private static void extracted() throws Exception    {
            FileInputStream fi = new FileInputStream("C://ds.txt");
    }
}

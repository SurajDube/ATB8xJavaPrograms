package ex_04Oct_2024_Constructor;

public class Lab128carCO {
    //Constructor Overloading
    public static void main(String[] args) {
        // Creating an object of the Car class
        carPC car1 = new carPC("toyota");
        car1.display(); //method call

        carPC car2 = new carPC("i20", 2021);
        car2.display();
    }
}
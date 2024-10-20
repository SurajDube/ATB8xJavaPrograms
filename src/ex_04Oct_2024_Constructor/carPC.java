package ex_04Oct_2024_Constructor;

public class carPC {
    //parameterised constructor
    String model;
    int year;

    // Parameterized Constructor
    carPC(String model) {
        this.model = model;

    }
    // Parameterized Constructor
    carPC(String model, int year) {
        this.model = model;
        this.year = year;
    }

   void display() {
       System.out.println(model + " " + year);
    }
}

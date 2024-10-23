package ex_04Oct_2024_Constructor;

public class carCO {
    //Constructor overloading: one method with different signature
    String model;
    int year=2012;

    // Default constructor
    carCO() {
        this.year = 2012;
    }
    // Parameterized Constructor
    carCO(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}


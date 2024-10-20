package ex_04Oct_2024_Constructor;

public class Lab129superAnimal {
    // 1) super is used to refer immediate parent class instance variable.
    // We can use super keyword to access the data member or field of parent class.
    // It is used if parent class and child class have same fields.
    String color="white";
}

class Dog1 extends Lab129superAnimal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}

class TestSuper1{
    public static void main(String args[]){
        Dog1 d=new Dog1();
        d.printColor();
    }
}


package ex_11Oct2024_Encapsulation.ex2;

public class ATB {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String Name;
    private int Roll;
    private int Age;

    public String getATBName() {
        return Name;
    }

    public void setATBName(String ATBName) {
        this.Name = ATBName;
    }

    public int getATBRoll() {
        return Roll;
    }

    public void setATBRoll(int ATBRoll) {
        this.Roll = ATBRoll;
    }

    public int getATBAge() {
        return Age;
    }

    public void setATBAge(int ATBAge) {
        this.Age = ATBAge;
    }
}

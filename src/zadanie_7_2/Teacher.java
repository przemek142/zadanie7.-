package zadanie_7_2;

public class Teacher extends Person {
    private double wage;
    private int teachersID;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getTeachersID() {
        return teachersID;
    }

    public void setTeachersID(int teachersID) {
        this.teachersID = teachersID;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Wage: " + wage);
        System.out.println("Teacher's ID:" + teachersID);
    }

    public Teacher(String firstName, String lastName, double wage, int teachersID) {
        super(firstName, lastName);
        this.wage = wage;
        this.teachersID = teachersID;
    }
}

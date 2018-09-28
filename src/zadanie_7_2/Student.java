package zadanie_7_2;

public class Student extends Person {
    private int grade;
    private int studentsID;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(int studentsID) {
        this.studentsID = studentsID;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Grade: " + grade);
        System.out.println("Student's ID:" + studentsID);
    }

    public Student(String firstName, String lastName, int grade, int studentsID) {
        super(firstName, lastName);
        this.grade = grade;
        this.studentsID = studentsID;
    }
}

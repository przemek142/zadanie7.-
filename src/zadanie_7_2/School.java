package zadanie_7_2;

public class School {
    public static void main(String[] args) {
        Student student = new Student("Mike", "Smith", 4, 9854376);
        Teacher teacher = new Teacher("OtherEnglishName", "AlsoSmith", 2323.333, 456789876);

        student.show();
        System.out.println("\n");
        teacher.show();
    }
}

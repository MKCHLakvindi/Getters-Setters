public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Alice");
        student.setAge(18);
        student.setGrade('A');

        System.out.println("Student Information:");
        student.displayInfo();
    }
}
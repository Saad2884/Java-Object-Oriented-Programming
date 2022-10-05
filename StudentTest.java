public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student(22204523,"Saad");
        // some other stuff
        student.setEnrolled();
        // some other stuff
        student.setGrade(Grade.B);
        StudentView.displayDetails(student);
        }
}

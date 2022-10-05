public class StudentView {
    public static void displayDetails (Student student) {
        System.out.println("Name: " + student);
        System.out.println("Number: " + student.getNumber());
        System.out.println("Enrolled: " + student.isEnrolled());
        System.out.println("Grade: " + student.getGrade());
        }
}

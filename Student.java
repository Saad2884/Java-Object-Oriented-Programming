public class Student {
    public final static int MODULES_PER_TRIMESTER = 6;
    private int number;
    private String name;
    private boolean enrolled;
    private Grade grade;

    Student(int number, String name) {
        this.number = number;
        this.name = name;
        enrolled = false;
        grade = Grade.NO_GRADE;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setEnrolled() {
        enrolled = true;
    }

    public void setNotEnrolled() {
        enrolled = false;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public String toString() {
        return name;
    }
}

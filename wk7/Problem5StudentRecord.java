class Student {

    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
}

public class Problem5StudentRecord {

    public static void main(String[] args) {

        Student student = new Student("Aarav", 85);

        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());

        student.setMarks(95);

        System.out.println("Updated Marks: " + student.getMarks());
    }
}
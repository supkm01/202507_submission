package java_practice;

public class Student extends Person implements Runnable {
private String studentId;
    
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    @Override
    public void run() {
        System.out.println(name + " is running.");
    }
    
    public String getStudentId() {
        return studentId;
    }
}

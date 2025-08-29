public class Student {
    String name;
    int rollno;

    private Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public static Student createStudent(String name, int rollno) {
        return new Student(name, rollno);
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
 
    public static void main(String[] args) {
        Student s1 = Student.createStudent("Pinki",101);
        System.out.println(s1.name + " " + s1.rollno);
    }
}
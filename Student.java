public class Student {
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Pinki",101);
        System.out.println(s1.name + " " + s1.rollno);
    }
}
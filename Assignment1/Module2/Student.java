package Assignment1.Module2;

public class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ankita";
        s.marks = 85;
        s.display();
    }
}

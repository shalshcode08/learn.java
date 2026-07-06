/*
- A class is a blueprint/ template, It doesn't consume memory until an object is created from it.
- Contains fields (state), methods (behaviours), constructors, blocks, nested classes.
- Instance members belong to each object seprately, static members belong to the classes and shared across all objects
- Constructors -> special methods, same name as class, no return type. Used to initialize objets.
                    If you dont define one Java provides defaukt no args constructor.
- (this) keyword -> refers to the current obejct used to resolve naming conflicts between fields and parameters, and to 
                    chain constructors.
- Constructor Overloading -> multiple constructors with different parameters lits.

Interview Traps :
    - Is a class an object? -> No class is a type of defination, object is a runtime instance.
    - static block runs once when class is loaded (before main/contructor).
    - you can have a class with only static member(untility code) - makes constructor private.
 */

public class Student {

    // instance varibales (state)
    private String student_name;
    private int roll_number;
    private double student_marks;

    // static varibale - shared across all object
    private static int total_student = 0;
    private static final String SCHOOL_NAME = "ABC HIGHER SCHOOL";

    // static block - runs once when class is loaded
    static {
        System.out.println("Student class loaded, School : " + SCHOOL_NAME);
    }

    // Intance block runs everytime before constructor
    {
        System.out.println("Creating a new Student Object...");
    }

    // Default constructor
    public Student() {
        this("Unkown", 0, 0.0); // constructor chaining using this()
    }

    // paramterized constructor
    public Student(String student_name, int roll_number, double student_marks) {
        this.student_name = student_name;
        this.roll_number = roll_number;
        this.student_marks = student_marks;
        total_student++;
    }

    // constructor Overloading
    public Student(String name, int roll) {
        this(name, roll, 0.0);
    }

    // Instance Method
    public void DisplayInfo() {
        System.out.println("Name : " + student_name + "Roll :" + roll_number + "Marks : " + student_marks);
    }

    // Static method — can only access static data directly
    public static int getTotalNumberOfStudent() {
        return total_student;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aman", 11, 100.0);
        Student s2 = new Student("Ram", 12, 90.9);
        Student s3 = new Student("Sita", 13, 80.8);
        Student s4 = new Student();

        s1.DisplayInfo();
        s2.DisplayInfo();
        s3.DisplayInfo();
        s4.DisplayInfo();

        System.out.println("Total Student Created : " + getTotalNumberOfStudent());
    }
}

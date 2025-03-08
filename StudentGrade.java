// Class to calculate student grade based on marks and display details

import java.util.Scanner;

class Student {
    // Attributes
    private final String name;
    private final int rollNumber;
    private final double marks;
    private char grade;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public void getGrade() {
        if(this.marks>=90){
            this.grade = 'A';
        } else if(this.marks>=80){
            this.grade = 'B';
        } else if(this.marks>=70){
            this.grade = 'C';
        } else if(this.marks>=60){
            this.grade = 'D';
        } else if(this.marks>=50){
            this.grade = 'E';
        } else {
            this.grade = 'F';
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + this.grade);
    }
}

// Main class
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student roll number: ");
        int rollNumber = input.nextInt();

        System.out.print("Enter student marks: ");
        double marks = input.nextDouble();

        // Create student object
        Student student = new Student(name, rollNumber, marks);

        // Calculate grade based on marks
        student.getGrade();

        // Display student details and grade
        System.out.println("Student details: ");
        student.displayDetails();

        input.close();
    }
}
// Sample Input ->
// Enter student name: John Doe
// Enter student roll number: 101
// Enter student marks: 85

// Sample Output ->
// Student details:
// Name: John Doe
// Roll Number: 101
// Marks: 85.0
// Grade: B
package ie.atu.week4;

import java.util.Scanner;

public class StudnetApp {
    public static void main(String[] args) {
        Student FirstStudent = new Student();
        Student Temp = GetInfo(1);
        FirstStudent.setName(Temp.getName());
        FirstStudent.setEmail(Temp.getEmail());
        FirstStudent.setCourse(Temp.getCourse());

        Temp = GetInfo(2);
        Student SecondStudent = new Student(Temp.getName());
        SecondStudent.setEmail(Temp.getEmail());
        SecondStudent.setCourse(Temp.getCourse());

        Temp = GetInfo(3);
        Student ThirdStudent = new Student(Temp.getName(), Temp.getEmail(), Temp.getCourse());

        System.out.println("Student 1: " + FirstStudent);
        System.out.println("Student 2: " + SecondStudent);
        System.out.println("Student 3: " + ThirdStudent);

    }

    public static Student GetInfo(int StudentNumber){
        Student TempStudent = new Student();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student " + StudentNumber + " name: ");
        TempStudent.setName(input.next());
        System.out.println("Enter student " + StudentNumber + " email: ");
        TempStudent.setEmail(input.next());
        System.out.println("Enter student " + StudentNumber + " course: ");
        TempStudent.setCourse(input.next());
        return TempStudent;
    }


}

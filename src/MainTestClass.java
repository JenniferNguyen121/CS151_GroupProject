
import java.util.ArrayList;
import java.util.List;

public class MainTestClass{
    public static void main(String[] args){
        Student student = new Student("Paul", "Software Engineer", new SoftwareEngineering());
        
        student.addTakenCourses("PlacementTest");
        student.addTakenCourses("CS46A");
        student.addTakenCourses("CS46B");
        student.addTakenCourses("ENGL1A");
        student.addTakenCourses("ENGL1B");
        student.addTakenCourses("CMPE131");
        student.addTakenCourses("CS146");
        student.addTakenCourses("CS151");
        student.addTakenCourses("MATH30");
        student.addTakenCourses("MATH31");
        student.addTakenCourses("MATH123");
        student.addTakenCourses("MATH32");
        student.addTakenCourses("PHYS50");
        student.addTakenCourses("PHYS51");
        student.addTakenCourses("ENGR10");
        student.addTakenCourses("BIOL10");
        student.addTakenCourses("MATH42");
        
        student.displayStudentInfo();
        student.displayRemainingCourses();
    }
}
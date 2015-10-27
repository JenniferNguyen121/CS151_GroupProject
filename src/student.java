
import java.util.ArrayList;
import java.util.List;

public class Student{
    private String name;
    private String majorName;
    private Major major;
    private ArrayList<Course> takenCourses;
    private List<Course> requiredCourseList;
    private ArrayList<Course> courseLeft;
    private CourseList courseList;
    
    public Student(String name, String majorName, Major major){
        this.name = name;
        this.majorName = majorName;
        this.major = major;
        this.courseList = new CourseList();
        this.takenCourses = new ArrayList<>();
        this.requiredCourseList = major.getRequireCourses();
        this.courseLeft = new ArrayList<>();
    }
    
    public ArrayList<Course> getTakenCourses(){
        return takenCourses;
    }
    
    public void addTakenCourses(String course){
        Course theTakenCourse = courseList.getCourse(course);
        takenCourses.add(theTakenCourse);
    }
    
    private void getRemainingCoursesList(){
        for(Course course: requiredCourseList){
            boolean notTaken = true;
            for(Course taken : takenCourses){
                
                if((course.getCourseID()).equalsIgnoreCase(taken.getCourseID())){
                   notTaken = false;
                }
            }
            if(notTaken){
                courseLeft.add(course);
            }
        }
    }
    
    public void displayRemainingCourses(){
        getRemainingCoursesList();
        System.out.println("Remaining major courses for graduation in " + this.majorName + "major: - " + this.remainingUnits() + "units remaining");
        for(Course courseRemaining: courseLeft){
            courseRemaining.displayClassTitle();
            System.out.println("");
        }
    }
    public int remainingUnits(){
        int units = 0;
        for(Course course: courseLeft){
            units += course.getCourseUnit();
        }
        return units;
    }
    public void displayStudentInfo(){
        System.out.printf("%s - Major: %s.\n" , this.name, this.majorName);
        
    }
}
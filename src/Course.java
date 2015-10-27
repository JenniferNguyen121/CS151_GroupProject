public class Course{
    private String courseID;
    private String courseName;
    private String description;
    private String prerequesites;
    private int units;
    
    public Course(String courseID, String name, String description, String prerequesites, int units){
        this.courseID = courseID;
        this.courseName = name;
        this.description = description;
        this.prerequesites = prerequesites;
        this.units = units;
    }
    
    public String getCourseID(){
        return this.courseID;
    }
    public void displayClassInfo(){
        System.out.printf("%s - %d units\n\n%s\n\n%s\n\nPrerequesites:%s\n", this.courseID, this.units, this.courseName, this.description,this.prerequesites);
    }
    
    public void displayClassTitle(){
        System.out.printf("%s:%s - %d units", this.courseID, this.courseName, this.units);
    }
    public int getCourseUnit(){
        return this.units;
    }
}
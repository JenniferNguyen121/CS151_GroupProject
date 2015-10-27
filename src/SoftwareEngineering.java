
import java.util.ArrayList;
import java.util.List;

public class SoftwareEngineering implements Major{
    ArrayList<Course> requireCourses;
    CourseList courseList;
    DirectedGraph prereq;
    ArrayList<InDegreeNode> nodeList;
    
    public SoftwareEngineering(){
        requireCourses = new ArrayList<>();
        courseList = new CourseList();
        nodeList = new ArrayList<>();
        this.addRequireCourses();
        
        this.prereq = new DirectedGraph();
        
        for(Course course: requireCourses){
            InDegreeNode<Course> theCourse = new InDegreeNode<Course>(course);
            nodeList.add(theCourse);
            prereq.addNode(theCourse);
        }
        
        this.setPrerequisites();
    }
    private InDegreeNode<Course> getNodeFromList(Course course){
        InDegreeNode<Course> result = null;
        for(InDegreeNode node: nodeList){
            if(node.getNode().equals(course)){
                result = node;
                break;
            }
        }
        return result;
    }
    public List<Course> getRequireCourses(){
        BreadthFirstSearch<Course> breadthFirstSearch = new BreadthFirstSearch<>();
        List<InDegreeNode<Course>> sortedCourseNode = breadthFirstSearch.sort(prereq, getNodeFromList(courseList.getCourse("PlacementTest")));
        
        List<Course> sortedCourse = new ArrayList<Course>();
        for(InDegreeNode<Course> node: sortedCourseNode){
            sortedCourse.add(node.getNode());
        }
        return  sortedCourse;
    }
    private void addRequireCourses(){
        requireCourses.add(courseList.getCourse("PlacementTest"));
        requireCourses.add(courseList.getCourse("CS151"));
        requireCourses.add(courseList.getCourse("CS146"));
        requireCourses.add(courseList.getCourse("CS46B"));
        requireCourses.add(courseList.getCourse("CS46A"));
        requireCourses.add(courseList.getCourse("MATH42"));
        requireCourses.add(courseList.getCourse("MATH30"));
        requireCourses.add(courseList.getCourse("MATH31"));
        requireCourses.add(courseList.getCourse("MATH32"));
        requireCourses.add(courseList.getCourse("MATH123"));
        requireCourses.add(courseList.getCourse("PHYS50"));
        requireCourses.add(courseList.getCourse("PHYS51"));
        requireCourses.add(courseList.getCourse("MATH161A"));
        requireCourses.add(courseList.getCourse("CMPE102"));
        requireCourses.add(courseList.getCourse("CMPE120"));
        requireCourses.add(courseList.getCourse("CS166"));
        requireCourses.add(courseList.getCourse("CS149"));
        requireCourses.add(courseList.getCourse("CS157A"));
        requireCourses.add(courseList.getCourse("CMPE148"));
        requireCourses.add(courseList.getCourse("CMPE172"));
        requireCourses.add(courseList.getCourse("ENGL1A"));
        requireCourses.add(courseList.getCourse("ENGL1B"));
        requireCourses.add(courseList.getCourse("ENGR100W"));
        requireCourses.add(courseList.getCourse("CMPE131"));
        requireCourses.add(courseList.getCourse("CMPE133"));
        requireCourses.add(courseList.getCourse("CMPE165"));
        requireCourses.add(courseList.getCourse("CMPE187"));
        requireCourses.add(courseList.getCourse("CMPE195A"));
        requireCourses.add(courseList.getCourse("CMPE195B"));
        requireCourses.add(courseList.getCourse("BIOL10"));
        requireCourses.add(courseList.getCourse("ENGR10"));
        requireCourses.add(courseList.getCourse("ISE164"));
        requireCourses.add(courseList.getCourse("ENGR195A"));
        requireCourses.add(courseList.getCourse("ENGR195B"));
        
    }

    /**
     * Set prerequisites by setting the edge for the directed graph.
     */
    private void setPrerequisites(){
        prereq.addEdge(getNodeFromList(courseList.getCourse("PlacementTest")),getNodeFromList(courseList.getCourse("ENGL1A")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("PlacementTest")),getNodeFromList(courseList.getCourse("CS46A")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("PlacementTest")),getNodeFromList(courseList.getCourse("MATH30")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("PlacementTest")),getNodeFromList(courseList.getCourse("MATH42")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("PlacementTest")),getNodeFromList(courseList.getCourse("ENGR10")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("PlacementTest")),getNodeFromList(courseList.getCourse("BIOL10")));
                        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS46A")), getNodeFromList(courseList.getCourse("CS46B")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS46B")),getNodeFromList(courseList.getCourse("CS146")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS46B")), getNodeFromList(courseList.getCourse("CS151")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS46B")), getNodeFromList(courseList.getCourse("CMPE120")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS46B")), getNodeFromList(courseList.getCourse("CMPE102")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS46B")), getNodeFromList(courseList.getCourse("CMPE131")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH42")), getNodeFromList(courseList.getCourse("CS151")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH42")), getNodeFromList(courseList.getCourse("CS146")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH30")), getNodeFromList(courseList.getCourse("MATH31")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH30")), getNodeFromList(courseList.getCourse("PHYS50")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH31")), getNodeFromList(courseList.getCourse("MATH32")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH31")), getNodeFromList(courseList.getCourse("MATH123")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH31")), getNodeFromList(courseList.getCourse("PHYS51")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("MATH32")), getNodeFromList(courseList.getCourse("MATH161A")));

        prereq.addEdge(getNodeFromList(courseList.getCourse("PHYS50")), getNodeFromList(courseList.getCourse("PHYS51")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CMPE120")), getNodeFromList(courseList.getCourse("CS166")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CMPE120")), getNodeFromList(courseList.getCourse("CMPE148")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS146")), getNodeFromList(courseList.getCourse("CMPE148")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS146")), getNodeFromList(courseList.getCourse("CS166")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS146")), getNodeFromList(courseList.getCourse("CS149")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS146")), getNodeFromList(courseList.getCourse("CS157A")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS146")), getNodeFromList(courseList.getCourse("ISE164")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CS149")), getNodeFromList(courseList.getCourse("CMPE172")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("ENGL1A")), getNodeFromList(courseList.getCourse("ENGL1B")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("ENGL1B")), getNodeFromList(courseList.getCourse("ENGR100W")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CMPE131")), getNodeFromList(courseList.getCourse("CMPE133")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CMPE131")), getNodeFromList(courseList.getCourse("ENGR195A")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("CMPE131")), getNodeFromList(courseList.getCourse("CMPE195A")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CMPE133")), getNodeFromList(courseList.getCourse("CMPE165")));
        
        prereq.addEdge(getNodeFromList(courseList.getCourse("CMPE195A")), getNodeFromList(courseList.getCourse("CMPE195B")));
        prereq.addEdge(getNodeFromList(courseList.getCourse("ENGR195A")), getNodeFromList(courseList.getCourse("ENGR195B")));
    }
}
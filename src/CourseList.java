/**
 * Course List Database. 
 */
import java.util.Hashtable;

public class CourseList{
    Hashtable<String, Course> courseList = new Hashtable<>();
    public CourseList(){
        courseList.put("CS151", CS151);
        courseList.put("CS146", CS146);
        courseList.put("CS46B", CS46B);
        courseList.put("CS46A", CS46A);
        courseList.put("MATH42", MATH42);
        courseList.put("MATH30", MATH30);
        courseList.put("MATH31", MATH31);
        courseList.put("MATH32", MATH32);
        courseList.put("MATH123", MATH123);
        courseList.put("PHYS50", PHYS50);
        courseList.put("PHYS51", PHYS51);
        courseList.put("MATH161A", MATH161A);
        courseList.put("CMPE102", CMPE102);
        courseList.put("CMPE120", CMPE120);
        courseList.put("CS166", CS166);
        courseList.put("CS149", CS149);
        courseList.put("CS157A", CS157A);
        courseList.put("CMPE148", CMPE148);
        courseList.put("CMPE172", CMPE172);
        courseList.put("ENGL1A", ENGL1A);
        courseList.put("ENGL1B", ENGL1B);
        courseList.put("ENGR100W", ENGR100W);
        courseList.put("CMPE131", CMPE131);
        courseList.put("CMPE133", CMPE133);
        courseList.put("CMPE165", CMPE165);
        courseList.put("CMPE187", CMPE187);
        courseList.put("CMPE195A", CMPE195A);
        courseList.put("CMPE195B", CMPE195B);
        courseList.put("BIOL10", BIOL10);
        courseList.put("ENGR10", ENGR10);
        courseList.put("ISE164", ISE164);
        courseList.put("ENGR195A", ENGR195A);
        courseList.put("ENGR195B", ENGR195B);
        courseList.put("PlacementTest", PlacementTest);
    }
    /**
     * Return course based on CourseID
     * @param courseID
     * @return Course course with CourseID
     */
    public Course getCourse(String courseID){
        return courseList.get(courseID);
    }
    private Course PlacementTest = new Course("PlacementTest", "The Placement Test", "Placement Test before beginning the school", "None", 0);
    private Course BIOL10 = new Course("BIOL10", "THE LIVING WORLD", "Provides students with an understanding of the most fundamental concepts of modern biology including ecology (the interaction between organisms and their environment), \n"
            + "human inheritance, the structure and function of living organisms, evolution, strategies for survival and reproduction, and biotechnology", "None",3);
    private Course ENGR10 = new Course("ENGR10", "INTRODUCTION TO ENGINEERING", 
            "Introduction to engineering through hands-on design projects, case studies, and problem-solving using computers. Students also acquire non-technical skills, such as team skills and the ability to deal with ethical dilemmas",
            "ENGL1A", 3);
    private Course ISE164 = new Course("ISE164", "COMPUTER AND HUMAN INTERACTION",
            "Introduction to human/computer interaction, paradigms for interaction, human performance capabilities, computer input/output device analysis and design, pattern recognition 3D audio, 3D visualization, application to virtual reality and multimedia",
            "Junior standing", 3);
    private Course CS151 = new Course("CS151","OBJECT-ORIENTED DESIGN", "Design of classes and interfaces. Value and reference semantics. \n"
            + "Object-oriented design methodologies and notations. Design patterns. Reflection and serialization. \n"
            + "Exception handling. Graphical user interface programming. Frameworks and components. Multithreading.\n"
            + "Required team-based programming assignment.", 
            "MATH 42, CS 46B, and CS 49J", 3);
    private Course CS146 = new Course("CS146", "DATA STRUCTURES AND ALGORITHMS", "Implementations of advanced tree structures, priority queues, heaps, directed and undirected graphs. \n"
            + "Advanced searching and sorting (radix sort, heapsort, mergesort, and quicksort). \n"
            + "Design and analysis of data structures and algorithms. Divide-and-conquer, greedy, \n"
            + "and dynamic programming algorithm design techniques", "MATH 030, MATH 042, CS 049J, CS46B",3);
    private Course CS46B = new Course("CS46B", "INTRODUCTION TO DATA STRUCTURES", "Stacks and queues, recursion, lists, dynamic arrays, binary search trees. "
            + "\nIteration over collections. Hashing. Searching, elementary sorting. Big-O notation. "
            + "\nStandard collection classes. Weekly hands-on activity", "CS 046A or CS 049J", 4 );
    private Course CS46A = new Course("CS46A", "INTRODUCTION TO PROGRAMMING",
            "Basic skills and concepts of computer programming in an object-oriented approach using Java.\n"
            + "Classes, methods and argument passing, control structures, iteration. Basic graphical user interface programming.\n"
            + "Problem solving, class discovery and stepwise refinement. "
            + "\nProgramming and documentation style. Weekly hands-on activity", "None", 4);
    private Course MATH30 = new Course("MATH30", "CALCULUS I", 
            "Introduction to calculus including limits, continuity, differentiation, applications and introduction to integration. \n"
            + "Graphical, algebraic and numerical methods of solving problems", "None", 3);
    private Course MATH42 = new Course("MATH42", "DISCRETE MATHEMATICS",
            "Sets, logic, methods of proof including mathematical induction, functions, relations, elementary combinatorics, probability, Boolean algebras",
            "None", 3);
    private Course MATH31 = new Course("MATH31", "CALCULUS II",
            "Definite and indefinite integration with applications. Sequences and series. Graphical, algebraic and numerical methods of solving problems",
            "MATH 30", 4);
    private Course MATH32 = new Course("MATH32", "CALCULUS III", 
            "Functions of more than one variable, partial derivatives, multiple integrals and vector calculus. Graphical, algebraic and numerical methods of solving problems.",
            "MATH31", 3);
    private Course MATH123 = new Course("MATH123", "DIFFERENTIAL EQUATIONS AND LINEAR ALGEBRA",
            "Matrices, determinants, systems of linear equations, vector geometry, linear transformations, eigenvalues and eigenvectors, diagonalization, first order differential equations, \n"
            + "linear systems of differential equations, higher order differential equations, Laplace transforms", "MATH31", 3);
    private Course PHYS50 = new Course("PHYS50", "GENERAL PHYSICS/MECHANICS", 
            "A calculus-based treatment of particle kinematics and dynamics, work, energy, momentum, rotational motion, \n"
            + "equilibrium, and simple harmonic motion. Intensive Science Package",
            "MATH30", 4);
    private Course PHYS51 = new Course("PHYS51", "GENERAL PHYSICS/ELECTRICITY AND MAGNETISM",
            "A calculus-based introduction to electricity and magnetism, covering electric charges, \n"
            + "electric and magnetic fields, dc and ac circuits, and electromagnetic waves. Intensive Science Package",
            "MATH31, PHYS50", 4);
    private Course CMPE120 = new Course("CMPE120", "COMPUTER ORGANIZATION AND ARCHITECTURE", 
            "Introduction to computer organization and architecture, system buses, internal memory and external memory, input/output, central processing unit CPU, \n"
            + "instruction sets, CPU structure and function, RISC, control unit", "CS46B", 3);
    private Course CMPE102 = new Course("CMPE102", "ASSEMBLY LANGUAGE PROGRAMMING",
            "Assembly programming; assembly-C interface; CPU and memory organization; addressing modes; arithmetic, logic and branch instructions; arrays, pointers, subroutines, \n"
            + "stack and procedure calls; software interrupts; multiplication, division and floating point arithmetic", "CS46B", 3);
    private Course CS166 = new Course("CS166", "INFORMATION SECURITY",
            "Fundamental security topics including cryptography, protocols, passwords, access control, software security, and network security. \n"
            + "Additional topics selected from multilevel security, biometrics, \n"
            + "tamper-resistant hardware, information warfare, e-commerce, system evaluation and assurance, and intrusion detection"
            , "CS146, CMPE120/CMPE102", 3);
    private Course CS149 = new Course("CS149", "OPERATING SYSTEMS",
            "Fundamentals: Contiguous and non-contiguous memory management; processor scheduling and interrupts; concurrent, mutually exclusive, \n"
            + "synchronized and deadlocked processes; files. Substantial programming project required. ",
            "CS146", 3);
    private Course MATH161A = new Course("MATH161A", "ENGINEERING PROBABILITY AND STATISTICS",
            "Probability theory, graphical displays of data, graphical methods of comparisons of samples and hypotheses testing. Statistical estimation and inference. Uses graphical statistical packages",
            "MATH32", 3);
    private Course CS157A = new Course("MATH157A", "INTRODUCTION TO DATABASE MANAGEMENT SYSTEMS",
            "Current, classical database systems. Entity-relationship and enhanced entity models. \n"
            + "Relational model, algebra, calculus. Current, emerging SQL standard. \n"
            + "Embedded, Dynamic SQL. Application perspective on transactions and security. \n"
            + "Interactive and programmatic interfaces to database systems. Application programming project using commercial database system",
            "CS146", 3);
    private Course CMPE148 = new Course("CMPE148", "COMPUTER NETWORK I", "Comparative evaluation of network architecture, layering model, standards, protocol examples for ISO and TCP/IP layers. \n"
            + "Network applications, transport layer protocols, Internet routing, data link and physical transmissions. \n"
            + "Applications in world wide web, file transfer, electronic mail, peer-to-peer and other areas",
            "CMPE120, CS146 for SE, CMPE124, CMPE126 for CMPE", 3);
    private Course CMPE172 = new Course("CMPE172", "ENTERPRISE SOFTWARE PLATFORMS", 
            "Introduction to enterprise software systems. Covers network operating systems, DBMS, transaction monitors, groupware, distributed objects, system management and the Web. \n"
                    + "Covers standards such as J2EE, CORBA, SQL, JDBC, and HTTP; and emerging software technologies",
            "CS149/CMPE142", 3);
    private Course ENGL1A = new Course("ENGL1A", "FIRST YEAR WRITING",
            "English 1A is an introductory course that prepares students to join scholarly conversations across the university. Students develop reading skills, rhetorical sophistication, \n"
                    + "and writing styles that give form and coherence to complex ideas for various audiences, using a variety of genres",
            "English Placement Test", 3);
    private Course ENGL1B = new Course("ENGL1B", "ARGUMENT AND ANALYSIS",
            "English 1B is a writing course that focuses on argumentation and analysis. \n"
                    + "Through the study of literary, rhetorical, and professional texts, students will develop the habits of mind required to write argumentative and critical essays. \n"
                    + "Particular emphasis is placed on writing and reading processes. Students will have repeated practice in prewriting, drafting, revising, and editing, \n"
                    + "and repeated practice in reading closely in a variety of forms, styles, structures, and modes",
            "ENGL1A", 3);
    private Course ENGR100W = new Course("ENGR100W", "ENGINEERING REPORTS",
            "Regular technical writing assignments and company-focused oral presentations while integrating effects of environmental factors as they relate to products, systems and engineering processes",
            "WST and English 1B, core GE",3);
    private Course CMPE131 = new Course("CMPE131", "SOFTWARE ENGINEERING I",
            "Why software engineering? What is software engineering? Software development lifecycle activities: project planning and management requirements analysis, requirement specification. \n"
                    + "Software design, software testing, verification, validation, and documentation. Software quality assurance and review techniques, software maintenance, team-based projects",
                    "CS46B for SE, CMPE126 for CMPE",3);
    private Course CMPE133 = new Course("CMPE133", "SOFTWARE ENGINEERING II",
            "Software Architecture, Software Technical Metrics, evaluating products, processes, and resources, improving predictions, products, processes, and resources. \n"
                    + "Advanced topics such as: Formal Methods, Software Reuse, Reengineering, Client/Server Software Engineering, Computer-Aided Software Engineering, Team-Based Projects",
            "CMPE131", 3);
    private Course CMPE165 = new Course("CMPE165", "SOFTWARE ENGINEERING PROCESS MANAGEMENT",
            "Integrated approach to managing development within small teams; including mission statement, synthesis of design concepts, tradeoff studies, risk assessment and the interactions encountered in the optimal design, development, manufacture and test of systems",
            "CMPE133", 3);
    private Course CMPE195A = new Course("CMPE195A", "SENIOR DESIGN PROJECT I",
            "Comprehensive plan and preliminary design of a group computer/software engineering project; integration of knowledge in science, technologies and team processes; group written report and oral presentation; global and social issues in engineering; individual professional development plans",
            "For SE: ENGR100W, CMPE131, MATH161A. For CMPE: CMPE127, CMPE130, CMPE131, ISE130, ENGR100W", 2);
    private Course CMPE195B = new Course("CMPE195B", "SENIOR DESIGN PROJECT II",
            "Implementation of group design project initiated in CMPE 195A; group oral presentation and written report; integrated global and social issues in engineering",
            "CMPE195A", 3);
    private Course ENGR195A = new Course("ENGR195A", "GLOBAL AND SOCIAL ISSUES IN ENGINEERING",
            "Interdisciplinary seminar treating social and global impacts of technology and engineering. This integrated GE experience requires students to apply these concepts in their senior project classes. Students must enroll concurrently in their department senior project course Part A.",
            "ENGR100W", 1);
    private Course ENGR195B = new Course("ENGR195B", "GLOBAL AND SOCIAL ISSUES IN ENGINEERING",
            "Interdisciplinary seminar treating social and global impacts of technology and engineering. This integrated GE experience requires students to apply these concepts in their senior project classes. Students must enroll concurrently in their department senior project course Part A.",
            "ENGR100W", 1);
    private Course CMPE187 = new Course("ENGR187", "SOFTWARE QUALITY ENGINEERING",
            "Software testing and quality assurance engineering concepts, processes, models, criteria, and methods. Software unit testing, integration, function validation, system performance and reliability evaluation; \n"
                    + "Software security testing methods and tools; software quality management, control systems, standards, and evaluation metrics",
            "CMPE131", 3);
    
    
    
    
}
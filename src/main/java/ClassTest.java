package gradebook.model;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class ClassTest {
    private Class testClass;
    private Class testClass2;
    private Course testCourse;
    private ArrayList<Course> prerequisitesTest;
    private ArrayList<Student> testSection;
    private Student testStudent;
    private GradebookItem grade;
    
    @Before
    public void setup() {
        prerequisitesTest = new ArrayList<Course>();
        prerequisitesTest.add(testCourse);
        testCourse = new Course("CS2110", "CS", 2110);
        testClass = new Class("CS2340", "CS Course", 2340, prerequisitesTest);
        testClass2 = new Class("CS2340", "CS Course", 2110);
        testStudent = new Student("taramgee");
        testSection = new ArrayList<Student>();
        testSection.add(testStudent);
        grade = new GradebookItem(20, testStudent);
        
    }
    
    @Test
    public void addStudentTest() {
        testClass.addStudent(testStudent);
        assertEquals(testClass.getSection().size(),1);
        assertEquals(testClass.getSection().get(0), testStudent);
        assertEquals(testClass2.getSection().size(),0);
    }
    @Test
    public void getSectionTest() {
        testClass.addStudent(testStudent);
        assertEquals(testClass.getSection(), testSection);
    }
    @Test
    public void getCourseAVGTest() {
        testClass.addStudent(testStudent);
        assertEquals((int)testClass.getCourseAVG() , 0);
        testStudent.addGrade(grade);
        assertEquals((int)testClass.getCourseAVG() , 20);
    }
}
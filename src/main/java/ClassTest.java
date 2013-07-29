package gradebook.model;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class ClassTest {
    private Class testClass;
    private Course testCourse;
    private List<Course> prerequisitesTest;
    private List<Student> testSection;
    private Student testStudent;
    
    @Before
    public void setup() {
        prerequisitesTest = new ArrayList<Course>();
        testCourse = new Course("CS2110", "CS", 2110);
        testClass = new Class("CS2340", "CS Course", 2340, prerequisitesTest);
        testStudent = new Student("taramgee");
        testSection = new ArrayList<Student>();
        testSection.add(testStudent);
        
    }
    
    @Test
    public void addStudentTest() {
        testClass.addStudent(testStudent);
        assertEquals(testClass.getSection().size(),1);
        assertEquals(testClass.getSection().get(0), testStudent);
    }
    @Test
    public void getSectionTest() {
        testClass.addStudent(testStudent);
        assertEquals(testClass.getSection(), testSection );
    }
    @Test
    public void getCourseAVGTest() {
        assertEquals((int)testClass.getCourseAVG() , 0);
    }
}
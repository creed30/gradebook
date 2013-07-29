package gradebook.model;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
/**
 * This is the the ClassTest class that tests the Class class.
 * It also implements a Course interface
 * @author Chad Reed
 * @version 1.0
 */
public class ClassTest {
    private Class testClass;
    private Class testClass2;
    private Course testCourse;
    private ArrayList<Course> prerequisitesTest;
    private ArrayList<Student> testSection;
    private Student testStudent;
    private GradebookItem grade;
    private static final int TEMP = 2110;
    private static final int TEMP2 = 2340;
    private static final int TEMP3 = 20;
    @Before
    public final void setup() {
        prerequisitesTest = new ArrayList<Course>();
        prerequisitesTest.add(testCourse);
        testCourse = new Course("CS2110", "CS", TEMP);
        testClass = new Class("CS2340", "CS Course", TEMP2, prerequisitesTest);
        testClass2 = new Class("CS2340", "CS Course", TEMP);
        testStudent = new Student("taramgee");
        testSection = new ArrayList<Student>();
        testSection.add(testStudent);
        grade = new GradebookItem(TEMP3, testStudent);
    }
    @Test
    public final void addStudentTest() {
        testClass.addStudent(testStudent);
        assertEquals(testClass.getSection().size(), 1);
        assertEquals(testClass.getSection().get(0), testStudent);
        assertEquals(testClass2.getSection().size(), 0);
    }
    @Test
    public final void getSectionTest() {
        testClass.addStudent(testStudent);
        assertEquals(testClass.getSection(), testSection);
    }
    @Test
    public final void getCourseAVGTest() {
        testClass.addStudent(testStudent);
        assertEquals((int) testClass.getCourseAVG() , 0);
        testStudent.addGrade(grade);
        assertEquals((int) testClass.getCourseAVG() , TEMP3);
    }
}

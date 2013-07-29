package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
/**
 * This is the StudentTest class that tests Students.
 * @author Chad Reed
 * @version 1.0
 */
public class StudentTest {
    private Student testStudent;
    private GradebookItem gradeItem;
    private Class testClass;
    private GradingScheme stand;
    private static final int TEMP = 90;
    private static final int TEMP2 = 80;
    private static final int TEMP3 = 70;
    private static final int TEMP4 = 60;
    private static final int TEMP5 = 2340;
    @Before
    public void setup() {
        testClass = new Class("CS2340", "CS Course", TEMP5);
        testStudent = new Student("Taramgee");
        testClass.addStudent(testStudent);
        gradeItem = new GradebookItem(TEMP, testStudent);
        stand = new GradingScheme("cheese", TEMP, TEMP2, TEMP3, TEMP4);
    }
    @Test
    public void setClassNameTest() {
        assertEquals(testStudent.getClassName(), "CS2340");
        testStudent.setClassName("cheeseburger");
        assertEquals(testStudent.getClassName(), "cheeseburger");
    }
    @Test
    public void getClassNameTest() {
        assertEquals(testStudent.getClassName(), "CS2340");
    }
    @Test
    public void getCourseAVGTest() {
        assertEquals((int) testStudent.getCourseAVG(), 0);
        testStudent.addGrade(gradeItem);
        assertEquals((int) testStudent.getCourseAVG(), TEMP);
    }
    @Test
    public void getCourseAVGLetterTest() {
        assertEquals(testStudent.getCourseAVGLetter(stand), "F");
        testStudent.addGrade(gradeItem);
        assertEquals(testStudent.getCourseAVGLetter(stand), "A");
    }
    @Test
    public void getNameTest() {
        assertEquals(testStudent.getName(), "Taramgee");
    }
}

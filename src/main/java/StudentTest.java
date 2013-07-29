package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class StudentTest {
    private Student testStudent;
    private GradebookItem gradeItem;
    private Class testClass;
    private GradingScheme stand;
    @Before
    public void setup() {
        testClass = new Class("CS2340", "CS Course", 2340);
        testStudent = new Student("Taramgee");
        testClass.addStudent(testStudent);
        gradeItem = new GradebookItem(90,testStudent);
        testStudent.addGrade(gradeItem);
        stand = new GradingScheme("cheese",90,80,70,60);
    }
    @Test
    public void setClassNameTest() {
        assertEquals(testStudent.getClassName(),"CS2340");
        testStudent.setClassName("cheeseburger");
        assertEquals(testStudent.getClassName(),"cheeseburger");
    }
    @Test
    public void getClassNameTest() {
        assertEquals(testStudent.getClassName(),"CS2340");
    }
    @Test
    public void getCourseAVGTest() {
        assertEquals((int)testStudent.getCourseAVG(), 90);
    }
    @Test
    public void getCourseAVGLetterTest() {
        assertEquals(testStudent.getCourseAVGLetter(stand), "A");
    }
}
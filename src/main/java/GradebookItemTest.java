package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class GradebookItemTest {
    private GradebookItem testGradeItem;
    private Student testStudent;
    private Class testClass;
    @Before
    public void setup(){
        testStudent = new Student("taramgee");
        testClass = new Class("CS2110", "CS", 2110);
    }
    @Test
    public void getGradeTest() {
        testGradeItem = new GradebookItem(30,testStudent);
        assertEquals(testGradeItem.getGrade(), 30);
    }
    @Test
    public void getCategoryTest() {
        testGradeItem = new GradebookItem(30,testStudent);
        assertEquals(testGradeItem.getCategory(), null);
        testClass.addStudent(testStudent);
        testGradeItem = new GradebookItem(30,testStudent);
        assertEquals(testGradeItem.getCategory(), "CS2110");
    }
}
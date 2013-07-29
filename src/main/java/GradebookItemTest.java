package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
/**
 * The GradebookItemTest class that tests the GradebookItem class.
 * @author Chad Reed
 * @version 1.0
 */
public class GradebookItemTest {
    private GradebookItem testGradeItem;
    private Student testStudent;
    private Class testClass;
    private static final int TEMP = 2110;
    private static final int TEMP2 = 30;
    @Before
    public void setup() {
        testStudent = new Student("taramgee");
        testClass = new Class("CS2110", "CS", TEMP);
    }
    @Test
    public void getGradeTest() {
        testGradeItem = new GradebookItem(TEMP2, testStudent);
        assertEquals(testGradeItem.getGrade(), TEMP2);
    }
    @Test
    public void getCategoryTest() {
        testGradeItem = new GradebookItem(TEMP2, testStudent);
        assertEquals(testGradeItem.getCategory(), null);
        testClass.addStudent(testStudent);
        testGradeItem = new GradebookItem(TEMP2, testStudent);
        assertEquals(testGradeItem.getCategory(), "CS2110");
    }
}

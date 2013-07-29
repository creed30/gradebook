package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class GradebookItemTest {
    private GradebookItem testGradeItem;
    private Student testStudent;
    @Before
    public void setup(){
        testStudent = new Student("taramgee");
        testGradeItem = new GradebookItem(30,testStudent);
    }
    @Test
    public void getGradeTest() {
        assertEquals(testGradeItem.getGrade(), 30);
    }
}
package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class GradingSchemeTest {
    private GradingScheme stand;
    @Before
    public void setup() {
        stand = new GradingScheme("cheese",90,80,70,60);
    }
    @Test
    public void getLetterGradeTest() {
        assertEquals(stand.getLetterGrade(91), "A");
        assertEquals(stand.getLetterGrade(90), "A");
        assertEquals(stand.getLetterGrade(89), "B");
        assertEquals(stand.getLetterGrade(81), "B");
        assertEquals(stand.getLetterGrade(80), "B");
        assertEquals(stand.getLetterGrade(79), "C");
        assertEquals(stand.getLetterGrade(71), "C");
        assertEquals(stand.getLetterGrade(70), "C");
        assertEquals(stand.getLetterGrade(69), "D");
        assertEquals(stand.getLetterGrade(61), "D");
        assertEquals(stand.getLetterGrade(60), "D");
        assertEquals(stand.getLetterGrade(59), "F");
        assertEquals(stand.getLetterGrade(0), "F");
    }
    @Test
    public void getNameTest() {
        assertEquals(stand.getName(), "cheese");
    }
}
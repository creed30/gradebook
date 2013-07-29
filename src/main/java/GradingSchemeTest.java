package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
/**
 * This is the GradingSchemeTest class that tests gradingschemes.
 * @author Chad Reed
 * @version 1.0
 */
public class GradingSchemeTest {
    private GradingScheme stand;
    private static final int TEMP = 90;
    private static final int TEMP2 = 80;
    private static final int TEMP3 = 70;
    private static final int TEMP4 = 60;
    @Before
    public final void setup() {
        stand = new GradingScheme("cheese", TEMP, TEMP2, TEMP3, TEMP4);
    }
    @Test
    public void getLetterGradeTest() {
        assertEquals(stand.getLetterGrade(TEMP + 1), "A");
        assertEquals(stand.getLetterGrade(TEMP), "A");
        assertEquals(stand.getLetterGrade(TEMP - 1), "B");
        assertEquals(stand.getLetterGrade(TEMP2 + 1), "B");
        assertEquals(stand.getLetterGrade(TEMP2), "B");
        assertEquals(stand.getLetterGrade(TEMP2 - 1), "C");
        assertEquals(stand.getLetterGrade(TEMP3 + 1), "C");
        assertEquals(stand.getLetterGrade(TEMP3), "C");
        assertEquals(stand.getLetterGrade(TEMP3 - 1), "D");
        assertEquals(stand.getLetterGrade(TEMP4 + 1), "D");
        assertEquals(stand.getLetterGrade(TEMP4), "D");
        assertEquals(stand.getLetterGrade(TEMP4 - 1), "F");
        assertEquals(stand.getLetterGrade(0), "F");
    }
    @Test
    public void getNameTest() {
        assertEquals(stand.getName(), "cheese");
    }
}

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
        assertEquals(stand.getLetterGrade(90), "A");
    }
}
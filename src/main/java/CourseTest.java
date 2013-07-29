package gradebook.model;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
/**
 * This is the the CourseTest class that tests the Course class.
 * @author Chad Reed
 * @version 1.0
 */
public class CourseTest {
    private Course testCourse;
    private Course testCourse2;
    private Course testCourse3;
    private ArrayList<Course> prereq;
    private static final int TEMP = 2110;
    private static final int TEMP2 = 2340;
    private static final int TEMP3 = 90;
    @Before
    public void setup() {
        testCourse = new Course("CS2110", "CS", TEMP);
        testCourse2 = new Course("CS2340", "CS", TEMP2);
        prereq = new ArrayList<Course>();
        prereq.add(testCourse);
        prereq.add(testCourse2);
        testCourse3 = new Course("CS2340", "CS", TEMP2, prereq);
    }
    @Test
    public void getCourseNameTest() {
        assertEquals(testCourse.getCourseName(), "CS2110");
    }
    @Test
    public void getcourseAVGTest() {
        assertEquals((int) testCourse.getcourseAVG(), (int) 0);
    }
    @Test
    public void setCourseAVGTest() {
        testCourse.setCourseAVG(TEMP3);
        assertEquals((int) testCourse.getcourseAVG(), (int) TEMP3);
    }
    @Test
    public void getCourseNumTest() {
        assertEquals((int) testCourse.getCourseNum(), TEMP);
    }
    @Test
    public void getPrerequisitesTest() {
        assertEquals(testCourse3.getPrerequisites(), prereq);
        assertEquals(testCourse.getPrerequisites(), new ArrayList<Course>());
    }
    @Test
    public void getCourseSubjTest() {
        assertEquals(testCourse.getCourseSubj(), "CS");
    }
}

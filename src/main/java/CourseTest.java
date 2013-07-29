package gradebook.model;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class CourseTest {
    private Course testCourse;
    private Course testCourse2;
    private Course testCourse3;
    private ArrayList<Course> prereq;
    @Before
    public void setup() {
        testCourse = new Course("CS2110", "CS", 2110);
        testCourse2 = new Course("CS2340", "CS", 2340);
        prereq = new ArrayList<Course>();
        prereq.add(testCourse);
        prereq.add(testCourse2);
        testCourse3 = new Course("CS2340", "CS", 2340, prereq);
    }
    @Test
    public void getCourseNameTest() {
        assertEquals(testCourse.getCourseName(), "CS2110");
    }
    @Test
    public void getcourseAVGTest() {
        assertEquals((int)testCourse.getcourseAVG(),(int)0);
    }
    @Test
    public void setCourseAVGTest() {
        testCourse.setCourseAVG(90);
        assertEquals((int)testCourse.getcourseAVG(),(int)90);
    }
    @Test
    public void getCourseNumTest() {
        assertEquals((int)testCourse.getCourseNum(), 2110);
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

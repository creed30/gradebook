package gradebook.model;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class CourseTest {
    private Course testCourse;
    @Before
    public void setup() {
        testCourse = new Course("CS2110", "CS", 2110);
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
}

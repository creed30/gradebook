
package gradebook.model;
import java.util.List;
/**
 *Course class with a subject, course number, name, and prerequisite courses.
 *
 *@author Chad Reed
 *@version  1.0 7/27/13
 */
public class Course {
    /**
     * @param name Course Name
     * @param subj Course Subject
     */
    private final String name, subj;
    /**
     * @param num Course Number
     */
    private final int num;
    /**
     * @param prerequisite Past Course Prerequisites
     */
    private List<Course> prerequisite;
    /**
     * @param courseAVG Course's number average
     */
    private double courseAVG;
    /**
     * @param newname Course Name
     * @param newnum Course Number
     * @param newsubj Course Subject
     * @param newprereq Prerequisite Course for this Course
     */
    public Course(final String newname, final String newsubj,
            final int newnum, final List<Course> newprereq) {
        this.name = newname;
        this.subj = newsubj;
        this.num = newnum;
        this.prerequisite = newprereq;
    }
    public final String getCourseName() {
        return name;
    }
    public final double getcourseAVG() {
        return courseAVG;
    }
    public final void setCourseAVG(final int newcourseAVG) {
        this.courseAVG = newcourseAVG;
    }
}

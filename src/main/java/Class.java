
package gradebook.model;
import java.util.ArrayList;
/**
 * This is the the Class class that extends a Course.
 * It also implements a Course interface
 * @author Chad Reed
 * @version 1.0
 */

public class Class extends Course {
    /**
     * @param section Array List of students for the section
     */
    private ArrayList<Student> section;
    /**
     * @param newname Given name for the Class
     * @param newsubj Given name for the Subject
     * @param newnum Given Class number for the class
     * @param newprereq Given Course list of prerequisites for Class
     */
    public Class(final String newname, final String newsubj,
            final int newnum, final ArrayList<Course> newprereq) {
        super(newname, newsubj, newnum, newprereq);
        section = new ArrayList<Student>();
    }
    /**
     * @param newname Given name for the Class
     * @param newsubj Given name for the Subject
     * @param newnum Given Class number for the class
     */
    public Class(final String newname, final String newsubj,
            final int newnum) {
        super(newname, newsubj, newnum);
        section = new ArrayList<Student>();
    }
    /**
     * @param newStudent add the student to the SectionList
     */
    public final void addStudent(final Student newStudent) {
        section.add(newStudent);
        newStudent.setClassName(getCourseName());
    }
    /**
     * @return returns the section of Students for the class
     */
    public final ArrayList<Student> getSection() {
        return section;
    }
    /**
     * @return returns the Numeric Couse Average
     */
    public final double getCourseAVG() {
        int total = 0;
        int count = 0;
        for (Student student : section) {
            total += student.getCourseAVG();
            count++;
        }
        if ((total == 0 | count == 0)) {
            return 0;
        } else {
            setCourseAVG(total / count);
            return (total / count);
        }
    }
}

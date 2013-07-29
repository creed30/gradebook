
package gradebook.model;
import java.util.List;
/**
 * This is the the Class class that extends a Course.
 * It also implements a Course interface
 * @author Chad Reed
 * @version 1.0
 */

public class Class extends Course {
    private List<Student> section;
    public Class(final String newname, final String newsubj,
            final int newnum, final List<Course> newprereq) {
        super(newname, newsubj, newnum, newprereq);
    }
    public final void addStudent(final Student newStudent) {
        section.add(newStudent);
        newStudent.setClassName(getCourseName());
    }
    public List<Student> getSection(){
        return section;
    }
    public final double getCourseAVG() {
        int total = 0;
        int count = 0;
        for (Student student : section) {
            total += student.getCourseAVG();
            count++;
        }
        setCourseAVG(total / count);
        return (total / count);
    }
}

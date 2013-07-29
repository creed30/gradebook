
package gradebook.model;
import java.util.ArrayList;
/**
 * This is the the Class class that extends a Course.
 * It also implements a Course interface
 * @author Chad Reed
 * @version 1.0
 */

public class Class extends Course {
    private ArrayList<Student> section;
    public Class(final String newname, final String newsubj,
            final int newnum, final ArrayList<Course> newprereq) {
        super(newname, newsubj, newnum, newprereq);
        section = new ArrayList<Student>();
    }
    public Class(final String newname, final String newsubj,
            final int newnum) {
        super(newname,newsubj,newnum);
        section = new ArrayList<Student>();
    }
    public final void addStudent(final Student newStudent) {
        section.add(newStudent);
        newStudent.setClassName(getCourseName());
    }
    public ArrayList<Student> getSection(){
        return section;
    }
    public final double getCourseAVG() {
        int total = 0;
        int count = 0;
        for (Student student : section) {
            total += student.getCourseAVG();
            count++;
        }
        if ((total==0 | count==0)) {
            return 0;
        }
        else {
            setCourseAVG(total / count);
            return (total / count);
        }
    }
}


package gradebook.model;
import java.util.List;
/**
 * This is the class that represents a student in a course.
 * @author Chad Reed
 * @version 1.0
 */

public class Student {
    private String name;
    private String className;
    private List<GradebookItem> grades;
    private int average;
    public Student(final String newname) {
        this.name = newname;
    }
    public final void addGrade(final GradebookItem newgrade) {
        grades.add(newgrade);
    }
    public final void setClassName(final String newclassName) {
        this.className = newclassName;
    }
    public final String getClassName() {
        return className;
    }
    public final double getCourseAVG() {
        int count = 0;
        int total = 0;
        for (GradebookItem grade : grades) {
            total += grade.getGrade();
            count++;
        }
        this.average = total / count;
        return this.average;
    }
    public final String getCourseAVGLetter(final GradingScheme scheme) {
        return scheme.getLetterGrade(average);
    }
}

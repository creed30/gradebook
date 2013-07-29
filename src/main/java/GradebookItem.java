
package gradebook.model;
/**
 * This is the class that represents a student in a course.
 * @author Chad Reed
 * @version 1.0
 */

public class GradebookItem {
    private final int grade;
    private final String gradebookCategory;
    public GradebookItem(final int newgrade) {
        this.grade = newgrade;
        this.gradebookCategory = "None";
    }
    public GradebookItem(final int newgrade, final Student student) {
        this.grade = newgrade;
        this.gradebookCategory = student.getClassName();
    }
    public final int getGrade() {
        return grade;
    }
    public final String getCategory() {
        return gradebookCategory;
    }
}

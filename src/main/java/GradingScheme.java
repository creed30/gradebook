
package gradebook.model;
/**
 *Course class with a subject, course number, name, and prerequisite courses.
 *
 *@author Chad Reed
 *@version  1.0 7/27/13
 */

public class GradingScheme {
    private final String name;
    private int aRange;
    private int bRange;
    private int cRange;
    private int dRange;
    private int fRange;
    public GradingScheme(final String newname, final int newaRange,
            final int newbRange, final int newcRange, final int newdRange,
            final int newfRange) {
        this.name = newname;
        this.aRange = newaRange;
        this.bRange = newbRange;
        this.cRange = newcRange;
        this.dRange = newdRange;
        this.fRange = newfRange;
    }
    public final String getLetterGrade(final int gradeAVG) {
        if (gradeAVG >= aRange) { return "A";
        } else if (gradeAVG >= bRange) { return "B";
        } else if (gradeAVG >= cRange) { return "C";
        } else if (gradeAVG >= dRange) { return "D";
        } else { return "F"; }
    }
}

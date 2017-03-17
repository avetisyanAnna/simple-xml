import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by User on 15.03.2017.
 */
@Element
public class Course {
    @Element
    private int id;
    @Element
    private String nameCourse;

    public Course(int id, String nameCourse) {
        this.id = id;
        this.nameCourse = nameCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }
}

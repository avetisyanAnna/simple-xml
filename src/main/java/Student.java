import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Student {
    @Element
    private String firstName;
    @Element
    private String lastName;
    @Element
    private Course course;

    public Student(String firstName, String lastName, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

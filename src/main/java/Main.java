import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        Students students = new Students();

        Course course1 = new Course(1, "Cryptography" );
        Student st1 = new Student("John", "Smith", course1);
        students.List.add(st1);

        Course course2 = new Course(2, "CS" );
        Student st2 = new Student("Mike", "Smith", course2);
        students.List.add(st2);

        Serializer serializer = new Persister();
        File file = new File("allStudents.xml");

        serializer.write(students, file);
    }
}

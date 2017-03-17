import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root
public class Students {
    @ElementList(inline=true)
    List<Student> List = new ArrayList<Student>();

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudentsGroup() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
}

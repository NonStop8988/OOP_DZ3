import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int index;

    public StudentGroupIterator(StudentGroup group) {
        this.students = group.getStudentsGroup();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        return students.get(index++);
    }
}

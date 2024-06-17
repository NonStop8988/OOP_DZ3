import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<StudentGroup> {
    private List<StudentGroup> potok;
    private String name;

    public Potok(String name) {
        this.name = name;
        this.potok = new ArrayList<>();
    }

    public void addToPotok(StudentGroup group) {
        potok.add(group);
    }

    public List<StudentGroup> getPotok() {
        return potok;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return potok.iterator();
    }

    @Override
    public String toString() {
        return name;
    }
}

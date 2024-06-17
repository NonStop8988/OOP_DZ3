import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Создание студентов
        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        StudentGroup group1 = new StudentGroup();
        group1.addStudent(van);
        group1.addStudent(igor);

        StudentGroup group2 = new StudentGroup();
        group2.addStudent(alex);
        group2.addStudent(alexey);

        StudentGroup group3 = new StudentGroup();
        group3.addStudent(van);
        group3.addStudent(alexey);

        Potok potok1 = new Potok("Поток 1");
        potok1.addToPotok(group1);
        potok1.addToPotok(group2);
        potok1.addToPotok(group3);

        Potok potok2 = new Potok("Поток 2");
        // potok2.addToPotok(group1);
        potok2.addToPotok(group2);
        potok2.addToPotok(group3);

        List<Potok> potoks = new ArrayList<>();
        potoks.add(potok1);
        potoks.add(potok2);

        StreamService streamService = new StreamService();
        streamService.sortPotoks(potoks);

        for (Potok potok : potoks) {
            System.out.println("В " + potok + " количество групп: " + potok.getPotok().size());
        }
    }
}
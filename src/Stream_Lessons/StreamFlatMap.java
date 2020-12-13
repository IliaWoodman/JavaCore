package Stream_Lessons;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMap {
    public static void main(String[] args) {
        Man m1 = new Man("Ivan", 'm', 22, 3, 8.3);
        Man m2 = new Man("Nikolay", 'm', 28, 1, 6.4);
        Man m3 = new Man("Elena", 'f', 19, 1, 8.9);
        Man m4 = new Man("Petr", 'm', 25, 4, 7);
        Man m5 = new Man("Mariya", 'f', 23, 3, 7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");


        f1.addStudentToFaculty(m1);
        f1.addStudentToFaculty(m2);
        f2.addStudentToFaculty(m3);
        f2.addStudentToFaculty(m4);
        f2.addStudentToFaculty(m5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
            .flatMap(faculty -> faculty.getStudentOfFaculty().stream())
            .forEach(e-> System.out.println(e.getName()));
    }
}

class Faculty {
    String name;
    List<Man> studentOfFaculty;

    public Faculty(String name){
        this.name = name;
        studentOfFaculty = new ArrayList<>();
    }

    public List<Man> getStudentOfFaculty() {
        return studentOfFaculty;
    }

    public void addStudentToFaculty(Man man){
        studentOfFaculty.add(man);
    }
}
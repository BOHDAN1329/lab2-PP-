package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pair> stud_std= new ArrayList<>();
        stud_std.add(new Pair( "Math", 2));
        stud_std.add(new Pair( "Java", 4));
        stud_std.add(new Pair( "Angl", 3));

        List<Pair> stud_std1= new ArrayList<>();
        stud_std.add(new Pair( "Math", 4));
        stud_std.add(new Pair( "Java", 5));
        stud_std.add(new Pair( "Angl", 3));

        List<Student> st_11 = new ArrayList<>();
        st_11.add(new Student("Jack", stud_std));
        st_11.add(new Student("Mich", stud_std1));


        Info info= new Info();
        info.add(new Pair( "Math","12.04.22" ));
        info.add(new Pair( "Java", "16.04.22"));
        info.add(new Pair( "Angl", "09.04.22"));

        List<Group> group = new ArrayList<>();

        group.add(new Group("IT-11",info,st_11));

        Univer univer = new Univer("LPNU", group);

        univer.print();

        //group.get(0).print();


    }
}

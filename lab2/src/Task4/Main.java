package Task4;

import service.*;

public class Main {
    public static void main(String[] args) {
        //Subjects
        ListSubject sj_1 = new ListSubject();
        sj_1.add("Math", 4);
        sj_1.add("History", 2);
        sj_1.add("OOP", 5);

        ListSubject sj_2 = new ListSubject();
        sj_2.add("Math", 3);
        sj_2.add("English", 2);
        sj_2.add("OOP", 4);

        ListSubject sj_3 = new ListSubject();
        sj_3.add("English", 4);
        sj_3.add("TIMC", 5);
        sj_3.add("OOP", 1);

        ListSubject sj_4 = new ListSubject();
        sj_4.add("Math", 3);
        sj_4.add("History", 3);
        sj_4.add("English", 3);

        //Students
        ListStudent st_1 = new ListStudent();
        st_1.add("Bob", sj_1);
        st_1.add("Anna", sj_2);

        ListStudent st_2 = new ListStudent();
        st_2.add("Dan", sj_3); //Dan
        st_2.add("Clifford", sj_4); //Clifford

        //Info
        ListInfo in_1 = new ListInfo();
        in_1.add("Math","21.04.22");
        in_1.add("English","21.04.22");
        in_1.add("OOP","22.04.22");
        in_1.add("History","22.04.22");
        in_1.add("Math","23.04.22");
        in_1.add("TIMC","23.04.22");

        ListInfo in_2 = new ListInfo();
        in_2.add("OOP","21.04.22");
        in_2.add("TIMC","21.04.22");
        in_2.add("History","22.04.22");
        in_2.add("English","22.04.22");
        in_2.add("Math","23.04.22");
        in_2.add("OOP","23.04.22");

        //Groups
        ListGroup gp_1 = new ListGroup();
        gp_1.add("IT-11", st_1, in_1);
        gp_1.add("IT-12", st_2, in_2);

        //Univer
        ListUniver un_1 = new ListUniver();
        un_1.add("LPNU", gp_1);

        un_1.addSubject("Geo", 1);
        un_1.addInfo("Geo", 1, "21.09.22");

        un_1.printRate();

        un_1.delRate("Bob", "Geo");
        un_1.changeRate("Anna", "Geo", 4);
        un_1.changeRate("Clifford", "History", 5);


        un_1.printRate();

        un_1.printSubject("History");
        un_1.printStud("Anna");
    }
}

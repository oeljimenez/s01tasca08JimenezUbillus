package it.academy.java.sprint1.tasca8.n1exercisi3;

import java.util.ArrayList;
import java.util.List;

public class Exercisi3 {

    public static void main(String[] args) {
        System.out.println("Tasca 08. Annotations (Spring1), Nivell 1, Exercisi 3");
        List<String> months = new ArrayList<>();
        months.add("Gener");
        months.add("Febrer");
        months.add("Març");
        months.add("Abril");
        months.add("Maig");
        months.add("June");
        months.add("Juliol");
        months.add("Agost");
        months.add("Setembre");
        months.add("October");
        months.add("Novembre");
        months.add("Desembre");

        months.stream().forEach(s -> System.out.println(s));
    }
}

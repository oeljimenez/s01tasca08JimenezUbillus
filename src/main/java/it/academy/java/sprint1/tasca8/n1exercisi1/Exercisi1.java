package it.academy.java.sprint1.tasca8.n1exercisi1;

import java.util.ArrayList;
import java.util.List;

public class Exercisi1 {

    public static void main(String[] args) {
        System.out.println("Tasca 08. Annotations (Spring1), Nivell 1, Exercisi 1");
        List<String> strings = new ArrayList<>();
        strings.add("test1");
        strings.add("gener");
        strings.add("nom");
        strings.add("ona");
        strings.add("mirrall");
        strings.add("juliol");

        strings.stream().filter(s -> s.contains("o")).forEach(System.out::println);
    }
}

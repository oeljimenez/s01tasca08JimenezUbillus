package it.academy.java.sprint1.tasca8.n1exercisi2;

import java.util.ArrayList;
import java.util.List;

public class Exercisi2 {

    public static void main(String[] args) {
        System.out.println("Tasca 08. Annotations (Spring1), Nivell 1, Exercisi 2");
        List<String> strings = new ArrayList<>();
        strings.add("test1");
        strings.add("marevellos");
        strings.add("gener");
        strings.add("nom");
        strings.add("americano");
        strings.add("ona");
        strings.add("mirrall");
        strings.add("juliol");

        strings.stream().filter(s -> s.contains("o") && s.length() > 5).forEach(System.out::println);
    }
}

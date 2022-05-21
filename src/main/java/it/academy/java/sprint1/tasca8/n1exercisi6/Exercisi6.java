package it.academy.java.sprint1.tasca8.n1exercisi6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercisi6 {

    public static void main(String[] args) {
        System.out.println("Tasca 08. Annotations (Spring1), Nivell 1, Exercisi 6");
        List<String> strings = new ArrayList<>();
        strings.add("124");
        strings.add("marevellos");
        strings.add("gener");
        strings.add("nom");
        strings.add("americano");
        strings.add("ona");
        strings.add("1");
        strings.add("11");
        strings.add("juliol");
        strings.add("vv");

        strings.sort(Comparator.comparingInt(String::length));

        strings.stream().forEach(System.out::println);
    }
}

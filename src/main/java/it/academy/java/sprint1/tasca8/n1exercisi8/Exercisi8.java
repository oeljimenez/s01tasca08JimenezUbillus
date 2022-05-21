package it.academy.java.sprint1.tasca8.n1exercisi8;


public class Exercisi8 {

    public static void main(String[] args) {
        System.out.println("Tasca 08. Annotations (Spring1), Nivell 1, Exercisi 8");
        FunctInterface functInterface =  x -> new StringBuilder(x).reverse().toString();
        System.out.println(functInterface.reverse("leo"));
    }
}

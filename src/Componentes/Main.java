package Componentes;

public class Main {
    public static void main(String[] args) {

        Deck Mazo = new Deck();

        System.out.println("EL DECK INICIA CON: " + Mazo.getSize() + " CARTAS");

        for (Card elemento : Mazo.getDeck()) {
            System.out.print(elemento + " / ");
        }
        System.out.println("\n");
        Mazo.suffle();
        System.out.println("\n");
        Mazo.head();
        System.out.println("\n");
        Mazo.pick();
        System.out.println("\n");
        Mazo.hand();

    }

}
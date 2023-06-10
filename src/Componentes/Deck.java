package Componentes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private final String[] paloD = {"Corazón", "Diamante", "Trébol", "Pica"};
    private final String[] colorD = {"Rojo", "Negro"};
    private final String[] valorD = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();

        for (int palo = 0; palo < 2; palo++) {
            for (int valor = 0; valor < valorD.length; valor++){
                deck.add(new Card(paloD[palo], colorD[0], valorD[valor]));

            }
        }

        for (int palo = 2; palo < 4; palo++){
            for (int valor = 0; valor < valorD.length; valor++){
                deck.add(new Card(paloD[palo], colorD[1], valorD[valor]));
            }
        }
    }

    public int getSize() {
        return deck.size();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void suffle() {
        Collections.shuffle(deck);
        System.out.println("SE MEZCLÓ EL DECK.");
        for (Card elemento : deck) {
            System.out.print(elemento + " / ");
        }
    }

    public void head(){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas");
    }


    public void pick() {
        Random aleatorio = new Random();
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public void hand() {
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
}

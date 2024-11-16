import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        cards.sort(new BySuitInValueOrder());
    }

    public int compareTo(Hand comparable) {
        int thisHandValue = cards.stream().mapToInt(Card::getValue).sum();
        int otherHandValue = comparable.cards.stream().mapToInt(Card::getValue).sum();

        return Integer.compare(thisHandValue, otherHandValue);
    }


}

import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        return Integer.compare(c1.getSuit().ordinal(), c2.getSuit().ordinal());
    }
}

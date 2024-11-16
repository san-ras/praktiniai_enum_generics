import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int suitComparison = Integer.compare(c1.getSuit().ordinal(), c2.getSuit().ordinal());

        if (suitComparison == 0) {
            return Integer.compare(c1.getValue(), c2.getValue());
        }

        return suitComparison;
    }
}

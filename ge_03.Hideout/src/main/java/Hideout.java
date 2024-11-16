import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {

    private List<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putInHideout(T toHide) {
        hideout.add(toHide);
    }

    public T takeFromHideout() {

        if (hideout.isEmpty()) {
            return null;
        } else {
            T toReturn = hideout.get(hideout.size() - 1);
            hideout.remove(toReturn);
            return toReturn;
        }
    }

    public boolean isInHideout() {
        return !hideout.isEmpty();
    }

    public void printHideout() {
        hideout.forEach(System.out::println);
    }
}

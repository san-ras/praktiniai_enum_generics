import java.util.LinkedList;

public class Pipe<T> {


    private LinkedList<T> list;

    public Pipe() {
        this.list = new LinkedList<T>();
    }

    public void putIntoPipe(T value) {
        list.add(value);
    }

    public T takeFromPipe() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.pollFirst();
        }
    }

    public boolean isInPipe() {
        return !list.isEmpty();
    }

    public void print() {
        list.forEach(System.out::println);
    }

}

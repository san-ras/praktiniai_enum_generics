public class Program {

    public static void main(String[] args) {
        Pipe<Integer> integerPipe = new Pipe<>();

        integerPipe.putIntoPipe(1);
        integerPipe.putIntoPipe(2);
        integerPipe.putIntoPipe(3);
        integerPipe.putIntoPipe(4);

        System.out.println("Items in the pipe:");
        integerPipe.print();

        System.out.println("\nTaking items from the pipe:");
        System.out.println("Taking item: " + integerPipe.takeFromPipe());
        System.out.println("Taking item: " + integerPipe.takeFromPipe());
        System.out.println("Taking item: " + integerPipe.takeFromPipe());

        System.out.println("\nIs the pipe empty? " + integerPipe.isInPipe());
        integerPipe.print();

        System.out.println("Taking item: " + integerPipe.takeFromPipe());

        System.out.println("\nTrying to take from an empty pipe: " + integerPipe.takeFromPipe());

        integerPipe.putIntoPipe(5);
        integerPipe.putIntoPipe(6);

        System.out.println("\nItems in the pipe after adding more:");
        integerPipe.print();
    }
}

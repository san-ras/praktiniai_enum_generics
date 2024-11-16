import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Hideout<String> stringHideout = new Hideout<>();

        stringHideout.putInHideout("Hello");
        stringHideout.putInHideout("World");
        stringHideout.printHideout();

        System.out.println("Taking from hideout: " + stringHideout.takeFromHideout());
        stringHideout.printHideout();

        System.out.println("Is anything left? " + stringHideout.isInHideout());

        System.out.println("Taking from hideout: " + stringHideout.takeFromHideout());
        System.out.println("Is anything left? " + stringHideout.isInHideout());

        System.out.println();
        System.out.println("Testing Hideout with Integers:");
        Hideout<Integer> integerHideout = new Hideout<>();

        integerHideout.putInHideout(10);
        integerHideout.putInHideout(20);
        integerHideout.putInHideout(30);
        integerHideout.printHideout();

        System.out.println("Taking from hideout: " + integerHideout.takeFromHideout());
        integerHideout.printHideout();

        System.out.println("Is anything left? " + integerHideout.isInHideout());

        System.out.println("Taking from hideout: " + integerHideout.takeFromHideout());
        System.out.println("Taking from hideout: " + integerHideout.takeFromHideout());
        System.out.println("Is anything left? " + integerHideout.isInHideout());
    }

    }


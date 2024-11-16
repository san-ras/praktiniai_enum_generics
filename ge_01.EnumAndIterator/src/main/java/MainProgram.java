public class MainProgram {

    public static void main(String[] args) {

        Employees td = new Employees();
        Person h = new Person("Arto", Education.PHD);
        td.add(h);
        td.fire(Education.PHD);
        td.print();

        Employees t = new Employees();
        h = new Person("Arto", Education.PHD);
        t.add(h);
        h = new Person("Pekka", Education.BA);
        t.add(h);
        t.fire(Education.PHD);
        t.print();

    }
}

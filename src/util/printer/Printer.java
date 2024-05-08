package util.printer;

public class Printer {

    public static void print(Printable object) {
        object.getPrintableInformations().forEach(System.out::println);
    }
}

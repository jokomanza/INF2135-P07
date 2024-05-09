package util.printer;

public class Printer {

    public static void print(Printable object) {
        print(object.getPrintableInformation(), 0);
    }

    private static void print(Information information, int indentation) {
        for (int i = 0; i < indentation; i++) {
            System.out.print("    ");
        }
        System.out.println("- " + information.getContent());
        for (Information subInformation : information.getSubInformations()) {
            print(subInformation, indentation + 1);
        }
    }
}

package Class13;

public class MethodTester {
    public static void main(String[] args) {
    Printer printer= new Printer();
    printer.printSomething();
    printer.printSomething();

    printer.printWord("Darko");// word is replace automatically by Java
        printer.printWord("Artem Lean");

       // printer.printWordManyTimes("Lean", 10);
    }
}

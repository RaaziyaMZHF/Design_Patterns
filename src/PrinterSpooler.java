public class PrinterSpooler {
    private static PrinterSpooler instance;

    private PrinterSpooler() {

    }

    public static synchronized PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}
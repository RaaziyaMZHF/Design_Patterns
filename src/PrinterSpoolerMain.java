public class PrinterSpoolerMain {
    public static void main(String[] args) {
        PrinterSpooler spooler1 = PrinterSpooler.getInstance();
        PrinterSpooler spooler2 = PrinterSpooler.getInstance();

        spooler1.print("Document1.pdf");
        spooler2.print("Document2.pdf");
    }
}
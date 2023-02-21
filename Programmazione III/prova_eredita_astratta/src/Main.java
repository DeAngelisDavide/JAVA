public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Gianfranco", "Rossi", 32, 4);
        Impiegato imp = new Impiegato("Piero", "Bianchi", 22, "Cassiere");
        cli.showInfo();
        imp.showInfo();
    }
}
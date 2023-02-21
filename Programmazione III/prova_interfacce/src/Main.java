public class Main {
    public static void main(String[] args) {
        ereditaMultipla ere = new ereditaMultipla("Gisnni", "Scala");

        //Metodi riscritti perchè astratti
        ere.stampaNome();
        ere.stampaCognome();
        //I metodi vengono ereditati e sono pubblici
        ere.welcomeMessagge();
        ere.welcomeMessagge2();
        //Ai metodi statici bisogna accedere riferendosi all'interfaccia
        //Non ci sta bisogno di ereditare l'interfaccia per usarli
        primaInterfaccia.metodoStatico();
    }
}
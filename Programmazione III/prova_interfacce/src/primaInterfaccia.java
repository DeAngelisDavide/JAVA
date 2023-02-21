public interface primaInterfaccia{

    String welcome = "Benvenuto nella prima interfaccia";
    default void welcomeMessagge(){
        System.out.println(welcome);
    }

    void stampaNome();

    static void metodoStatico(){
        System.out.println("Sei nel metodo statico\n");
    }
}

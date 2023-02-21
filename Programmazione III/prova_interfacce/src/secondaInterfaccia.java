public interface secondaInterfaccia {
    String welcome2 = "Benvenuto nella seconda interfaccia";

    default void welcomeMessagge2(){
        System.out.println(welcome2);
    }

    void stampaCognome();
}

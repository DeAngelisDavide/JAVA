public abstract class Persona{

    String nome;
    String cognome;
    int eta;

    public Persona(String nome, String cognome, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public abstract void showInfo();

}

public abstract class  Persona {
    private final String nome;
    private final String cognome;
    private final int eta;

    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String toString(){
        return "Nome: "+nome+"\nCognome: "+cognome+ "\nEta': "+String.valueOf(eta);
    }

    public abstract void impegni();
}

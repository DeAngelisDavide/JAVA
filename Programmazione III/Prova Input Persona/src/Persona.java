/**
Classe che definisce una persona
 @author davide
 */
public class Persona {

    private final String nome;
    private final String cognome;
    private int eta;

    /**
     *
     * @param nome Nome della persona
     * @param cognome Cognome della persona
     * @param eta Eta' della persona
     */
    public Persona(String nome, String cognome, int eta){
        this.nome = nome; this.cognome = cognome; this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta(){
        return eta;
    }
}

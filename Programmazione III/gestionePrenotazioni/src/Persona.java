import java.util.Date;

public class Persona {
    String nome;
    String cognome;
    Date dataNascita;

    public Persona(String nome, String cognome, Date dataNascita)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nCognome: "+cognome+"\nData di nascita: "+ dataNascita.getYear()+"-"+dataNascita.getMonth()+"-"+dataNascita.getDate()+"\n";
    }
}

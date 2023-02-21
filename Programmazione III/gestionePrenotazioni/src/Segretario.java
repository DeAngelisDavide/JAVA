import java.util.Date;

public class Segretario extends Persona{
    private int anniDiLavoro;

    public Segretario(String nome, String cognome, Date dataNascita)
    {
        super(nome, cognome, dataNascita);
    }

    public Segretario(String nome, String cognome, Date dataNascita, int anniDiLavoro)
    {
        this(nome,cognome,dataNascita);
        this.anniDiLavoro = anniDiLavoro;
    }

    public String toString(){
        return super.toString() + "Anni di lavoro: "+anniDiLavoro+"\n";
    }


    public boolean effettuaPrenotazione(Agenda a){
        try{
            a.DecreaseePoistiDisponibili();
        }
        catch (noPostiException exc){
            return false;
        }
        return true;
    }

}

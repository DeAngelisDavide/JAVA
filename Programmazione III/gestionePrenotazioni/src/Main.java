import java.util.Date;

public class Main {
    public static void main(String [] args){
        Segretario seg = new Segretario("Piero", "Rossi", new Date(1999, 10, 26));
        Agenda ag = new Agenda();

        for (int i = 0; i< 6; i++)
            if(seg.effettuaPrenotazione(ag))
                 System.out.println("Prenotazione effettuata\n");
            else
             System.out.println("Prenotazione non effettuata\n");

        System.out.println("Prenotazioni gestite da: \n"+ seg);
    }
}

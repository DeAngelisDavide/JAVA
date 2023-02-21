public class Studente extends Persona {
    double mediaVoti;

    public Studente(String nome, String cognome, int eta, double mediaVoti){
        super(nome, cognome, eta);
        this.mediaVoti = mediaVoti;
    }

    public void impegni(){
        System.out.println("Il mio impegno e' studiare\n");
    }

    public String toString(){
        return super.toString() + "\nMedia voto: "+ mediaVoti;
    }
}

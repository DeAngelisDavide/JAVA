public  final class Impiegato extends Persona {
    String ruolo;

    public Impiegato(String nome, String cognome,int eta, String ruolo){
        super(nome, cognome, eta);
        this.ruolo = ruolo;
    }
    @Override
    //In questo caso si poteva fare un metodo che facesse il print dei metodi comuni e poi richiamarlo
    // in un metodo della sottoclasse che printasse la parte aggiuntiva. Ma vogliamo fare un esempio di metodo astratto
    public void showInfo(){
        System.out.println("Ciao! Sei "+nome+ " "+cognome + " di eta' "+eta + ". Sei un impiegato di ruolo "+ruolo);
    }
}

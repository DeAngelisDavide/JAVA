public final class Cliente extends Persona{
    int importanza;

    public Cliente(String nome, String cognome,int eta, int importanza)
    {
        super(nome, cognome, eta);
        this.importanza = importanza;
    }

    @Override
    //In questo caso si poteva fare un metodo che facesse il print dei metodi comuni e poi richiamarlo
    // in un metodo della sottoclasse che printasse la parte aggiuntiva. Ma vogliamo fare un esempio di metodo astratto
    public void showInfo(){
        System.out.println("Ciao! Sei "+nome+ " "+cognome + " di eta' "+eta + ". Sei un cliente valutato "+importanza);
    }
}

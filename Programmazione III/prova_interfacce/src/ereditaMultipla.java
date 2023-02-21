public final class  ereditaMultipla implements primaInterfaccia, secondaInterfaccia{
    private final String nome;
    private final String cognome;

    public ereditaMultipla(String nome, String cognome){
        this.nome = nome ; this.cognome = cognome;
    }

    @Override
    public void stampaNome(){
        System.out.println(nome + "\n");
    }

    public void stampaCognome(){
        System.out.println(cognome + "\n");
    }

}

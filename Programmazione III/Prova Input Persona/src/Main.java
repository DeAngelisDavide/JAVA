import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        Persona [] elenco = new Persona[3];
        Reader read = new Reader();
        String [] temp = new String[2];
        int tempEta;

        for (int i = 0; i < 3; ++i){
            System.out.println("Inserisci il nome:\n");
            temp[0] = read.readLine();
            System.out.println("Inserisci il cognome:\n");
            temp[1] = read.readLine();
            System.out.println("Inserisci l'eta':\n");
            tempEta = read.readInt();
            elenco[i] = new Persona(temp[0], temp[1], tempEta);
        }

        for ( Persona persona: elenco) {
            System.out.println("Ciao "+ persona.getNome() +" "+ persona.getCognome() +". Hai "+ persona.getEta() +" anni" );
        }


    }
}
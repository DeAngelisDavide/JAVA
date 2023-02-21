import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        String nome;
        System.out.println("Inserisci il nome:");
        try {
           nome = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String cognome;
        System.out.println("Inserisci il cognome:");
        try {
            cognome = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String eta;
        System.out.println("Inserisci l'eta':");
        try {
            eta = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Studente st1 = new Studente(nome, cognome, Integer.parseInt(eta), 7.8);
        System.out.println(st1);
        st1.impegni();
    }
}

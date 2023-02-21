import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Purse newPurse = new Purse();

        newPurse.addDimes();
        newPurse.addQuarter();

        System.out.println("Il saldo e': "+newPurse.getTotal()+"\n");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
       float value=0;
       try {
           value = Float.parseFloat(reader.readLine());
       }
       catch (IOException e){
           System.out.println("Errore nella lettura\n");
           System.exit(1);
       }

        System.out.println("Il numero di monete dello stesso valore inserito e': "+newPurse.count(value)+"\n");
    }
}
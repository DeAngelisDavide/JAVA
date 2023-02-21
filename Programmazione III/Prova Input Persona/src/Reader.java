import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* La classe mette a disposizione vari meotodo per la lettura da stdin.
 * Effettua anche apposite verifiche per eventuali eerrori.
 *
 */
public class Reader {


    BufferedReader read;
    InputStreamReader console = new InputStreamReader(System.in);
    public Reader(){
        read = new BufferedReader(console);
    }

    /**
     *
     * @return Ritorna la stringa letta
     */
    public String readLine(){
         String a = null;
        
        try {
            a = read.readLine();
        }catch (IOException e) {
            System.out.println("Errore nella lettura\n");
            System.exit(1);
        }
        return a;
    }

    public int readInt(){
        int a = Integer.MAX_VALUE;
        String s = null;

        try {
            s = read.readLine();
        }catch (IOException e){
            System.out.println("Errore nella lettura\n");
            System.exit(1);
        }

        try{
            a = Integer.parseInt(s);
        }catch(NumberFormatException e){
            System.out.println("Errore nella conversione in intero");
            System.exit(1);
        }
        return a;
    }

    public double readDouble(){
        double a = Double.MAX_VALUE;
        String s = null;

        try {
            s = read.readLine();
        }catch (IOException e){
            System.out.println("Errore nella lettura\n");
            System.exit(1);
        }

        try{
            a = Double.parseDouble(s);
        }catch(NumberFormatException e){
            System.out.println("Errore nella conversione in double");
            System.exit(1);
        }
        return a;
    }

}


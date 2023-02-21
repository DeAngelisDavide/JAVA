/*Creare una classe Purse (borsellino contenente
        monete) contenente i seguenti metodi
        add()
        getTotal()
        count (Coin)
       */
import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins = new ArrayList<Coin>();

    public void addQuarter(){
        coins.add(new Coin(0.25f));
    }

    public void addDimes(){
        coins.add(new Coin(0.1f));
    }

    public void addNickels(){
        coins.add(new Coin(0.50f));
    }

    public float getTotal(){
        float total = 0;
        for (int i = 0; i<coins.size(); i++)
            total += coins.get(i).getValue();

        return total;
    }

    public int count(float value)
    {
        int counter = 0;
        for (int i = 0; i<coins.size(); i++)
            if(coins.get(i).getValue() == value)
                counter++;

        return counter;
    }
}

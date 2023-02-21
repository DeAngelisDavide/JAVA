/**
 * Classe che gestisce un account bancario
 * @author Davide De Angelis
 * @version 1.0
 */
public class BankAccount {
    private float saldo;


    /**
     * withdraw@param saldo il saldo dell'account
     */
    public BankAccount(float saldo){
        this.saldo = saldo;
    }


    public BankAccount(){
        //Si poteva evitare in quanto di deafult viene impostato a zero
        this.saldo = 0;
    }

    /**
    @param amount cifra da depositare
    */
    public int deposit(float amount){
        if(amount > 0)
            saldo += amount;
        else
            return 1;
        return 0;
    }
    /**
    @param amount cifra da prelevare
     */
    public int withdraw(float amount){
        if(Math.abs(amount) <= saldo)
            saldo -= amount;
        else
            return 1;
        return 0;
    }

    public float getSaldo(){
        return saldo;
    }
}

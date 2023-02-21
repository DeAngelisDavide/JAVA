public class Purse {

    private float nickels;
    private float dimes;
    private float quarter ;

    //Costruttore evitabile perchè di default inizializzato a 0

    public void addNickels(int n){
        this.nickels += n;
    }
    public void addDimes(int n){this.dimes += n;}
    public void addQuarter(int n){this.quarter += n;}

    private double getTotal (){
        final float nickelsValue = 0.5f;
        final float dimesValue = 0.1f;
        final float quarterValue = 0.25f;
        return nickelsValue * this.nickels + dimesValue * this.dimes + quarterValue * this.quarter;
    }

    public void showSaldo(){ System.out.println("Il saldo complessivo e': "+getTotal()+ "\n");}
}

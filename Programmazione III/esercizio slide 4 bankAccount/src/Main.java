/*
Implementare una classe BankAccount che permette di gestire
un conto bancario contenente un saldo che può essere modificato
da depositi e prelievi
costruttore
metodo deposit per versare denaro nel conto bancario
metodo withdraw preleva denaro dal conto bancario
metodo getBalance ritorna il saldo attuale
 */

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount();
        System.out.println("Il saldo dell'account e': " + account.getSaldo() + "\n");
        if(account.deposit(34.6f) == 0)
            System.out.println("Operazione riuscita con successo, il saldo nell'account s' ora: " + account.getSaldo() + "\n");
        else
            System.out.println("Operazione non riuscita: la cifra inserita e' negativa \n");
        if(account.withdraw(36.6f) == 0)
            System.out.println("Operazione riuscita con successo, il saldo nell'account s' ora: " + account.getSaldo() + "\n");
        else
            System.out.println("Operazione non riuscita: fondi insufficienti \n");

        System.out.println("final 0  = "+ account.x + "\n");



    }

}
public class Main {
    public static void main(String[] args) {
        Purse one = new Purse();
        one.showSaldo();;
        one.addNickels(2);
        one.addQuarter(4);
        one.showSaldo();
    }
}
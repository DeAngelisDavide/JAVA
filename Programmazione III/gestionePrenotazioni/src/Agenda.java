public class Agenda {
    private int postiDisponibili;

    public Agenda(){
        this.postiDisponibili = 5;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void increasePoistiDisponibili(){
        this.postiDisponibili ++;
    }

    public void DecreaseePoistiDisponibili() throws noPostiException {
        if(postiDisponibili == 0)
            throw new noPostiException();
        this.postiDisponibili --;
    }
}

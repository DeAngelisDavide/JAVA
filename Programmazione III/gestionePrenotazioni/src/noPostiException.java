public class noPostiException extends Exception{

    public noPostiException(){
        super("I posti non sono più disponibili");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

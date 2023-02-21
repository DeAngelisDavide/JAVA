public class Coin {
    private final String type;
    private final float value;

    public Coin(float value)
    {
        this.value = value;
        if(this.value == 0.25)
            this.type = "quarter";
        else if (this.value == 0.50)
            this.type = "nickels";
        else this.type = "dimes";
    }

    public float getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}

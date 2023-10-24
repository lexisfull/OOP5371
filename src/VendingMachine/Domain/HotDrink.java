package VendingMachine.Domain;

public class HotDrink extends Product{

    int temperature;

    public HotDrink(String name, double price, int temperature) {
        super(name, price, new PrType("Coffee"));
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "; temperature = " + this.temperature;
    }
}

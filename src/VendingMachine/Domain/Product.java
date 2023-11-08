package VendingMachine.Domain;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private PrType type;

    public Product(String name, double price, PrType type) {
        this.name = name;
        this.type = type;
        setPrice(price);
    }

    public Product(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0 ){
            this.price = 10;
        }
        else {
            this.price = price;
        }
    }

    public PrType getType() {
        return type;
    }

    @Override
    public String toString() {
        if(this.price != 0 && this.type != null) {
            return ("\nProduct: price = " + this.price + "; type = " + this.type.getName() + "; name = " + this.name);
        }
        return ("\nProduct: name = " + this.name);
    }


    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice() - o.getPrice());
    }


}

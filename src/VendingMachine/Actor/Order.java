package VendingMachine.Actor;

import VendingMachine.Domain.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> products = new ArrayList<Product>();

    double sum = 0;
    boolean status = false;

    boolean payment = false;

    public Order(List<Product> products, double sum, boolean status, boolean payment) {
        this.products = products;
        this.sum = sum;
        this.status = status;
        this.payment = payment;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", sum=" + sum +
                ", status=" + status +
                ", payment=" + payment +
                '}';
    }
}

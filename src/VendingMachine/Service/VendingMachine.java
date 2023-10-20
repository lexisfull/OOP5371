package VendingMachine.Service;

import VendingMachine.Domain.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private CoinDispancer coinDispancer;
    private List<Product> products;

    public VendingMachine(Holder holder, CoinDispancer coinDispancer, List<Product> products) {
        this.holder = holder;
        this.coinDispancer = coinDispancer;
        this.products = products;
    }

    public Product byProduct(int index){
        return this.products.get(index);
    }
    public void release(){

    }
    public List<Product> getProductList(){
        return this.products;
    }
}

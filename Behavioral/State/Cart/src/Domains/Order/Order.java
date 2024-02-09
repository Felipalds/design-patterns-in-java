package Domains.Order;

import Domains.Product.Product;

import java.util.List;

public class Order {

    private OrderState state;
    private List<Product> productList;
    private String clientName;


    public void Order () {
        this.state = new OpenOrder();
    }

    public void finishOrder () {
       this.state.finishOrder();
    }

    public void deliverOrder() {
        this.state.deliverOrder();
    }

    public void cancelOrder() {
        this.state.cancelOrder();
    }


}

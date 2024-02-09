package Domains.Order;


public abstract class OrderState {


    protected Order order;

    public void OrderState(Order order) {
        this.order = order;
    }

    abstract void finishOrder();
    abstract void deliverOrder();
    abstract void cancelOrder();
}

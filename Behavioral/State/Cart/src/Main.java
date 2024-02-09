import Domains.Cart.Cart;
import Services.ProductService;

public class Main {

    public static ProductService productService;
    public static OrderService orderService;

    public static void main(String[] args) {
        productService = new ProductService();
        productService.listProducts();

    }
}
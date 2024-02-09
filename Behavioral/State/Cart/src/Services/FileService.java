package Services;

import Domains.Order.Order;
import Domains.Product.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileService {

    private final ObjectMapper objectMapper;
    String productFilePath = "Behavioral/State/Cart/src/Services/products.json";
    String orderFilePath = "Behavioral/State/Cart/src/Services/orders.json";

    public FileService () {
        objectMapper = new ObjectMapper();
    }

    public List<Product> readProducts() {

        try {
            return objectMapper.readValue(new File(productFilePath), new TypeReference<List<Product>>() {});

        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public List<Order> readOrders() {
        try {
            return objectMapper.readValue(new File(orderFilePath), new TypeReference<List<Order>>() {});
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public void saveProducts (List<Product> productList) {
        try {
            objectMapper.writeValue(new File(productFilePath), productList);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public void saveOrders (List<Order> orderList) {
        try {
            objectMapper.writeValue(new File(orderFilePath), orderList);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

}

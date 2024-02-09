package Services;

import Domains.Product.Product;

import java.util.List;

public class ProductService {


    public List<Product> productList;
    public FileService fileService;

    public ProductService () {
        fileService = new FileService();
    }


    public void listProducts () {
        this.productList = fileService.readProducts();
        for(Product product : productList) {
            System.out.printf("Name: %s --- Price: %f --- DPrice: %f\n", product.name, product.price, product.discountedPrice);
        }
    }

    public void addProduct() {

    }

    public void editProduct() {

    }

    public void removeProduct() {

    }



}

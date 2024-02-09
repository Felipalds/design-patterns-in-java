package Domains.Product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

    public Long id;
    public String name;
    public float price;
    public float discountedPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(float discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Product(
            @JsonProperty("name") String name,
            @JsonProperty("price") float price,
            @JsonProperty("discountedPrice") float discountedPrice
                   ) {
        this.name = name;
        this.price = price;
        this.discountedPrice = discountedPrice;
    }

}

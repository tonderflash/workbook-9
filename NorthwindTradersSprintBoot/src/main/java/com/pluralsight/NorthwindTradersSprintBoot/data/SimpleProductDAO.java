package com.pluralsight.NorthwindTradersSprintBoot.data;

import java.util.List;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import com.pluralsight.NorthwindTradersSprintBoot.models.Product;



@Component
public class SimpleProductDAO implements ProductDAO {

    private HashMap<Integer, Product> products = new HashMap<Integer, Product>();

    public SimpleProductDAO() {
        this.products.put(1, new Product(1, "Milk", "Dairy", 100));
        this.products.put(2, new Product(2, "Bread", "Bakery", 200));
        this.products.put(3, new Product(3, "Eggs", "Dairy", 300));
    }

    @Override
    public void addProduct(Product product) {
        this.products.put(product.getProductId(), product);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) this.products.values();
    }
}

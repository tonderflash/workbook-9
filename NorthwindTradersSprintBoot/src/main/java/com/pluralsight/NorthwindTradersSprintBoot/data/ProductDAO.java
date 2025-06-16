package com.pluralsight.NorthwindTradersSprintBoot.data;

import java.util.List;

import com.pluralsight.NorthwindTradersSprintBoot.models.Product;

public interface ProductDAO {
    void addProduct(Product product);
    List<Product> getAllProducts();


}

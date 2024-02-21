package model.product;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Products {

    private static final String SPACE = " ";

    private final Set<Product> products;

    public Products() {
        this.products = new HashSet<>();
    }

    public Set<Product> getProducts() {
        return Collections.unmodifiableSet(this.products);
    }

    public void addProducts(String[] productInputs) {
        for (String productInput : productInputs) {
            products.add(parseProduct(productInput));
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    private Product parseProduct(String input) {
        String[] values = input.split(SPACE);
        String name = values[0];
        int price = Integer.parseInt(values[1]);

        return new Product(name, price);
    }
}

package product;

import java.util.HashSet;
import java.util.Set;

public class Products {

    private final Set<Product> products;

    public Products() {
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

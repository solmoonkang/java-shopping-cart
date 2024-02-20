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

    public void showProducts() {
        System.out.println("고유한 상품 목록:");
        products.forEach(Product::printProductInfo);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}

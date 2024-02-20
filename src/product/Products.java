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
        for (Product product : products) {
            System.out.println(product.printProductInfo());
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}

package product;

import java.util.HashSet;
import java.util.Set;

public class Products {

    private final Set<Product> products;

    public Products() {
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        validateProductExistence(product);
        products.add(product);
    }

    public void showProduct() {
        System.out.println("고유한 상품 목록:");
        products.forEach(product -> System.out.println(product.printProductInfo()));
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    private void validateProductExistence(Product product) {
        boolean exist = products
                .stream()
                .anyMatch(p -> p.hasSameId(product) || p.hasSameName(product));

        if (exist) {
            throw new IllegalArgumentException("[ERROR] 해당 상품은 이미 존재하는 상품입니다.");
        }
    }
}

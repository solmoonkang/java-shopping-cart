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

    public Product findProduct(String productName) {
        return products.stream()
                .filter(product -> product.getName().equals(productName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 해당 상품이 존재하지 않습니다."));
    }

    public void addProducts(String[] productInputs) {
        for (String productInput : productInputs) {
            products.add(parseProductNameAndPrice(productInput));
        }
    }

    public void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equals(productName));
    }

    private Product parseProductNameAndPrice(String input) {
        String[] values = input.split(SPACE);
        validateProductInputFormat(values);
        validateProductPriceFormat(values[1]);
        return new Product(values[0], Integer.parseInt(values[1]));
    }

    private void validateProductInputFormat(String[] values) {
        if (values.length != 2) {
            throw new IllegalArgumentException("[ERROR] 잘못된 입력 형식입니다. 다시 입력해주세요.");
        }
    }

    private void validateProductPriceFormat(String price) {
        if (!price.matches("\\d+")) {
            throw new IllegalArgumentException("[ERROR] 잘못된 금액 형식입니다. 숫자를 입력해주세요.");
        }
    }
}

package product;

import java.util.Objects;

public class Product {

    private final Long id;
    private final String name;
    private final int price;

    public Product(Long id,
                   String name,
                   int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String printProductInfo() {
        return String.format("%d. %s : %d", id, name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;
        return id.equals(product.id) && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

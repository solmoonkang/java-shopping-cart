package model.product;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class Product {

    private static final AtomicLong count = new AtomicLong(0);
    private final Long id;
    private final String name;
    private final int price;

    public Product(String name,
                   int price) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.price = price;
    }

    // TODO: 해당 메서드를 Product 클래스에서 처리해줘야 하는지 고민해보자.
    public String printProductInfo() {
        return String.format("%s: %d", name, price);
    }

    public String printCartItemsInfo() {
        return String.format("%s", name);
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

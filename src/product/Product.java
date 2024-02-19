package product;

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
}

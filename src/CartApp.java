import product.Product;
import product.Products;

public class CartApp {
    public static void main(String[] args) {

        Product milk = new Product(1L, "Milk", 2000);
        Product bread = new Product(2L, "Bread", 1500);
        Product soup = new Product(3L, "Soup", 500);
        Product water = new Product(4L, "Water", 700);

        Products products = new Products();
        products.addProduct(milk);
        products.addProduct(bread);
        products.addProduct(soup);
        products.addProduct(water);

        products.showProducts();
    }
}
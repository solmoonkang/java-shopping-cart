import cart.Cart;
import product.Product;
import product.Products;

public class CartApp {
    public static void main(String[] args) {

        Product milk = new Product(1L, "Milk", 2000);
        Product bread = new Product(2L, "Bread", 1500);
        Product tissue = new Product(3L, "Tissue", 1200);
        Product water = new Product(4L, "Water", 700);

        Products products = new Products();
        products.addProduct(milk);
        products.addProduct(bread);
        products.addProduct(tissue);
        products.addProduct(water);

        products.removeProduct(water);

        products.showProduct();

        Cart cart = new Cart();
        cart.addProductToCart(milk, 2);
        cart.addProductToCart(milk, 4);
        cart.showCartItems();
    }
}
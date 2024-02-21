package model.cart;

import model.product.Product;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final Map<Product, Integer> cartItems;

    public Cart() {
        this.cartItems = new HashMap<>();
    }

    public Map<Product, Integer> getCartItems() {
        return Collections.unmodifiableMap(cartItems);
    }

    public void addProductToCart(Product product, int quantity) {
        increaseProductQuantityInCart(product, quantity);
    }

    public void removeProductToCart(Product product, int quantity) {
        checkQuantityExceeds(product, quantity);
        cartItems.put(product, cartItems.get(product) - quantity);
        removeIfEmpty(product);
    }

    private void increaseProductQuantityInCart(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            cartItems.put(product, cartItems.get(product) + quantity);
        } else {
            cartItems.put(product, quantity);
        }
    }

    private void checkQuantityExceeds(Product product, int quantity) {
        int currentQuantity = cartItems.get(product);

        if (currentQuantity == 0 || quantity > currentQuantity) {
            throw new IllegalArgumentException("[ERROR] 장바구니에 담긴 상품 수량보다 많습니다.");
        }
    }

    private void removeIfEmpty(Product product) {
        if (cartItems.get(product) == 0) {
            cartItems.remove(product);
        }
    }
}

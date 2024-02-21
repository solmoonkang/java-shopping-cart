package model.cart;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final Map<String, Integer> cartItems;

    public Cart() {
        this.cartItems = new HashMap<>();
    }

    public Map<String, Integer> getCartItems() {
        return Collections.unmodifiableMap(cartItems);
    }

    public void addProductToCart(String name, int quantity) {
        increaseProductQuantityInCart(name, quantity);
    }

    public void removeProductToCart(String name, int quantity) {
        cartItems.remove(name, quantity);
    }

    private void increaseProductQuantityInCart(String name, int quantity) {
        if (cartItems.containsKey(name)) {
            cartItems.put(name, cartItems.get(name) + quantity);
        } else {
            cartItems.put(name, quantity);
        }
    }
}

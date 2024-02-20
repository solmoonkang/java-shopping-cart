package cart;

import product.Product;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final Map<Product, Integer> cartItems;

    public Cart() {
        this.cartItems = new HashMap<>();
    }

    public void addProductToCart(Product product, int quantity) {
        increaseProductQuantityInCart(product, quantity);
    }

    public void showCartItems() {
        System.out.println("장바구니에 현재 담긴 상품: ");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println("Name: " + product.printCartItemsInfo() + ", Quantity: " + quantity);
        }
    }

    private void increaseProductQuantityInCart(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            cartItems.put(product, cartItems.get(product) + quantity);
        } else {
            cartItems.put(product, quantity);
        }
    }

    // TODO: 기존에 등록된 상품이 있을 경우에만 장바구니에 상품을 추가할 수 있도록 검증하는 메서드
    private void validateProductExistence(Product product) {
    }
}

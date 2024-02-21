package model.cart;

import model.product.Product;

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

    public void removeProductToCart(Product product, int quantity) {
        removeOrUpdateProductToCart(product, quantity);
    }

    // TODO: 제거하고 싶은 상품의 수량이 장바구니에 있는 수량보다 많을 경우, "장바구니에 상품이 충분하지 않다"는 메시지와 함께 다시 입력받도록 구현
    private void removeOrUpdateProductToCart(Product product, int quantity) {
        if (isRemovableQuantity(product, quantity)) {
            updateProduct(product, quantity);
        } else {
            System.out.println("장바구니에 상품이 충분하지 않습니다.");
        }
    }

    private boolean isRemovableQuantity(Product product, int quantity) {
        int currentQuantity = cartItems.getOrDefault(product, 0);
        return currentQuantity >= quantity;
    }

    private void updateProduct(Product product, int quantity) {
        int currentQuantity = cartItems.get(product);
        int newQuantity = currentQuantity - quantity;

        if (newQuantity == 0) {
            cartItems.remove(product);
        } else {
            cartItems.put(product, newQuantity);
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

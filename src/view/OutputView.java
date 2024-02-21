package view;

import model.cart.Cart;
import model.product.Product;
import model.product.Products;

import java.util.Map;

public class OutputView {

    public static void outputProducts(Products products) {
        System.out.println("고유한 상품 목록: \n");

        for (Product product : products.getProducts()) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }
        System.out.println();
    }

    public static void outputCartItems(Cart cart) {
        System.out.println("장바구니에 현재 담긴 상품: " + "\n");

        for (Map.Entry<String, Integer> entry : cart.getCartItems().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    public static void outputAddProductToCart(String name, int quantity) {
        System.out.println(name + " " + quantity + "개 담기");
    }

    public static void outputRemoveProductToCart(String name, int quantity) {
        System.out.println(name + " " + quantity + "개 빼기");
    }

    public static void outputInvalidInputError() {
        System.out.println("잘못된 형식입니다. 다시 입력해주세요.");
    }
}

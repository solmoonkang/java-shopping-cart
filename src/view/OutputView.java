package view;

import model.product.Product;
import model.product.Products;

public class OutputView {

    public static void outputProducts(Products products) {
        System.out.println("고유한 상품 목록:");

        for (Product product : products.getProducts()) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }
    }

    public static void outputCartItems() {
        System.out.println("장바구니에 현재 담긴 상품: ");
    }

    public static void outputAddProductToCart(Product product, int quantity) {
        System.out.println(product.getName() + " " + quantity + "개 담기");
    }

    public static void outputRemoveProductToCart(Product product, int quantity) {
        System.out.println(product.getName() + " " + quantity + "개 빼기");
    }
}

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
}

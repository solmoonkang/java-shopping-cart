package controller;

import model.product.Products;
import view.InputView;
import view.OutputView;

import java.io.IOException;

public class CartController {

    private static final String COMMA = ", ";
    private final InputView inputView;

    public CartController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() throws IOException {
        Products products = new Products();

        String productAction = inputView.handleProductAction();

        while (!(productAction.equals("종료"))) {
            if (productAction.equals("추가")) {
                createProduct(products);
            } else if (productAction.equals("제거")) {
                removeProduct(products);
            } else {
                System.out.println("잘못된 형식입니다. 다시 입력해주세요.");
            }

            productAction = inputView.handleProductAction();
        }

        OutputView.outputProducts(products);

        String cartAction = inputView.handleCartAction();

        while (!(cartAction.equals("종료"))) {
            if (cartAction.equals("추가")) {
                createProduct(products);
            } else if (cartAction.equals("제거")) {
                removeProduct(products);
            } else if (cartAction.equals("읽기")) {
                OutputView.outputCartItems();
            } else {
                System.out.println("잘못된 형식입니다. 다시 입력해주세요.");
            }

            cartAction = inputView.handleCartAction();
        }
    }


    private void createProduct(Products products) throws IOException {
        String[] productInputs = inputView.inputAddProduct().split(COMMA);
        products.addProducts(productInputs);
    }

    private void removeProduct(Products products) throws IOException {
        products.removeProduct(inputView.inputRemoveProduct());
    }
}

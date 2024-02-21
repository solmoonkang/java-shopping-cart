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
        String userAction = "";

        while (!(userAction = inputView.inputUserAction()).equals("종료")) {
            userActions(userAction, products);
        }
    }

    private void userActions(String userAction, Products products) throws IOException {
        if (userAction.equals("등록")) {
            createProduct(products);
        } else if (userAction.equals("제거")) {
            removeProduct(products);
        } else {
            System.out.println("잘못된 형식입니다. 다시 선택해주세요.");
        }
    }

    private void createProduct(Products products) throws IOException {
        String[] productInputs = inputView.inputAddProduct().split(COMMA);
        products.addProducts(productInputs);
        OutputView.outputProducts(products);
    }

    private void removeProduct(Products products) throws IOException {
        products.removeProduct(inputView.inputRemoveProduct());
    }
}

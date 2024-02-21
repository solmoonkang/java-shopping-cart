package controller;

import model.product.Products;
import view.InputView;
import view.OutputView;

import java.io.IOException;

public class CartController {

    private final InputView inputView;

    public CartController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() throws IOException {

        Products products = new Products();
        String[] productInputs = inputView.inputProduct().split(", ");
        products.addProducts(productInputs);

        OutputView.outputProducts(products);
    }
}

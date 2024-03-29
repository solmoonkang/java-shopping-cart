package controller;

import model.cart.Cart;
import model.product.Product;
import model.product.Products;
import view.InputView;
import view.OutputView;

import java.io.IOException;

public class CartController {

    private static final String COMMA = ", ";
    private static final String SPACE = " ";
    private static final String ACTION_EXIST = "종료";
    private static final String ACTION_ADD = "추가";
    private static final String ACTION_REMOVE = "제거";
    private static final String ACTION_READ = "읽기";
    private final InputView inputView;

    public CartController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() throws IOException {
        final Products products = new Products();
        final Cart cart = new Cart();

        String productAction = inputView.handleProductAction();

        while (!(productAction.equals(ACTION_EXIST))) {
            processProductAction(products, productAction);
            productAction = inputView.handleProductAction();
        }
        OutputView.outputProducts(products);

        String cartAction = inputView.handleCartAction();

        while (!(cartAction.equals(ACTION_EXIST))) {
            processCartAction(products, cart, cartAction);
            cartAction = inputView.handleCartAction();
        }
    }

    private void processProductAction(Products products, String productAction) throws IOException {
        if (productAction.equals(ACTION_ADD)) {
            addProduct(products);
        } else if (productAction.equals(ACTION_REMOVE)) {
            removeProduct(products);
        } else {
            OutputView.outputInvalidInputError();
        }
    }

    private void processCartAction(Products products, Cart cart, String cartAction) throws IOException {
        if (cartAction.equals(ACTION_READ)) {
            OutputView.outputCartItems(cart);
            return;
        }

        String actionText = cartAction.equals(ACTION_ADD) ? ACTION_ADD : ACTION_REMOVE;
        String userInput = inputView.inputAddProductToCart(actionText);
        String[] productsInfo = userInput.split(COMMA);
        processCartItems(products, cart, productsInfo, cartAction);
    }

    private void processCartItems(Products products, Cart cart, String[] productsInfo, String cartAction) {
        for (String productInfo : productsInfo) {
            String[] splitInput = productInfo.trim().split(SPACE);
            String productName = splitInput[0];
            int quantity = Integer.parseInt(splitInput[1]);

            if (cartAction.equals(ACTION_ADD)) {
                addProductToCart(products, cart, productName, quantity);
            } else if (cartAction.equals(ACTION_REMOVE)) {
                removeProductToCart(products, cart, productName, quantity);
            }
        }
    }

    private void addProduct(Products products) throws IOException {
        String[] productInputs = inputView.inputAddProduct().split(COMMA);
        products.addProducts(productInputs);
    }

    private void removeProduct(Products products) throws IOException {
        products.removeProduct(inputView.inputRemoveProduct());
    }

    private void addProductToCart(Products products, Cart cart, String productName, int quantity) {
        Product product = products.findProduct(productName);
        cart.addProductToCart(product, quantity);
        OutputView.outputAddProductToCart(productName, quantity);
    }

    private void removeProductToCart(Products products, Cart cart, String productName, int quantity) {
        Product product = products.findProduct(productName);
        cart.removeProductToCart(product, quantity);
        OutputView.outputRemoveProductToCart(productName, quantity);
    }
}

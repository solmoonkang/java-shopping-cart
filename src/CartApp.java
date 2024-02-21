import controller.CartController;
import view.InputView;

import java.io.IOException;

public class CartApp {
    public static void main(String[] args) throws IOException {

        CartController cartController = new CartController(new InputView());
        cartController.run();
    }
}
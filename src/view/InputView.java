package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private BufferedReader reader;

    public InputView() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String inputProduct() throws IOException {
        System.out.println("상품 이름과 상품 가격을 입력하세요(예: 상품이름,가격): ");
        return reader.readLine();
    }
}

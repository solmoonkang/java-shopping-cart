package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private BufferedReader reader;

    public InputView() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String inputUserAction() throws IOException {
        System.out.println("등록, 제거, 파일 읽기 중 어떤 동작을 수행하시겠습니까?");
        return reader.readLine();
    }

    public String inputAddProduct() throws IOException {
        System.out.println("추가하고 싶은 상품 이름과 상품 가격을 입력하세요.(예: 상품이름 가격): ");
        return reader.readLine();
    }

    public String inputRemoveProduct() throws IOException {
        System.out.println("제거하고 싶은 상품 이름을 입력하세요.");
        return reader.readLine();
    }

    public String inputAddProductToCart() throws IOException {
        System.out.println("장바구니에 추가하고 싶은 상품 이름과 수량을 입력하세요.(예: 상품 이름 수량): ");
        return reader.readLine();
    }
}

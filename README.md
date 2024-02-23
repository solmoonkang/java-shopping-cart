# 자바를 이용해서 Shopping Cart 구현하기 🛒

**'제대로 파는 자바'** 강의를 통해서 자바에 대해서 배웠습니다.
<br>
이 강의에서 배운 자바를 이용해서 쇼핑몰에서 자주 사용하는 기능인 ‘장바구니’ 기능을 자바로 구현합니다.

## 📊 요구 사항

### 장바구니 기능 구현하기

---

HashSet을 사용하여 상품 목록을 만들고, HashMap을 사용하여 장바구니에 상품을 담습니다.

구현하기 위해서는 다음과 같은 클래스가 필요합니다.

- **상품**
    - 상품의 KEY, 이름, 가격을 필드로 가지고 있습니다.
    - *`equals( )`* 및 *`hashCode( )`* 함수를 Override 해야 합니다. <br> HashSet을 사용할 때 중복된 상품이 상품 목록에 들어가지 않게 해당 함수들이 사용되어야 합니다.
<br>


- **장바구니:** 두 개 이상의 상품들을 담을 수 있어야 합니다. (EX. 우유 2개, 화장지 3개)
    - Items를 가지고 있습니다.
<br>


다음과 같은 함수를 가지고 있어야 합니다.
- *`showItems( )`*
- *`addProduct( )`*
- *`removeProduct( )`*

장바구니 애플리케이션은 다음과 같은 기능들을 제공해야 합니다.

1. 상품을 입력하여 상품 목록을 구성합니다.
2. 장바구니에 상품을 담습니다.
   - 이때, 상품을 몇 개 담을 것인지 또한 명시되어야 합니다. (EX. 우유 2개 담기, 사과 1개 담기)
3. 장바구니에서 상품을 제거합니다.
    - 이때, 몇 개의 상품을 뺄 것인지 명시되어야 합니다. (EX. 우유 1개 빼기)
4. 장바구니에 담겨있는 상품들의 이름과 수량을 출력해야 합니다.

## 📑 하위 과제

- **I / O 스트림을 사용하여 CSV 파일로부터 상품 목록을 불러올 수 있도록 장바구니 앱을 수정합니다.**

## 📂 결과물

---

- HashSet과 HashMap을 사용하여 위의 기능들을 탑재한 장바구니를 구현하고, 다음과 같은 코드에서 정상적으로 동작하게 구성합니다.

<br>

<figure>
    <figcaption style="color: darkgrey">상품 기능에 대한 결과</figcaption>
    <img width="637" alt="상품 기능" src="https://github.com/solmoonkang/java-shopping-cart/assets/109902582/47db1fed-68d6-4260-baab-0d9b02a87025">
</figure>

<br>

---

<figure>
    <figcaption style="color: darkgrey">장바구니 기능에 대한 결과</figcaption>
    <img width="648" alt="장바구니 기능" src="https://github.com/solmoonkang/java-shopping-cart/assets/109902582/eb0b1ccd-581b-482e-8a6f-7ba43c70897b">
</figure>

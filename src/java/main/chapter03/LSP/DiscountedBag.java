package chapter03.LSP;

public class DiscountedBag extends Bag {
    private double discountedRate = 0.2;

    public void setDiscountedRate(double discountedRate) {
        this.discountedRate = discountedRate;
    }

    public void applyDiscount(int price) {
        super.setPrice(price - (int) (discountedRate * price));
    }

    // 서브클래스는 슈퍼 클래스의 책임을 무시하거나 재정의하지 않고 확장만 수행해야한다.
//    public void setPrice(int price) {
//        super.setPrice(price - (int) (discountedRate * price));
//    }
}

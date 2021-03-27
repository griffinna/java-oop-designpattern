package chapter03.LSP;

public class Main {
    public static void main(String[] args) {
        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        bag1.setPrice(50000);
        System.out.println(bag1.getPrice());        // LSP output: 50000
        bag2.setPrice(bag1.getPrice());
        System.out.println(bag2.getPrice());        // LSP output: 50000

        DiscountedBag bag3 = new DiscountedBag();
        DiscountedBag bag4 = new DiscountedBag();
        bag3.setPrice(50000);
        System.out.println(bag3.getPrice());        // LSP output: 50000
        bag4.setPrice(bag3.getPrice());
        System.out.println(bag4.getPrice());        // LSP output: 50000
    }
}

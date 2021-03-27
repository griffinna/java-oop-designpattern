package chapter03.ISP;

public class Main {

    public static void main(String[] args) {

        // 범용 클래스
        Multifunction multifunction = new Multifunction();
        // printer
        multifunction.print();
        // fax
        multifunction.fax();
        // copy
        multifunction.copy();

    }
}

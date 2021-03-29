package chapter06;

public class Printer {

    private static Printer printer = null;
    private int counter = 0;

    private Printer() {}

    public static Printer getPrinter() {
        if (printer == null) {
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer = new Printer();    // Printer 인스턴스 생성
        }
        return printer;
    }

    public void print(String resource) {
        counter++;
        System.out.println(resource + counter);
    }

}

package chapter06;

public class Printer {

    // solution 1 : 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
    private static Printer printer = new Printer();

    private Printer() {}

    public static Printer getPrinter() {
//        if (printer == null) {
//            try{
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            printer = new Printer();    // Printer 인스턴스 생성
//        }
        return printer;
    }

    public void print(String resource) {
        System.out.println(resource);
    }

}

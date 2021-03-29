package chapter06;

// solution 2. 인스턴스를 만드는 메서드에 동기화
public class SyncPrinter {

    private static SyncPrinter printer = null;
    private int counter = 0;

    private SyncPrinter() {}

    public synchronized static SyncPrinter getPrinter() {
        if (printer == null) {
            printer = new SyncPrinter();
        }
        return printer;
    }

    public void print(String resource) {
        synchronized (this) {
            counter++;
            System.out.println(resource + counter);
        }
    }

}

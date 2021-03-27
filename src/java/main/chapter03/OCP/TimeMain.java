package chapter03.OCP;

public class TimeMain {
    public static void main(String[] args) {
        TimeReminder stubReminder = new TimeReminder();
        TimeProvider stubProvider = new FakeTimeProvider();
        stubProvider.setHours(23);
        stubReminder.setTimeProvider(stubProvider);

        stubReminder.reminder();
    }
}

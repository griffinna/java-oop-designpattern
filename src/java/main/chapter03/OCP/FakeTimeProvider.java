package chapter03.OCP;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider {

    private Calendar calendar;

    public FakeTimeProvider() {
        calendar = Calendar.getInstance();
    }

    public FakeTimeProvider(int hours) {
        calendar = Calendar.getInstance();
        setHours(hours);
    }

    @Override
    public void setHours(int hours) {
        calendar.set(Calendar.HOUR_OF_DAY, hours);  // 주어진 시간으로 시간 설정
    }

    @Override
    public int getTime() {
        return calendar.get(Calendar.HOUR_OF_DAY);  // 현재시간 반환
    }
}

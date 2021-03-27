package chapter03.OCP;

import java.util.Calendar;

public class TimeReminder {
    MP3 mp3 = new MP3();
    TimeProvider timeProvider;

    public void setTimeProvider(TimeProvider provider) {
        this.timeProvider = provider;   // 테스트 스텁이나 실제 시간을 제공하는 인스턴스를 주입
    }

    public void reminder() {
//        Calendar calendar = Calendar.getInstance();
//        mp3 = new MP3();
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        int hour = timeProvider.getTime();

        if (hour >= 22) {
            mp3.playSong();
        }
    }
}

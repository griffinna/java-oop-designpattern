package chapter03.OCP;

import java.util.Calendar;

public class TimeReminder {
    private MP3 mp3;

    public void reminder() {
        Calendar calendar = Calendar.getInstance();
        mp3 = new MP3();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour >= 22) {
            mp3.playSong();
        }
    }
}

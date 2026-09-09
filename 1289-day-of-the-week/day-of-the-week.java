import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date1 = LocalDate.of(1971, 1, 1);
        LocalDate date2 = LocalDate.of(year, month, day);
        long gap = ChronoUnit.DAYS.between(date1, date2);
        String[] days = { "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" };
        int i = (int)(gap % 7);

        return days[i];
    }
}
import java.util.Calendar;

public class Java_Date_and_Time {
    public static void main(String[] args) {
        // Example: Find the day for 15th August 1947
        int month = 8;
        int day = 16;
        int year = 1947;

        String result = findDay(month, day, year);
        System.out.println("The day of the week is: " + result);
    }

    public static String findDay(int month, int day, int year) {
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);  // Month is zero-based
        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}

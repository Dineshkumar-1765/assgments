package Assignment;
import java.util.Scanner;

public class WeekDayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-7) to get the corresponding weekday: ");
        int dayNumber = sc.nextInt();
        sc.close();

        try {
            WeekDay day = WeekDay.getDay(dayNumber);
            System.out.println("The day is: " + day);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

enum WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static WeekDay getDay(int dayNumber) {
        if (dayNumber < 1 || dayNumber > 7) {
            throw new IllegalArgumentException("Invalid day number. Enter a number between 1 and 7.");
        }
        return WeekDay.values()[dayNumber - 1];
    }
}

package zadanie_7_1;

public class CalandarConverter {

    public static String convertDayToString(int dayNumber) {
        String dayOfWeek;
        final int MONDAY = 1;
        final int TUESDAY = 2;
        final int WEDNESDAY = 3;
        final int THURSDAY = 4;
        final int FRIDAY = 5;
        final int SATURDAY = 6;
        final int SUNDAY = 7;

        switch (dayNumber) {
            case MONDAY:
                dayOfWeek = "poniedziałek";
                break;
            case TUESDAY:
                dayOfWeek = "wtorek";
                break;
            case WEDNESDAY:
                dayOfWeek = "środa";
                break;
            case THURSDAY:
                dayOfWeek = "czwartek";
                break;
            case FRIDAY:
                dayOfWeek = "piątek";
                break;
            case SATURDAY:
                dayOfWeek = "sobota";
                break;
            case SUNDAY:
                dayOfWeek = "niedziala";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        return dayOfWeek;
    }
}

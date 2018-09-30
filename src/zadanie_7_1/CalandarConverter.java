package zadanie_7_1;

 public class CalandarConverter {

     final static int MONDAY = 1;
     final static int TUESDAY = 2;
     final static int WEDNESDAY = 3;
     final static int THURSDAY = 4;
     final static int FRIDAY = 5;
     final static int SATURDAY = 6;
     final static int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String dayOfWeek;


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

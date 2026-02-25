import java.util.Calendar;

public class CalendarDay {

    public String findDay(int month, int day, int year){

        var cal = Calendar.getInstance();

        switch(month) {
            case 1:
                cal.set(year,Calendar.JANUARY,day);
                break;
            case 2:
                cal.set(year,Calendar.FEBRUARY,day);
                break;
            case 3:
                cal.set(year,Calendar.MARCH,day);
                break;
            case 4:
                cal.set(year,Calendar.APRIL,day);
                break;
            case 5:
                cal.set(year,Calendar.MAY,day);
                break;
            case 6:
                cal.set(year,Calendar.JUNE,day);
                break;
            case 7:
                cal.set(year,Calendar.JULY,day);
                break;
            case 8:
                cal.set(year,Calendar.AUGUST,day);
                break;
            case 9:
                cal.set(year,Calendar.SEPTEMBER,day);
                break;
            case 10:
                cal.set(year,Calendar.OCTOBER,day);
                break;
            case 11:
                cal.set(year,Calendar.NOVEMBER,day);
                break;
            case 12:
                cal.set(year,Calendar.DECEMBER,day);
                break;
        }

        String s = switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> "SUNDAY";
            case 2 -> "MONDAY";
            case 3 -> "TUESDAY";
            case 4 -> "WEDNESDAY";
            case 5 -> "THURSDAY";
            case 6 -> "FRIDAY";
            case 7 -> "SATURDAY";
            default -> "";
        };

        return s;

    }

}
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalendarDay {

    CalendarDay cal = new CalendarDay();

    @Test
    public void testSegunda() {
        assertEquals("MONDAY", cal.findDay(1, 1, 2024));
    }

    @Test
    public void testDomingo() {
        assertEquals("SUNDAY", cal.findDay(6, 2, 2024));
    }

    @Test
    public void testSexta() {
        assertEquals("FRIDAY", cal.findDay(5, 17, 2024));
    }

    @Test
    public void testSabado() {
        assertEquals("SATURDAY", cal.findDay(8, 10, 2024));
    }
}

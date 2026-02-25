import org.junit.Test;
import static org.junit.Assert.*;

public class TestHourlyEmployee {

    private Date dataNascimento = new Date(7, 12, 1988);

    @Test
    public void testCriarHourlyEmployee() {
        HourlyEmployee emp = new HourlyEmployee("Clara", "Martins", "202-20-2020", dataNascimento, 20.0, 40.0);
        assertEquals("Clara", emp.getFirstName());
        assertEquals(20.0, emp.getWage(), 0.0);
        assertEquals(40.0, emp.getHours(), 0.0);
    }

    @Test
    public void testGetPaymentAmountSemHoraExtra() {
        HourlyEmployee emp = new HourlyEmployee("Diego", "Pires", "303-30-3030", dataNascimento, 10.0, 30.0);
        assertEquals(300.0, emp.getPaymentAmount(), 0.0);
    }

    @Test
    public void testGetPaymentAmountComHoraExtra() {
        HourlyEmployee emp = new HourlyEmployee("Elena", "Nunes", "404-40-4040", dataNascimento, 10.0, 50.0);
        assertEquals(40 * 10.0 + 10 * 10.0 * 1.5, emp.getPaymentAmount(), 0.0);
    }

    @Test
    public void testSetWage() {
        HourlyEmployee emp = new HourlyEmployee("Felipe", "Castro", "505-50-5050", dataNascimento, 15.0, 40.0);
        emp.setWage(18.0);
        assertEquals(18.0, emp.getWage(), 0.0);
    }

    @Test
    public void testSetHours() {
        HourlyEmployee emp = new HourlyEmployee("Giulia", "Lopes", "606-60-6060", dataNascimento, 12.0, 35.0);
        emp.setHours(45.0);
        assertEquals(45.0, emp.getHours(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWageNegativoNoConstrutor() {
        new HourlyEmployee("A", "B", "111-11-1111", dataNascimento, -5.0, 40.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHorasAcimaDe168NoConstrutor() {
        new HourlyEmployee("A", "B", "111-11-1111", dataNascimento, 10.0, 200.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWageZero() {
        HourlyEmployee emp = new HourlyEmployee("A", "B", "111-11-1111", dataNascimento, 10.0, 40.0);
        emp.setWage(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHoursInvalida() {
        HourlyEmployee emp = new HourlyEmployee("A", "B", "111-11-1111", dataNascimento, 10.0, 40.0);
        emp.setHours(168.0);
    }
}

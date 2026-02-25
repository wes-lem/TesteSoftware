import org.junit.Test;
import static org.junit.Assert.*;

public class TestSalariedEmployee {

    private Date dataNascimento = new Date(10, 5, 1990);

    @Test
    public void testCriarSalariedEmployee() {
        SalariedEmployee emp = new SalariedEmployee("João", "Silva", "111-11-1111", dataNascimento, 1000.0);
        assertEquals("João", emp.getFirstName());
        assertEquals("Silva", emp.getLastName());
        assertEquals("111-11-1111", emp.getSocialSecurityNumber());
        assertEquals(1000.0, emp.getWeeklySalary(), 0.0);
    }

    @Test
    public void testGetPaymentAmount() {
        SalariedEmployee emp = new SalariedEmployee("Maria", "Santos", "222-22-2222", dataNascimento, 500.0);
        assertEquals(500.0, emp.getPaymentAmount(), 0.0);
    }

    @Test
    public void testSetWeeklySalary() {
        SalariedEmployee emp = new SalariedEmployee("Pedro", "Costa", "333-33-3333", dataNascimento, 800.0);
        emp.setWeeklySalary(1200.0);
        assertEquals(1200.0, emp.getWeeklySalary(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSalarioSemanalNegativoNoConstrutor() {
        new SalariedEmployee("A", "B", "111-11-1111", dataNascimento, -100.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWeeklySalaryNegativo() {
        SalariedEmployee emp = new SalariedEmployee("A", "B", "111-11-1111", dataNascimento, 100.0);
        emp.setWeeklySalary(-50.0);
    }
}

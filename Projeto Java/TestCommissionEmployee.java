import org.junit.Test;
import static org.junit.Assert.*;

public class TestCommissionEmployee {

    private Date dataNascimento = new Date(1, 15, 1985);

    @Test
    public void testCriarCommissionEmployee() {
        CommissionEmployee emp = new CommissionEmployee("Ana", "Lima", "444-44-4444", dataNascimento, 5000.0, 0.10);
        assertEquals("Ana", emp.getFirstName());
        assertEquals(5000.0, emp.getGrossSales(), 0.0);
        assertEquals(0.10, emp.getCommissionRate(), 0.0);
    }

    @Test
    public void testGetPaymentAmount() {
        CommissionEmployee emp = new CommissionEmployee("Carlos", "Souza", "555-55-5555", dataNascimento, 10000.0, 0.06);
        assertEquals(600.0, emp.getPaymentAmount(), 0.01);
    }

    @Test
    public void testSetGrossSales() {
        CommissionEmployee emp = new CommissionEmployee("Luiz", "Oliveira", "666-66-6666", dataNascimento, 1000.0, 0.05);
        emp.setGrossSales(2000.0);
        assertEquals(2000.0, emp.getGrossSales(), 0.0);
    }

    @Test
    public void testSetCommissionRate() {
        CommissionEmployee emp = new CommissionEmployee("Paula", "Rocha", "777-77-7777", dataNascimento, 3000.0, 0.08);
        emp.setCommissionRate(0.12);
        assertEquals(0.12, emp.getCommissionRate(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGrossSalesNegativoNoConstrutor() {
        new CommissionEmployee("A", "B", "111-11-1111", dataNascimento, -100.0, 0.05);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCommissionRateInvalidaNoConstrutor() {
        new CommissionEmployee("A", "B", "111-11-1111", dataNascimento, 1000.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGrossSalesNegativo() {
        CommissionEmployee emp = new CommissionEmployee("A", "B", "111-11-1111", dataNascimento, 100.0, 0.05);
        emp.setGrossSales(-1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCommissionRateInvalida() {
        CommissionEmployee emp = new CommissionEmployee("A", "B", "111-11-1111", dataNascimento, 100.0, 0.05);
        emp.setCommissionRate(1.5);
    }
}

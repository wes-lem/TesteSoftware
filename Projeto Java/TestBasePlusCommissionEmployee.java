import org.junit.Test;
import static org.junit.Assert.*;

public class TestBasePlusCommissionEmployee {

    private Date dataNascimento = new Date(5, 20, 1992);

    @Test
    public void testCriarBasePlusCommissionEmployee() {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Bruno", "Ferreira", "888-88-8888", dataNascimento, 0.04, 5000.0, 300.0);
        assertEquals("Bruno", emp.getFirstName());
        assertEquals(5000.0, emp.getGrossSales(), 0.0);
        assertEquals(0.04, emp.getCommissionRate(), 0.0);
        assertEquals(300.0, emp.getBaseSalary(), 0.0);
    }

    @Test
    public void testGetPaymentAmount() {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Fernanda", "Mendes", "999-99-9999", dataNascimento, 0.06, 10000.0, 500.0);
        assertEquals(500.0 + 600.0, emp.getPaymentAmount(), 0.01);
    }

    @Test
    public void testSetBaseSalary() {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Ricardo", "Alves", "101-10-1010", dataNascimento, 0.05, 3000.0, 200.0);
        emp.setBaseSalary(400.0);
        assertEquals(400.0, emp.getBaseSalary(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseSalaryNegativoNoConstrutor() {
        new BasePlusCommissionEmployee("A", "B", "111-11-1111", dataNascimento, 0.05, 1000.0, -100.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSalaryNegativo() {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("A", "B", "111-11-1111", dataNascimento, 0.05, 1000.0, 100.0);
        emp.setBaseSalary(-50.0);
    }
}

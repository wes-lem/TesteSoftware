import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails{
    EmployeeDetails employee = new EmployeeDetails();

    @Test
    public void testSetNome(){
        String expected = "Weslem";
        employee.setNome(expected);
        assertEquals(expected, employee.getNome());
    }

    @Test
    public void testSetSalarioMensal(){
        double expected = 8000;
        employee.setSalarioMensal(expected);
        assertEquals(expected, employee.getSalarioMensal(), 0.0);
    }

    @Test
    public void testCalcularSalarioAnual(){
        double salarioMensal = 10000;
        double expected = 12 * salarioMensal;
        employee.setSalarioMensal(salarioMensal);
        assertEquals(expected, employee.calcularSalarioAnual(), 0.0);
    }

    @Test
    public void testTaxa(){
        double salarioMensal = 10000;
        double expected = 0.1 * 12 * salarioMensal;
        employee.setSalarioMensal(salarioMensal);
        assertEquals(expected, employee.calcularTaxa(), 0.1);
    }
}
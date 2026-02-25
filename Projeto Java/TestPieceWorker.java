import org.junit.Test;
import static org.junit.Assert.*;

public class TestPieceWorker {

    private Date dataNascimento = new Date(9, 3, 1995);

    @Test
    public void testCriarPieceWorker() {
        PieceWorker emp = new PieceWorker("Helena", "Dias", "707-70-7070", dataNascimento, 5.0, 100);
        assertEquals("Helena", emp.getFirstName());
        assertEquals(5.0, emp.getWage(), 0.0);
        assertEquals(100, emp.getPieces());
    }

    @Test
    public void testGetPaymentAmount() {
        PieceWorker emp = new PieceWorker("Igor", "Ribeiro", "808-80-8080", dataNascimento, 10.0, 50);
        assertEquals(500.0, emp.getPaymentAmount(), 0.0);
    }

    @Test
    public void testSetWage() {
        PieceWorker emp = new PieceWorker("Julia", "Campos", "909-90-9090", dataNascimento, 3.0, 80);
        emp.setWage(4.0);
        assertEquals(4.0, emp.getWage(), 0.0);
    }

    @Test
    public void testSetPieces() {
        PieceWorker emp = new PieceWorker("Kevin", "Araujo", "110-11-0110", dataNascimento, 2.0, 10);
        emp.setPieces(25);
        assertEquals(25, emp.getPieces());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWageNegativoNoConstrutor() {
        new PieceWorker("A", "B", "111-11-1111", dataNascimento, -1.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPiecesNegativoNoConstrutor() {
        new PieceWorker("A", "B", "111-11-1111", dataNascimento, 1.0, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWageNegativo() {
        PieceWorker emp = new PieceWorker("A", "B", "111-11-1111", dataNascimento, 1.0, 10);
        emp.setWage(-0.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPiecesNegativo() {
        PieceWorker emp = new PieceWorker("A", "B", "111-11-1111", dataNascimento, 1.0, 10);
        emp.setPieces(-1);
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDate {

    @Test
    public void testCriarDataValida() {
        Date d = new Date(6, 15, 2024);
        assertEquals(6, d.getMonth());
        assertEquals(15, d.getDay());
        assertEquals(2024, d.getYear());
    }

    @Test
    public void testToString() {
        Date d = new Date(3, 25, 2020);
        assertEquals("3/25/2020", d.toString());
    }

    @Test
    public void testDia29FevereiroBissexto() {
        Date d = new Date(2, 29, 2024);
        assertEquals(2, d.getMonth());
        assertEquals(29, d.getDay());
        assertEquals(2024, d.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMesInvalidoZero() {
        new Date(0, 1, 2024);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMesInvalidoMaiorQueDoze() {
        new Date(13, 1, 2024);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaInvalidoParaMes() {
        new Date(4, 32, 2024);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDia29FevereiroNaoBissexto() {
        new Date(2, 29, 2023);
    }
}

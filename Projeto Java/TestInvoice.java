import org.junit.Test;
import static org.junit.Assert.*;

public class TestInvoice {

    @Test
    public void testCriarFaturaValida() {
        Invoice inv = new Invoice("A1", "Parafuso", 10, 2.50);
        assertEquals("A1", inv.getPartNumber());
        assertEquals("Parafuso", inv.getPartDescription());
        assertEquals(10, inv.getQuantity());
        assertEquals(2.50, inv.getPricePerItem(), 0.0);
    }

    @Test
    public void testGetPaymentAmount() {
        Invoice inv = new Invoice("B2", "Porca", 5, 1.00);
        assertEquals(5.0, inv.getPaymentAmount(), 0.0);
    }

    @Test
    public void testSetQuantity() {
        Invoice inv = new Invoice("C3", "Arruela", 2, 0.50);
        inv.setQuantity(20);
        assertEquals(20, inv.getQuantity());
    }

    @Test
    public void testSetPricePerItem() {
        Invoice inv = new Invoice("D4", "Prego", 1, 1.00);
        inv.setPricePerItem(3.50);
        assertEquals(3.50, inv.getPricePerItem(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuantidadeNegativaNoConstrutor() {
        new Invoice("X", "Item", -1, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrecoNegativoNoConstrutor() {
        new Invoice("X", "Item", 1, -5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuantityNegativa() {
        Invoice inv = new Invoice("X", "Item", 1, 1.0);
        inv.setQuantity(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPricePerItemNegativo() {
        Invoice inv = new Invoice("X", "Item", 1, 1.0);
        inv.setPricePerItem(-1.0);
    }
}

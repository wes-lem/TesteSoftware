import static org.junit.Assert.*;
import org.junit.Test;

public class TestValidateIp {

    @Test
    public void testIpValida() {
        assertTrue(ValidateIP.validate("0.0.0.0"));
        assertTrue(ValidateIP.validate("255.255.255.255"));
        assertTrue(ValidateIP.validate("192.168.1.1"));
    }

    @Test
    public void testIpInvalida() {
        assertFalse(ValidateIP.validate("256.1.1.1"));
        assertFalse(ValidateIP.validate("1.2.3"));
        assertFalse(ValidateIP.validate("1.2.3.4.5"));
    }
}
